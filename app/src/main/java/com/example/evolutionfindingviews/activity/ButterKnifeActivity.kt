package com.example.evolutionfindingviews.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.evolutionfindingviews.R


import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import butterknife.BindView
import butterknife.ButterKnife



class ButterKnifeActivity : AppCompatActivity() {
    @BindView(R.id.b_butter) lateinit var b_butter: Button
    @BindView(R.id.tv_butter) lateinit var tv_butter: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_butter_knife)
        ButterKnife.bind(this)
        initViews()
    }

    private fun initViews() {
        b_butter.setOnClickListener {
            tv_butter.text = "Butter Knife"
        }
    }
}