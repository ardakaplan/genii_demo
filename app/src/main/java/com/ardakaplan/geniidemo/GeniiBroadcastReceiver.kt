package com.ardakaplan.geniidemo

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log

/**
 * Created by Arda Kaplan at 24.06.2022 - 14:46
 *
 * ardakaplan101@gmail.com
 */
class GeniiBroadcastReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {

        Log.i("LAHANA", "BNURDAAA")

        intent.extras?.containsKey(Constants.BROADCAST_DATA_KEY)?.let {

            LahanaLogger.logGenii("onReceive data : " + intent.extras!!.getString("DATA"))

            val aobGeniiMessagingObject = intent.extras!!.getSerializable(Constants.BROADCAST_DATA_KEY)

            LahanaLogger.logGenii("onReceive aobGeniiMessagingObject :\n" + aobGeniiMessagingObject)

        }

        if (intent.extras == null) {

            LahanaLogger.logGenii("onReceive intent.extras is NULL")
        }


    }
}