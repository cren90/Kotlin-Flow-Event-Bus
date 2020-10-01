/**
 * Created by Chris Renfrow on 9/21/20.
 */

package com.cren90.eventbus

import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.channels.BroadcastChannel
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.flow.*
import java.util.*

@ExperimentalCoroutinesApi
object EventBus {
    private val channel = BroadcastChannel<Pair<Any, Calendar>>(Channel.BUFFERED)

    fun post(event: Any) {
        channel.offer(Pair(event, Calendar.getInstance()))
    }

    fun getEvents(includeCurrentValue: Boolean = false): Flow<Any> {
        val calendar = Calendar.getInstance()

        return channel.asFlow().filter { includeCurrentValue || !it.second.before(calendar) }.map { it.first }
    }
}