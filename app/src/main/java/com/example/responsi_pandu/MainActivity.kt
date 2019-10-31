package com.example.responsi_pandu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        log.setOnClickListener {
            val movetobiodata = Intent(this, Login::class.java)
            startActivity(movetobiodata)
        }

        reg.setOnClickListener {
                val movetoregister = Intent(this, ActivityRegister::class.java)
                startActivity(movetoregister)
            }

    }
}
