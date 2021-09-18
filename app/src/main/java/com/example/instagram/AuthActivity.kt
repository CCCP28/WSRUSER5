package com.example.instagram

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.preference.PreferenceActivity
import android.widget.Button
import kotlinx.coroutines.delay
import org.apache.http.conn.scheme.HostNameResolver
import org.xml.sax.HandlerBase

class AuthActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_auth)

        val button_signup = findViewById<Button>(R.id.button2)

        button_signup.setOnClickListener(){
            startActivity(Intent(this,SignUp::class.java))

        }

        val button_signin = findViewById<Button>(R.id.button)

        button_signin.setOnClickListener(){
            startActivity(Intent(this,Chats::class.java))

        }

}}