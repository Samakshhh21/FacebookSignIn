package com.example.signinfacebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.firebase.Firebase
import com.google.firebase.auth.auth

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val message = intent.getStringExtra("EXTRA_MESSAGE")
       val tv:TextView=findViewById(R.id.textView)
        // Use the message as needed (e.g., display in a TextView)
        tv.text = message
        val btn:Button=findViewById(R.id.button2)
        btn.setOnClickListener {

            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}