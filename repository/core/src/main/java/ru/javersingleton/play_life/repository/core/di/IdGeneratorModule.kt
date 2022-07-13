package ru.javersingleton.play_life.repository.core.di

import dagger.Binds
import dagger.Module
import ru.javersingleton.play_life.repository.core.IdGenerator
import ru.javersingleton.play_life.repository.core.IdGeneratorImpl
import javax.inject.Singleton

@Module
interface IdGeneratorModule {

    @Binds
    @Singleton
    fun bindIdGenerator(idGeneratorImpl: IdGeneratorImpl): IdGenerator

}