package com.example.colorapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListeners()
    }

    private fun setListeners() {
        val clickableView: List<View> =
            listOf(
                box_one_text, box_9, box_three_text,
                box_four_text, box_five_text, constraint_layout,
                box_6, box_7, box_8, box_10, box_11, box_12,
                red_button, orange_button, green_button,
                white_button, black_button, blue_button
            )

        for (item in clickableView) {
            item.setOnClickListener { makeColored(it) }
        }
    }

    private fun makeColored(view: View) {
        var idInt: Int = android.R.color.holo_blue_dark
        when (view.id) {
            R.id.box_three_text -> view.setBackgroundResource((idInt))
            R.id.box_four_text -> view.setBackgroundResource((idInt))
            R.id.box_five_text -> view.setBackgroundResource((idInt))
            R.id.box_one_text -> view.setBackgroundResource((idInt))
            R.id.box_6 -> view.setBackgroundResource((idInt))
            R.id.box_7 -> view.setBackgroundResource((idInt))
            R.id.box_8 -> view.setBackgroundResource((idInt))
            R.id.box_9 -> view.setBackgroundResource((idInt))
            R.id.box_10 -> view.setBackgroundResource((idInt))
            R.id.box_11 -> view.setBackgroundResource((idInt))
            R.id.box_12 -> view.setBackgroundResource((idInt))

            R.id.green_button -> {
               idInt = android.R.color.holo_green_light
            }
            R.id.red_button -> {
                idInt = android.R.color.holo_red_dark
            }
            R.id.orange_button -> {
                idInt = android.R.color.holo_orange_light
            }
            R.id.black_button -> {
                idInt = android.R.color.black
            }
            R.id.blue_button -> {
                idInt = android.R.color.holo_blue_dark
            }
            R.id.white_button -> {
                idInt = android.R.color.white
            }
        }

    }
}