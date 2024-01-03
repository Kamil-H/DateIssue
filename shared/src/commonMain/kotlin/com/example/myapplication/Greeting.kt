package com.example.myapplication

import io.islandtime.Date
import io.islandtime.clock.now

class Greeting {
    fun greet(): String {
        println("Greet!")
        val now = Date.now()
        println("now: $now")
        return "Now, ${Date.now()}!"
    }
}