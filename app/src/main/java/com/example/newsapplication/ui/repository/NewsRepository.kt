package com.example.newsapplication.ui.repository

import com.example.newsapplication.ui.api.RetrofitInstance
import com.example.newsapplication.ui.db.ArticleDatabase
import retrofit2.Retrofit
import retrofit2.http.Query

class NewsRepository(
    val db: ArticleDatabase
) {

    suspend fun getBreakingNews(countrycode: String, pageNumber: Int) =
        RetrofitInstance.api.getBreakingNews(countrycode, pageNumber)

    suspend fun searchNews(searchQuery: String, pageNumber: Int) =
        RetrofitInstance.api.searchForNews(searchQuery,pageNumber)
}