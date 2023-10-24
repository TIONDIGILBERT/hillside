package com.example.hillside

import android.annotation.SuppressLint
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity

class Home : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
       val webview: WebView=findViewById(R.id.web)
        webview.webViewClient=object :WebViewClient(){
            @Deprecated("Deprecated in Java")
            override fun shouldOverrideUrlLoading(
                view: WebView,
                url: String
            ): Boolean { view.loadUrl(url)
                return true
            }
        }
        webview.loadUrl("https://www.hillsideschoolsnaalya.com")
        webview.settings.javaScriptEnabled
        webview.settings.allowContentAccess=true
        webview.settings.useWideViewPort=true
        webview.settings.domStorageEnabled
        webview.settings.displayZoomControls
    }
}