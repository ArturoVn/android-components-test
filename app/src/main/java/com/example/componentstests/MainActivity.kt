package com.example.componentstests

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.google.android.material.slider.RangeSlider
import com.google.android.material.slider.Slider

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView:TextView = findViewById(R.id.testTextView)
        val slider:Slider = findViewById(R.id.slider)

        slider.addOnChangeListener{rangeSlider, value, fromUser ->
            textView.text = "$ ${value} MXN"
        }

//        slider.addOnSliderTouchListener(object : RangeSlider.OnSliderTouchListener {
//            override fun onStartTrackingTouch(slider: RangeSlider) {
//                TODO("Not yet implemented")
//            }
//
//            override fun onStopTrackingTouch(slider: RangeSlider) {
//                TODO("Not yet implemented")
//            }
//
//        })
//        val seekBar:SeekBar = findViewById(R.id.testSeekBar)

//        seekBar.progress(1000)
//        seekBar.incrementProgressBy(500)

//        seekBar?.setOnSeekBarChangeListener(object: SeekBar.OnSeekBarChangeListener{
//            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
//                textView.text = progress.toString()
//            }
//
//            override fun onStartTrackingTouch(seekBar: SeekBar?) {
//                if(seekBar != null){
//
//                }
//            }
//
//            override fun onStopTrackingTouch(seekBar: SeekBar?) {
//                if(seekBar != null){
//
//                }
//            }
//
//        })
    }
}