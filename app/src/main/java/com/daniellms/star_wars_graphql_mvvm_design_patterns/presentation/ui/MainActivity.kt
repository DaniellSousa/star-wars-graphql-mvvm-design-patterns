package com.daniellms.star_wars_graphql_mvvm_design_patterns.presentation.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.apollographql.apollo3.ApolloClient
import com.daniellms.star_wars_graphql_mvvm_design_patterns.databinding.ActivityMainBinding
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withContext

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        val apolloClient = ApolloClient.Builder()
//            .serverUrl("https://e72b-2804-7f7-e289-c46d-9071-342f-19b1-3ef7.sa.ngrok.io/")
//            .build()
//
//        runBlocking {
//            withContext(Dispatchers.IO) {
//                val response = apolloClient.query(GetFilmsQuery()).execute()
//                Log.i("RESULT GRAPHQL", "${response.data?.allFilms?.films}")
//            }
//        }
    }
}