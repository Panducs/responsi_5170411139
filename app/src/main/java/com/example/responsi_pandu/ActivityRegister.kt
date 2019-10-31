package com.example.responsi_pandu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class ActivityRegister: AppCompatActivity() {
    private lateinit var namedata: EditText
    private lateinit var alamtdata: EditText
    private lateinit var emaildata: EditText
    private lateinit var sandi: EditText
    private lateinit var btnGet: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.registrasi)

        namedata =findViewById(R.id.namedat)
        alamtdata = findViewById(R.id.alamat)
        emaildata = findViewById(R.id.email)
        sandi = findViewById(R.id.pass)
        btnGet = findViewById(R.id.btn_tmbl)


        btnGet.setOnClickListener {

            val getdata = Intent(this, ActivityBiodata::class.java)

            getdata.putExtra("GetNama", namedata.text.toString())
            getdata.putExtra("GetAlamat", alamtdata.text.toString())
            getdata.putExtra("GetEmail", emaildata.text.toString())
            getdata.putExtra("GetSandi", sandi.text.toString())
            startActivity(getdata)
        }
    }
}
