package com.daniellms.star_wars_graphql_mvvm_design_patterns.presentation.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.daniellms.star_wars_graphql_mvvm_design_patterns.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}