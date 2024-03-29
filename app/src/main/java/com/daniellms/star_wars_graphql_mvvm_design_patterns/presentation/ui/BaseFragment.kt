package com.daniellms.star_wars_graphql_mvvm_design_patterns.presentation.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewbinding.ViewBinding

abstract class BaseFragment<VB: ViewBinding>(
    private val bindingInflater: (inflater: LayoutInflater) -> VB
): Fragment() {

    private var _binding: VB? = null
    open val binding: VB?
        get() = _binding as VB

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        this._binding = bindingInflater.invoke(inflater)
        if (_binding == null)
            throw IllegalArgumentException("Binding can't be NULL")
        return this.binding?.root
    }

}