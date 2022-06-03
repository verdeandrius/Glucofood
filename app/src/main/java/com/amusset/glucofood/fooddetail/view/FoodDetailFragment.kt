package com.amusset.glucofood.fooddetail.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.amusset.glucofood.databinding.FragmentFoodDetailBinding
import com.amusset.glucofood.fooddetail.viewmodel.FoodDetailViewModel
import com.amusset.glucofood.internalhost.InternalHostActivity

class FoodDetailFragment: Fragment() {

    private lateinit var binding: FragmentFoodDetailBinding
    private lateinit var viewModel: FoodDetailViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentFoodDetailBinding.inflate(inflater, container, false)
        (requireActivity() as InternalHostActivity).hideFloatingButton()
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
}