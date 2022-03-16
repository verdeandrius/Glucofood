package com.amusset.glucofood.tracker.view

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.amusset.glucofood.R
import com.amusset.glucofood.tracker.viewmodel.TrackerViewModel

class TrackerFragment : Fragment() {

    companion object {
        fun newInstance() = TrackerFragment()
    }

    private lateinit var viewModel: TrackerViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.tracker_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(TrackerViewModel::class.java)
        // TODO: Use the ViewModel
    }

}