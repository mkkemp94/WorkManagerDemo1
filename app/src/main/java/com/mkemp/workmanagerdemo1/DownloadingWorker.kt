package com.mkemp.workmanagerdemo1

import android.content.Context
import android.util.Log
import androidx.work.Data
import androidx.work.ListenableWorker
import androidx.work.Worker
import androidx.work.WorkerParameters
import java.lang.Exception
import java.text.SimpleDateFormat
import java.util.*

class DownloadingWorker(context: Context, params: WorkerParameters) : Worker(context, params) {

    override fun doWork(): Result {

        try {
            for (i in 0..3000) {
                Log.i("MyTag", "Downloading $i")
            }

            val time = SimpleDateFormat("dd/M/yyyy hh:mm:ss")
            val currentDate = time.format(Date())
            Log.i("MyTag", "Completed $currentDate")

            return Result.success()
        } catch (e: Exception) {
            return Result.failure()
        }

    }

}