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
            updateStatus()
        }

        updateStatus()

    }

    private fun updateStatus() {
        tv_status_1.text = "button1.isEnabled = ${button1.isEnabled}"
        tv_status_2.text = "button2.isEnabled = ${button2.isEnabled}"
        tv_status_3.text = "button3.isEnabled = ${button3.isEnabled}"
        tv_status_4.text = "button4.isEnabled = ${button4.isEnabled}"
        tv_status_5.text = "button5.isEnabled = ${button5.isEnabled}"
        tv_status_6.text = "button6.isEnabled = ${button6.isEnabled}"
    }
}
