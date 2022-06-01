package com.amusset.glucofood.initial.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.amusset.glucofood.R
import com.amusset.glucofood.databinding.InitialFragmentBinding
import com.amusset.glucofood.initial.viewmodel.InitialViewModel


class InitialFragment: Fragment(){

    private lateinit var binding: InitialFragmentBinding
    private lateinit var viewModel: InitialViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View{
        binding = InitialFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnCreate.setOnClickListener(){
            findNavController().navigate(R.id.action_initialFragment_to_nav_graph_internal)
        }
    }
}