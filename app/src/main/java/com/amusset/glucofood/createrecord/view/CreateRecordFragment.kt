package com.amusset.glucofood.createrecord.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.amusset.glucofood.R
import com.amusset.glucofood.createrecord.viewmodel.CreateRecordViewModel
import com.amusset.glucofood.databinding.FragmentCreateRecordBinding
import com.amusset.glucofood.databinding.FragmentFoodDetailBinding
import com.amusset.glucofood.internalhost.InternalHostActivity
import com.google.android.material.floatingactionbutton.FloatingActionButton


class CreateRecordFragment : Fragment() {

    private lateinit var binding: FragmentCreateRecordBinding
    private lateinit var viewModel: CreateRecordViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View?{
        binding = FragmentCreateRecordBinding.inflate(inflater, container, false)
        (requireActivity() as InternalHostActivity).hideFloatingButton()
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
}