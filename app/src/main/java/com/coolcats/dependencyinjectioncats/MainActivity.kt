package com.coolcats.dependencyinjectioncats

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.coolcats.dependencyinjectioncats.util.Car

class MainActivity : AppCompatActivity() {
    //Dagger2
    //Dagger-Hilt
    //Kotlin

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val benz = Car()
        benz.start("Vroom...vroom")
    }
}