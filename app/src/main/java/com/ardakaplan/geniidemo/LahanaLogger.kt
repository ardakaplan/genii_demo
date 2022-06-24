package com.ardakaplan.geniidemo

import android.util.Log

/**
 * Created by Arda Kaplan at 24.06.2022 - 14:58
 *
 * ardakaplan101@gmail.com
 */
class LahanaLogger {

    companion object {

        private const val GENII_LOG_TAG = "LAHANA - GENII"

        fun logGenii(message: String) {

            Log.i(GENII_LOG_TAG, message)
        }
    }
}