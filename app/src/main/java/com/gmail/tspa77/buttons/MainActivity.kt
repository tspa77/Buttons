package com.gmail.tspa77.buttons

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttons = listOf(button3, button4, button5, button6)

        switch1.setOnCheckedChangeListener { _, _ ->

            buttons.forEach { it.isEnabled = it.isEnabled.not() }
            Toast.makeText(
                baseContext,
                "button5.isEnabled = ${button5.isEnabled}",
                Toast.LENGTH_SHORT
            ).show()
        }

        button1.isEnabled = true
        button1.setOnClickListener {
            button5.setStylePrimary()
            Toast.makeText(
                baseContext,
                "button5.isEnabled = ${button5.isEnabled}",
                Toast.LENGTH_SHORT
            ).show()
        }

        button2.isEnabled = true
        button2.setOnClickListener {
            button5.setStyleSecondary()
            Toast.makeText(
                baseContext,
                "button5.isEnabled = ${button5.isEnabled}",
                Toast.LENGTH_SHORT
            ).show()
        }


    }
}


//            Toast.makeText(this, "Button 2 isActivated = ${it.isActivated}", Toast.LENGTH_SHORT)
//                .show()


//            button2.isActivated = button2.isActivated.not()
//            Toast.makeText(this, "Button 2 isActivated = ${button2.isActivated}", Toast.LENGTH_SHORT)
//                .show()