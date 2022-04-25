package com.example.evolutionfindingviews.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.evolutionfindingviews.R
import kotlinx.android.synthetic.main.activity_kotlin_synthetics.*


class KotlinSyntheticsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin_synthetics)
        initViews()
    }

    private fun initViews() {
        b_synthetics.setOnClickListener {
            tv_synthetics.text = "Kotlin Synthetics"
        }
    }
}