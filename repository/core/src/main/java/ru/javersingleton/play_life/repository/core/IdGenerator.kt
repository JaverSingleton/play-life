package ru.javersingleton.play_life.repository.core

import java.util.*
import javax.inject.Inject

interface IdGenerator {
    fun generateId(key: String): String
}

class IdGeneratorImpl @Inject constructor(): IdGenerator {
    override fun generateId(key: String): String = "$key:${UUID.randomUUID()}"
}