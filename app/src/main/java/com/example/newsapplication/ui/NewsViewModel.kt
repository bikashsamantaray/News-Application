package com.example.newsapplication.ui

import androidx.lifecycle.ViewModel
import com.example.newsapplication.ui.repository.NewsRepository

class NewsViewModel(
    val newsRepository: NewsRepository
): ViewModel() {
}