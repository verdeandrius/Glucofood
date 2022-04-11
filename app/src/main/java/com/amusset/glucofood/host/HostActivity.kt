package com.amusset.glucofood.host

import android.app.AlarmManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.media.AudioManager
import android.media.ToneGenerator
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.amusset.glucofood.R
import com.amusset.glucofood.common.Constants
import com.amusset.glucofood.common.alarm.AlarmReceiver
import com.amusset.glucofood.common.utils.AlarmUtil
import com.amusset.glucofood.databinding.ActivityHostBinding
import java.util.*

class HostActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityHostBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.start.setOnClickListener {
            AlarmUtil.startRecording(this, "GLUCO ID: ${Date().time}", 1)
        }

        binding.stop.setOnClickListener {
            cancelAlarm()
        }

    }

    private fun cancelAlarm(){
        val intent = Intent(this, AlarmReceiver::class.java).let { intent ->
            PendingIntent.getBroadcast(this, Constants.ALARM_REQUEST_CODE, intent, PendingIntent.FLAG_MUTABLE )
        }

        val alarmManager = this.getSystemService(Context.ALARM_SERVICE) as AlarmManager
        alarmManager.cancel(intent)
    }

}