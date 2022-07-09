package ru.javersingleton.play_life.di

import android.app.Activity
import androidx.fragment.app.Fragment

interface HasDependencies {
    val dependencies: Map<Class<out Dependencies>, @JvmSuppressWildcards Dependencies>
}

@Suppress("UNCHECKED_CAST")
fun <T : Dependencies> HasDependencies.getDependencies(clazz: Class<T>): T? =
    dependencies[clazz] as? T

inline fun <reified T : Dependencies> Activity.findDependencies(): T =
    findDependenciesInParent(T::class.java) ?: throw UnreachableDependenciesException(T::class.java)

inline fun <reified T : Dependencies> Fragment.findDependencies(): T =
    findDependenciesInParent(T::class.java) ?: throw UnreachableDependenciesException(T::class.java)

fun <T : Dependencies> Any.findDependenciesInParent(clazz: Class<T>): T? {
    val parent = when (this) {
        is Activity -> {
            (application as? HasDependencies)
        }
        is Fragment -> {
            (parentFragment ?: activity) as? HasDependencies
        }
        else -> null
    }

    return parent?.getDependencies(clazz) ?: parent?.findDependenciesInParent(clazz)
}