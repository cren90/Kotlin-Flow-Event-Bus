/**
 * Created by Chris Renfrow on 9/21/20.
 */

package com.cren90.eventbus

import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.filter
import kotlinx.coroutines.flow.map
import java.util.*

@ExperimentalCoroutinesApi
object EventBus {
    private val state = MutableStateFlow<Pair<Any, Calendar>>(Pair<Any, Calendar>(Any(), Calendar.getInstance()))

    fun post(event: Any) {
        state.value = Pair(event, Calendar.getInstance())
    }

    fun getEvents(includeCurrentValue: Boolean = false): Flow<Any> {
        val calendar = Calendar.getInstance()

        return state.filter { includeCurrentValue || !it.second.before(calendar) }.map { it.first }
    }
}