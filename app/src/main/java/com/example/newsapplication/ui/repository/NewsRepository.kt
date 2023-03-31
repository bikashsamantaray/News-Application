package com.example.newsapplication.ui.repository

import com.example.newsapplication.ui.api.RetrofitInstance
import com.example.newsapplication.ui.db.ArticleDatabase
import com.example.newsapplication.ui.models.Article
import retrofit2.Retrofit
import retrofit2.http.Query

class NewsRepository(
    val db: ArticleDatabase
) {

    suspend fun getBreakingNews(countryCode: String, pageNumber: Int) =
        RetrofitInstance.api.getBreakingNews(countryCode, pageNumber)

    suspend fun searchNews(searchQuery: String, pageNumber: Int) =
        RetrofitInstance.api.searchForNews(searchQuery,pageNumber)

    suspend fun upsert(article: Article) = db.getArticleDao().upsert(article)

    fun getSavedNews() = db.getArticleDao().getAllArticles()

    suspend fun deleteArticle(article: Article) = db.getArticleDao().deleteArticle(article)
}