package com.amusset.glucofood.records.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.amusset.glucofood.R
import com.amusset.glucofood.databinding.RecordsFragmentBinding
import com.amusset.glucofood.records.viewmodel.RecordsViewModel

class RecordsFragment: Fragment(){

    private lateinit var binding: RecordsFragmentBinding
    private lateinit var viewModel: RecordsViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View{
        binding = RecordsFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnOne.setOnClickListener{
            findNavController().navigate(R.id.foodDetailFragment)
        }
        binding.btnTwo.setOnClickListener{
            findNavController().navigate(R.id.homeFragment)
        }
    }
}