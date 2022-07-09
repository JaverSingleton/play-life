package ru.javersingleton.play_life.di

class UnreachableDependenciesException(clazz: Class<out Dependencies>) :
    RuntimeException(
        "Unable to find ${clazz.canonicalName}, check if the parents implement these dependencies"
    )