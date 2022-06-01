package com.amusset.glucofood.fooddetail.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.amusset.glucofood.R
import com.amusset.glucofood.databinding.FoodDetailFragmentBinding
import com.amusset.glucofood.fooddetail.viewmodel.FoodDetailViewModel

class FoodDetailFragment: Fragment() {

    private lateinit var binding: FoodDetailFragmentBinding
    private lateinit var viewModel: FoodDetailViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FoodDetailFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnOne.setOnClickListener{
            findNavController().navigate(R.id.recordsFragment)
        }
    }
}