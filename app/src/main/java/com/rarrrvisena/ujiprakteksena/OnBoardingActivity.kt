package com.rarrrvisena.ujiprakteksena

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.rarrrvisena.ujiprakteksena.LoginActivity
import com.rarrrvisena.ujiprakteksena.R
import com.rarrrvisena.ujiprakteksena.databinding.ActivityOnBoardingBinding


class OnBoardingActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityOnBoardingBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOnBoardingBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val btnMoveToLogin: Button = findViewById(R.id.onBoardingButton)
        btnMoveToLogin.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.onBoardingButton -> {
                val moveIntent = Intent(this@OnBoardingActivity, LoginActivity::class.java)
                startActivity(moveIntent)
            }
        }
    }
}