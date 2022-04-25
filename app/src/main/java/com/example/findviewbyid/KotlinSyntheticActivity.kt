package com.example.findviewbyid

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_kotlin_synthetic.*

class KotlinSyntheticActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin_synthetic)
        initViews()
    }

    private fun initViews() {
        ksynthetic_button.setOnClickListener {
            ksynthetic_txt.text = "Kotlin Synthetic"
        }
    }
}