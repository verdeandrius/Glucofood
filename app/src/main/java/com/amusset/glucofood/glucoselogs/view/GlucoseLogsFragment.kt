package com.amusset.glucofood.glucoselogs.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.amusset.glucofood.databinding.FragmentGlucoseLogsBinding
import com.amusset.glucofood.glucoselogs.viewmodel.GlucoseLogsViewModel

class GlucoseLogsFragment : Fragment() {

    private lateinit var binding: FragmentGlucoseLogsBinding
    private lateinit var viewModel: GlucoseLogsViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentGlucoseLogsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
}