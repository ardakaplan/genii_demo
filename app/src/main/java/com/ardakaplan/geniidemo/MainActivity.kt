package com.ardakaplan.geniidemo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.ardakaplan.geniidemo.aobobjects.Company
import com.ardakaplan.geniidemo.aobobjects.EnvironmentType
import com.ardakaplan.geniidemo.databinding.ActivityMainBinding
import java.util.*

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

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