package com.example.newsapplication.ui

import android.os.Binder
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentContainerView
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.setupWithNavController
import com.example.newsapplication.R
import com.example.newsapplication.databinding.ActivityNewsBinding
import com.example.newsapplication.ui.db.ArticleDao
import com.example.newsapplication.ui.db.ArticleDatabase
//import android.support.v4.app.Fragment;

import com.example.newsapplication.ui.repository.NewsRepository
import com.google.android.material.bottomnavigation.BottomNavigationView
class NewsActivity : AppCompatActivity() {

    //private var binding: ActivityNewsBinding? = null
    lateinit var viewModel: NewsViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_news)
        //binding = ActivityNewsBinding.inflate(layoutInflater)
        //setContentView(binding?.root)

        val newsRepository = NewsRepository(ArticleDatabase(this))
        val viewModelProviderFactory = NewsViewModelProviderFactory(application,newsRepository)
        viewModel = ViewModelProvider(this,viewModelProviderFactory)[NewsViewModel::class.java]

        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottomNavigationView)

        val  navController = supportFragmentManager.findFragmentById(R.id.newsNavHostFragment)?.findNavController()!!
        bottomNavigationView.setupWithNavController(navController);

    }
}