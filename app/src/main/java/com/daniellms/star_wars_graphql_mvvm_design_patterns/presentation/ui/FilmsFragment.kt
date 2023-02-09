package com.daniellms.star_wars_graphql_mvvm_design_patterns.presentation.ui

import android.os.Bundle
import com.daniellms.star_wars_graphql_mvvm_design_patterns.databinding.FragmentFilmsBinding

class FilmsFragment: BaseFragment<FragmentFilmsBinding>(
    FragmentFilmsBinding::inflate
) {
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding?.apply {

        }
    }

}