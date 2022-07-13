package ru.javersingleton.play_life.core.di

import dagger.MapKey
import kotlin.reflect.KClass

@MapKey
@Target(AnnotationTarget.FUNCTION)
annotation class DependenciesKey(val value: KClass<out Dependencies>)