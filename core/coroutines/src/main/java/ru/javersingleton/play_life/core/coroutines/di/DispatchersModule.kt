package ru.javersingleton.play_life.core.coroutines.di

import dagger.Binds
import dagger.Module
import ru.javersingleton.play_life.core.coroutines.AppDispatchers
import ru.javersingleton.play_life.core.coroutines.Dispatchers
import javax.inject.Singleton

@Module
interface DispatchersModule {

    @Binds
    @Singleton
    fun bindDispatchers(dispatchers: AppDispatchers): Dispatchers

}