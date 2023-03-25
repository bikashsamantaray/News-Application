package com.example.newsapplication.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentContainerView
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.example.newsapplication.R
import com.google.android.material.bottomnavigation.BottomNavigationView

class NewsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_news)

        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottomNavigationView)
        val newsNavHostFragment = findViewById<FragmentContainerView>(R.id.newsNavHostFragment)
        bottomNavigationView.setupWithNavController(newsNavHostFragment.findNavController())
    }
}