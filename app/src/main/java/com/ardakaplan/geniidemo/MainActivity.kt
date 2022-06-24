package com.ardakaplan.geniidemo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.ardakaplan.geniidemo.aobobjects.Company
import com.ardakaplan.geniidemo.aobobjects.EnvironmentType
import com.ardakaplan.geniidemo.databinding.ActivityMainBinding
import com.google.gson.Gson
import java.util.*

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        LahanaLogger.logGenii("GENII DEMO onCreate")

        intent.extras?.containsKey(Constants.BROADCAST_DATA_KEY)?.let {

            val aobGeniiMessagingObject = Gson().fromJson(intent!!.extras!!.getString(Constants.BROADCAST_DATA_KEY), AobGeniiMessagingObject::class.java)

            LahanaLogger.logGenii("GENII DEMO onCreate gelen data " + aobGeniiMessagingObject)
        }

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setClickables()
    }

    private fun setClickables() {

        binding.mainActivityButtonSendData.setOnClickListener {

            GeniiBroadcastReceiver.sendBroadcast(
                this,
                AobGeniiMessagingObject(
                    Random().nextInt(10000),
                    "150108",
                    "11112223",
                    Company.AYEDAS,
                    EnvironmentType.DIR,
                    AobGeniiMessagingObject.Type.GENII_TO_AOB_TEST,
                    AobGeniiMessagingObject.Trigger.GENII
                )
            )
        }
    }

    override fun onDestroy() {
        super.onDestroy()

        LahanaLogger.logGenii("GENII DEMO onDestroy")
    }

    override fun onPause() {
        super.onPause()

        LahanaLogger.logGenii("GENII DEMO onPause")
    }

    override fun onResume() {
        super.onResume()

        LahanaLogger.logGenii("GENII DEMO onResume")
    }
}