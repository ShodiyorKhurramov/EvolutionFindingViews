package com.example.evolutionfindingviews.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.evolutionfindingviews.R


import android.view.LayoutInflater
import com.example.evolutionfindingviews.databinding.ActivityViewBindingBinding


class ViewBindingActivity : AppCompatActivity() {
    lateinit var binding: ActivityViewBindingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityViewBindingBinding.inflate(LayoutInflater.from(this))
        setContentView(binding.root)

        initViews()
    }

    private fun initViews() {
        binding.bViewbinding.setOnClickListener {
            binding.tvViewbinding.text = "View Binding"
        }
    }
}