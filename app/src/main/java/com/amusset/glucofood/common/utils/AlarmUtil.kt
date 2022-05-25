package com.amusset.glucofood.common.utils

import android.app.AlarmManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.media.AudioManager
import android.media.ToneGenerator
import android.os.Build
import android.os.SystemClock
import androidx.annotation.RequiresApi
import com.amusset.glucofood.common.Constants.ALARM_REQUEST_CODE
import com.amusset.glucofood.common.Constants.GLUCOSE_RECORD_ID
import com.amusset.glucofood.common.alarm.AlarmReceiver
import com.amusset.glucofood.common.extensions.minutesToMillis

object AlarmUtil {

    fun startRecording(context: Context, glucoseRecordId: String, repeatingIntervalInMinutes: Int) {
        val alarmIntent: PendingIntent = Intent(context, AlarmReceiver::class.java).let { intent ->
            // Set the recording values to alarm the intent, this data will be used for
            // NotificationBuilder
            intent.putExtra(GLUCOSE_RECORD_ID, glucoseRecordId)

            // Set the fresh intent to the PendingIntent
            PendingIntent.getBroadcast(context, ALARM_REQUEST_CODE, intent, PendingIntent.FLAG_MUTABLE)
        }

        // Get instance from Alarm Service from Android OS
        val alarmManager = context.getSystemService(Context.ALARM_SERVICE) as AlarmManager

        // Start alarm
        alarmManager.setRepeating(
            AlarmManager.ELAPSED_REALTIME_WAKEUP,
            repeatingIntervalInMinutes.minutesToMillis(),
            repeatingIntervalInMinutes.minutesToMillis(),
            alarmIntent
        )
        ToneGenerator(AudioManager.STREAM_MUSIC, 100).startTone(ToneGenerator.TONE_SUP_DIAL, 500)
    }
}