package com.example.bmicalculator

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bmires1.text = ""
        bmires2.text= ""
        calculatebmi.setOnClickListener()
        {
            val height=height.text.toString()
            val weight=weight.text.toString()
            val heightval=height.toInt()
            val weightval=weight.toInt()
            val bmi=(10000*weightval)/(heightval*heightval)

            when {
                bmi<16 -> {
                    bmires1.text = "${bmi.toFloat()}"
                    bmires2.text = getString(R.string.severlyunderweight)
                }
                bmi in 17..18 -> {
                    bmires1.text = "${bmi.toFloat()}"
                    bmires2.text = getString(R.string.underweight)

                }
                bmi in 19 .. 25 -> {
                    bmires1.text = "${bmi.toFloat()}"
                    bmires2.text = getString(R.string.normal)
                }
                bmi in 25 .. 30 -> {
                    bmires1.text = "${bmi.toFloat()}"
                    bmires2.text = getString(R.string.overweight)

                }
                else -> {
                    bmires1.text = "${bmi.toFloat()}"
                    bmires2.text = getString(R.string.obese)
                }
            }
        }

    }
}