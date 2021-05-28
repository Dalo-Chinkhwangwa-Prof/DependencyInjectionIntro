package com.coolcats.dependencyinjectioncats.di.component

import com.coolcats.dependencyinjectioncats.MainActivity
import com.coolcats.dependencyinjectioncats.di.module.AppModule
import com.coolcats.dependencyinjectioncats.util.Car
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [AppModule::class])
interface ApplicationComponent {
    fun inject(car: Car)
    fun inject(mainActivity: MainActivity)
}