package com.coolcats.dependencyinjectioncats.util

import android.content.Context
import android.widget.Toast
import javax.inject.Singleton

@Singleton
class Engine(private val context: Context) {
    fun vroom(bread: String){
        Toast.makeText(context, bread, Toast.LENGTH_LONG).show()
    }
}