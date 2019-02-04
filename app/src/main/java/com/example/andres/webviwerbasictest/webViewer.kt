package com.example.andres.webviwerbasictest

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.widget.Toast

class webViewer : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_viewer)
        val myrequest = intent.getStringExtra("URL")

        //Toast.makeText(this,"Esto obtuve de extra: $myrequest",Toast.LENGTH_SHORT).show()


        val webBrowser = findViewById<WebView>(R.id.myWebViewer)
        Toast.makeText(this,"I will try to load your request",Toast.LENGTH_SHORT).show()
        webBrowser.canGoBack()
        webBrowser.loadUrl("$myrequest")


    }
}
