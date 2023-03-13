package com.josh.movienight

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient

class fantasyFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_fantasy,container,false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val mywebview: WebView = view.findViewById(R.id.fantasyweb)
        mywebview.webViewClient = object : WebViewClient() {
            override fun shouldOverrideUrlLoading(
                view: WebView,
                url: String
            ): Boolean {
                view.loadUrl(url)
                return true
            }
        }
        mywebview.loadUrl("https://ww1.123moviesfree.net/genre/fantasy/")
        mywebview.settings.javaScriptEnabled=true
        mywebview.settings.allowContentAccess=true
        mywebview.settings.useWideViewPort=true
        mywebview.settings.domStorageEnabled=true
        mywebview.settings.builtInZoomControls=false
        mywebview.settings.javaScriptCanOpenWindowsAutomatically=true
        mywebview.settings.allowFileAccess=true
        mywebview.settings.useWideViewPort=true

    }
}