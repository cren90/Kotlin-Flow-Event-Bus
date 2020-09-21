package com.cren90.eventbus.app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.cren90.eventbus.EventBus
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        CoroutineScope(Dispatchers.IO).launch {
            EventBus.getEvents(false).collect { event ->
                when(event) {
                    is DoSomethingWhenResumed -> {
                        //Handle event here
                    }
                    else -> { }
                }
            }
        }
    }

    override fun onResume() {
        super.onResume()
        EventBus.post(DoSomethingWhenResumed())
    }
}