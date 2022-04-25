package com.example.findviewbyid

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViews()
    }

    private fun initViews() {
        val btn_butterknife = findViewById<Button>(R.id.btn_butterknife)
        val btn_kotlin_synthetics = findViewById<Button>(R.id.btn_synthetic)
        val btn_viewbinding = findViewById<Button>(R.id.btn_vieBinding)

        btn_butterknife.setOnClickListener {
            callButterKnifeActivity()
        }

        btn_kotlin_synthetics.setOnClickListener {
            KotlinSyntheticActivity()
        }

        btn_viewbinding.setOnClickListener {
            callViewBindingActivity()
        }
    }

    private fun callButterKnifeActivity() {
        val intent = Intent(this, ButterKnifeActivity::class.java)
        startActivity(intent)
    }

    private fun KotlinSyntheticActivity() {
        val intent = Intent(this, KotlinSyntheticActivity::class.java)
        startActivity(intent)
    }

    private fun callViewBindingActivity() {
        val intent = Intent(this, ViewBindingsActivity::class.java)
        startActivity(intent)
    }
}