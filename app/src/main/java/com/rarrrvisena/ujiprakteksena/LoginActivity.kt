package com.rarrrvisena.ujiprakteksena

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import com.rarrrvisena.ujiprakteksena.MainActivity
import com.rarrrvisena.ujiprakteksena.R
import com.rarrrvisena.ujiprakteksena.databinding.ActivityLoginBinding


class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val btnMoveToMain: Button = findViewById(R.id.loginButton)
        btnMoveToMain.setOnClickListener {
            callActivity()
        }
    }

    private fun callActivity() {
        val editText = findViewById<EditText>(R.id.input)
        val name = editText.text.toString()

        val intent = Intent(this, MainActivity::class.java).also {
            it.putExtra("EXTRA_NAME", name)
            startActivity(it)
        }
    }
}