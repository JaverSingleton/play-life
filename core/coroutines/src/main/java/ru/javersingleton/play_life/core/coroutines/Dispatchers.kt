package ru.javersingleton.play_life.core.coroutines

import kotlinx.coroutines.CoroutineDispatcher
import javax.inject.Inject

interface Dispatchers {
    val io: CoroutineDispatcher
}

class AppDispatchers @Inject constructor(): Dispatchers {
    override val io: CoroutineDispatcher = kotlinx.coroutines.Dispatchers.IO
}