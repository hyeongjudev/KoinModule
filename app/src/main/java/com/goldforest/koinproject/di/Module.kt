package com.goldforest.koinproject.di

import com.goldforest.koinproject.service.RestService
import com.goldforest.koinproject.viewmodel.MainViewModel
import okhttp3.OkHttpClient
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory


var retrofitModule = module {
    single<RestService> {
        Retrofit.Builder()
            .baseUrl("https://api.itbook.store/1.0/")
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .build()
            .create(RestService::class.java)
    }
}

var viewModelModule = module {

    viewModel {
        MainViewModel()
    }
}

var DiModule = listOf(viewModelModule, retrofitModule)

