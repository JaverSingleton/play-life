package ru.javersingleton.play_life.screen.project.redux

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.launch


abstract class Reducer<State, Event>(
    private val scope: CoroutineScope,
    private val defaultState: State,
    private val events: Flow<Pair<State, Any>>,
) {
    private val _state = MutableSharedFlow<State>()
    val state: Flow<State> = _state

    init {
        scope.launch {
            events.collect { (state, event) ->
                if (checkEvent(event)) {
                    val targetState = reduce(state, event as Event)
                    if (targetState != state) {
                        _state.tryEmit(targetState)
                    }
                }
            }
        }
    }

    protected abstract fun reduce(state: State, event: Event): State

    protected abstract fun checkEvent(event: Any): Boolean

}