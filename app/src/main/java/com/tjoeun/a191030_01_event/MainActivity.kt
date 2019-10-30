package com.tjoeun.a191030_01_event

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        loginBtn.setOnClickListener {it: View!}
            var inputId = idEdt.text.toString()
            var inputPw = pwEdt.text.toString()

            Toast.makeText()
    }
}
