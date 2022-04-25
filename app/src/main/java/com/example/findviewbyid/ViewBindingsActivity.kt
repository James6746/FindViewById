package com.example.findviewbyid

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.findviewbyid.databinding.ActivityViewBindingBinding

class ViewBindingsActivity : AppCompatActivity() {
    lateinit var binding: ActivityViewBindingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityViewBindingBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initViews()
    }

    private fun initViews() {
        binding.viewBindingButton.setOnClickListener {
            binding.viewBindingTextView.text = "View Binding"
        }
    }
}