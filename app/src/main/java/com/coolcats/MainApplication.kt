package com.coolcats

import android.app.Application
import com.coolcats.dependencyinjectioncats.di.component.ApplicationComponent
import com.coolcats.dependencyinjectioncats.di.component.DaggerApplicationComponent
import com.coolcats.dependencyinjectioncats.di.module.AppModule

class MainApplication : Application() {
    companion object {
        var appComponent: ApplicationComponent? = null
    }

    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerApplicationComponent.builder()
            .appModule(AppModule(this))
            .build()
    }

}