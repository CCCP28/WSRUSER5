package com.example.instagram

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SignUp : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        val button_signup = findViewById<Button>(R.id.button3)

        button_signup.setOnClickListener(){
            startActivity(Intent(this,Chats::class.java))

        }
        val button_cancel = findViewById<Button>(R.id.button4)

        button_cancel.setOnClickListener(){
            finish()

        }
    }
}