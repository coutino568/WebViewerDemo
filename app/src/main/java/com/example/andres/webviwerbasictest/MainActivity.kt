package com.example.andres.webviwerbasictest

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val myBrowseButton = findViewById<Button>(R.id.browseButton)
        val mySearchBox= findViewById<EditText>(R.id.myWebsite)
        val request=mySearchBox.text

        myBrowseButton.setOnClickListener(){
           val myintent= Intent(this, webViewer::class.java)
            val request =findViewById<EditText>(R.id.myWebsite).text
           // Toast.makeText(this,"Esto se esta mandando de extra: $request ",Toast.LENGTH_SHORT).show()
            myintent.putExtra("URL",request.toString())


            startActivity(myintent)
        }
    }
}
