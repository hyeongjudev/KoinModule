package com.goldforest.koinproject.service


import com.goldforest.koinproject.pojo.BookData
import io.reactivex.Single
import retrofit2.http.*

interface RestService {

    @GET("new")
    fun getNewBooks(): Single<BookData>

}