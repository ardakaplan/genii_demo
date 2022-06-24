package com.ardakaplan.geniidemo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.ardakaplan.geniidemo.databinding.ActivityMainBinding

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