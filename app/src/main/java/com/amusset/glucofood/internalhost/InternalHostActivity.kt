package com.amusset.glucofood.internalhost

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.navigation.findNavController
import com.amusset.glucofood.R
import com.amusset.glucofood.createrecord.view.CreateRecordFragment
import com.amusset.glucofood.createrecord.viewmodel.CreateRecordViewModel
import com.google.android.material.floatingactionbutton.FloatingActionButton

class InternalHostActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_internal_host)
        findViewById<FloatingActionButton>(R.id.btnFloating).setOnClickListener {
            Toast.makeText(this, "Test", Toast.LENGTH_SHORT).show()
        }
    }
    fun hideFloatingButton(){
        findViewById<FloatingActionButton>(R.id.btnFloating).visibility = View.GONE
    }

    fun showFloatingButton(){
        findViewById<FloatingActionButton>(R.id.btnFloating).visibility = View.VISIBLE
    }
/*    fun createRecord(){
        findViewById<FloatingActionButton>(R.id.btnFloating).setOnClickListener {
            findNavController().navigate(R.id.createRecordFragment)
        }
    }*/
}