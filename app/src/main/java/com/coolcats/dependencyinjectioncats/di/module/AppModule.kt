package com.coolcats.dependencyinjectioncats.di.module

import android.content.Context
import com.coolcats.dependencyinjectioncats.util.Engine
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

//1. Make the modules
@Module
class AppModule(private val context: Context) {
    @Provides
    @Singleton
    fun getToaster(): Engine = Engine(context)
}