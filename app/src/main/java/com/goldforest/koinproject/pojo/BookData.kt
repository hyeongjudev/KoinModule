package com.goldforest.koinproject.pojo

data class BookData(
    val books: List<Book>,
    val error: String,
    val total: String
)

data class Book(
    val image: String,
    val isbn13: String,
    val price: String,
    val subtitle: String,
    val title: String,
    val url: String
)