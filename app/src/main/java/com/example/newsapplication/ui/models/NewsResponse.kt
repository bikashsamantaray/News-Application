package com.example.newsapplication.ui.models

data class NewsResponse(
    val articles: List<Article>,
    val status: String,
    val totalResults: Int
)