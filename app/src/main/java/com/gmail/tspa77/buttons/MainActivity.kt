package com.gmail.tspa77.buttons

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttons = listOf(button1, button2, button3, button4, button5, button6)

        switch1.setOnCheckedChangeListener { _, _ ->
            buttons.forEach { it.isEnabled = it.isEnabled.not() }
        }


    }
}