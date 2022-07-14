package ru.javersingleton.play_life.screen.project

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow

class ProjectFeature {

    private val _state = MutableStateFlow(
        State(
            title = ""
        )
    )
    val state: Flow<State> = _state

    fun sendEvent(event: Event) {

    }

    interface Event {

    }

    data class State(
        val title: String
    )

}
