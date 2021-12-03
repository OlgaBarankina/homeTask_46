package com.example.hometask_46

import android.app.Service
import android.content.Intent
import android.media.MediaPlayer
import android.os.IBinder
import android.provider.Settings

class AudioService: Service() {  //should take Service.anroid.app

    private lateinit var player: MediaPlayer

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        //return super.onStartCommand(intent, flags, startId)  // we deleted this part from the code and brought code return START_NOT_STICKY

        player = MediaPlayer.create(this, Settings.System.DEFAULT_RINGTONE_URI)   // system default call (variable)
        player.isLooping = true   // плеер повторяется
        player.start()

        return START_NOT_STICKY

    }


    override fun onDestroy() {  //stop this app
        super.onDestroy()
        player.stop()
    }



    override fun onBind(intent: Intent?): IBinder? {
        return null  // usual we use null

    }


}