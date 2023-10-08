package com.example.myapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract.CommonDataKinds.Phone
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var text1: TextView
    private lateinit var btn1: Button
    private lateinit var btnPhone: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        text1 = findViewById(R.id.text1)
        btn1 = findViewById(R.id.btn1)
        btnPhone = findViewById(R.id.btn_phone)

        text1.text = "Hello Programmer"
        btn1.setOnClickListener {
            //OPEN MAIN2ACTIVITY
            val intentDestination = Intent(this@MainActivity, Main2Activity::class.java)
            // intentDestination.putExtra(Main2Activity.EXTRA_DATA, "hello my friend")
            intentDestination.putExtra(Main2Activity.EXTRA_DATA, Student("Joko", "123456"))
            startActivity(intentDestination)


        }
        btnPhone.setOnClickListener {
val number = "12345678"
            val intentPhone = Intent(Intent.ACTION_DIAL, Uri.parse("tel:$number"))
            startActivity(intentPhone)
            //IMPLICIT INTENT
        }
    }
}



