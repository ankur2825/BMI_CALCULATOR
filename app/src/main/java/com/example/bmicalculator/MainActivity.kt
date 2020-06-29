package com.example.bmicalculator

import android.os.Bundle
import android.view.View
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
            bmires1.text = "${bmi.toFloat()}"
            when {
                bmi<16 -> {
                    resultlayout.visibility=View.VISIBLE
                    bmires1.visibility=View.VISIBLE
                    bmires2.visibility=View.VISIBLE
                    bmires2.text ="SEVERLY UNDERWEIGHT"
                }
                bmi in 17..18 -> {
                    resultlayout.visibility=View.VISIBLE
                    bmires1.visibility=View.VISIBLE
                    bmires2.visibility=View.VISIBLE
                    bmires2.text = getString(R.string.underweight)
                }
                bmi in 19 .. 25 -> {
                    resultlayout.visibility=View.VISIBLE
                    bmires1.visibility=View.VISIBLE
                    bmires2.visibility=View.VISIBLE
                    bmires2.text = getString(R.string.normal)
                }
                bmi in 25 .. 30 -> {
                    resultlayout.visibility=View.VISIBLE
                    bmires1.visibility=View.VISIBLE
                    bmires2.visibility=View.VISIBLE
                    bmires2.text = getString(R.string.overweight)

                }
                else -> {
                    resultlayout.visibility=View.VISIBLE
                    bmires1.visibility=View.VISIBLE
                    bmires2.visibility=View.VISIBLE
                    bmires2.text = getString(R.string.obese)
                }
            }
        }

    }
}