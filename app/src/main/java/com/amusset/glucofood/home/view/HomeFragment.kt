package com.amusset.glucofood.home.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.amusset.glucofood.R
import com.amusset.glucofood.databinding.FragmentHomeBinding
import com.amusset.glucofood.home.viewmodel.HomeViewModel
import com.amusset.glucofood.internalhost.InternalHostActivity
import com.google.android.material.floatingactionbutton.FloatingActionButton

class HomeFragment : Fragment(){

    private lateinit var binding: FragmentHomeBinding
    private lateinit var viewModel: HomeViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View{
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnOne.setOnClickListener{
            findNavController().navigate(R.id.recordsFragment)
        }
        binding.btnTwo.setOnClickListener{
            findNavController().navigate(R.id.newUserFragment)
        }
        (requireActivity() as InternalHostActivity).findViewById<FloatingActionButton>(R.id.btnFloating).setOnClickListener {
            findNavController().navigate(R.id.createRecordFragment)
        }
    }
}