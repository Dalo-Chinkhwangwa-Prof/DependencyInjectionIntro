package com.coolcats.dependencyinjectioncats.util

import com.coolcats.MainApplication.Companion.appComponent
import javax.inject.Inject

class Car {

    @Inject
    lateinit var engine: Engine

    init {
        appComponent?.inject(this)
    }

    fun start(message: String) {

        engine.vroom(message)
    }

}