package com.amusset.glucofood.records.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.amusset.glucofood.R
import com.amusset.glucofood.databinding.FragmentRecordsBinding
import com.amusset.glucofood.internalhost.InternalHostActivity
import com.amusset.glucofood.records.viewmodel.RecordsViewModel
import com.google.android.material.floatingactionbutton.FloatingActionButton

class RecordsFragment: Fragment(){

    private lateinit var binding: FragmentRecordsBinding
    private lateinit var viewModel: RecordsViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View{
        binding = FragmentRecordsBinding.inflate(inflater, container, false)

        if(requireActivity().findViewById<FloatingActionButton>(R.id.btnFloating).visibility==View.GONE){
            (requireActivity() as InternalHostActivity).showFloatingButton()
        }
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnOne.setOnClickListener{
            findNavController().navigate(R.id.foodDetailFragment)
        }
        (requireActivity() as InternalHostActivity).findViewById<FloatingActionButton>(R.id.btnFloating).setOnClickListener {
            findNavController().navigate(R.id.createRecordFragment)
        }
    }
}