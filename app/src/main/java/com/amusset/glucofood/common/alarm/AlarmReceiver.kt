package com.amusset.glucofood.common.alarm

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.media.AudioManager
import android.media.ToneGenerator
import android.widget.Toast
import com.amusset.glucofood.common.Constants.GLUCOSE_RECORD_ID

class AlarmReceiver: BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent) {
        //TODO: Invoke Notification builder
        ToneGenerator(AudioManager.STREAM_MUSIC, 100).startTone(ToneGenerator.TONE_SUP_DIAL, 500)
        Toast.makeText(context, "TEST ALARM + ${intent.getStringExtra(GLUCOSE_RECORD_ID)}", Toast.LENGTH_SHORT).show()
    }
}