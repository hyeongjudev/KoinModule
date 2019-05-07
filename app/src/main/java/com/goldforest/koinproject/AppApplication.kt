package com.goldforest.koinproject

import android.app.Application
import com.goldforest.koinproject.di.appModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class AppApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@AppApplication)
            modules(appModule)
        }
    }

}