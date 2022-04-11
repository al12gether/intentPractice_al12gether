package com.example.intentpractice_al12gether

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_ohter.*

class OhterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ohter)

        returnToMainBtn.setOnClickListener {

//            val myInetnt = Intent(this, MainActivity::class.java)
//            startActivity(myInetnt)

            finish()

        }

    }
}