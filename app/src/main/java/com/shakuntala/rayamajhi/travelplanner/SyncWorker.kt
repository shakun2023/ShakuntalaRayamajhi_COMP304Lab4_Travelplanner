package com.shakuntala.rayamajhi.travelplanner

import android.content.Context
import androidx.work.Worker
import androidx.work.WorkerParameters
import android.util.Log

class SyncWorker(context: Context, workerParams: WorkerParameters) : Worker(context, workerParams) {
    override fun doWork(): Result {
        try {
            // Simulate a background task, e.g., data synchronization
            Log.d("SyncWorker", "Starting background task...")

            // Perform the background operation
            // Example: Fetch data from server or sync local database
            for (i in 1..5) {
                Log.d("SyncWorker", "Sync in progress: Step $i")
                Thread.sleep(1000) // Simulating a time-consuming task
            }

            Log.d("SyncWorker", "Background task completed successfully.")

            // Return success if the task completes without errors
            return Result.success()
        } catch (e: Exception) {
            Log.e("SyncWorker", "Error during background task", e)

            // Return failure if the task encounters an error
            return Result.failure()
        }
    }
}