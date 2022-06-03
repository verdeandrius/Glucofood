package com.amusset.glucofood.newuser.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.amusset.glucofood.R
import com.amusset.glucofood.databinding.FragmentNewUserBinding
import com.amusset.glucofood.internalhost.InternalHostActivity
import com.amusset.glucofood.newuser.viewmodel.NewUserViewModel

class NewUserFragment : Fragment(){

    private lateinit var binding: FragmentNewUserBinding
    private lateinit var viewModel: NewUserViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View{
        binding = FragmentNewUserBinding.inflate(inflater, container, false)
        (requireActivity() as InternalHostActivity).hideFloatingButton()
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnCreateLog.setOnClickListener {
            findNavController().navigate(R.id.createRecordFragment)
        }
    }
}