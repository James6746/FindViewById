package com.example.findviewbyid

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import butterknife.BindView
import butterknife.ButterKnife

class ButterKnifeActivity : AppCompatActivity() {
    @BindView(R.id.butter_button)
    lateinit var butter_button: Button
    @BindView(R.id.buter_txt)
    lateinit var butter_txt: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_butter_knife)
        ButterKnife.bind(this)

        initViews()
    }

    private fun initViews() {
        butter_button.setOnClickListener {
            butter_txt.text = "Butter Knife"
        }
    }
}