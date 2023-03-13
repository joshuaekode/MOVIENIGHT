package com.josh.movienight.ui.notifications

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.josh.movienight.R
import com.josh.movienight.databinding.FragmentNotificationsBinding

class NotificationsFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_notifications,container,false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val mywebview: WebView = view.findViewById(R.id.romanceweb)
        mywebview.webViewClient = object : WebViewClient() {
            override fun shouldOverrideUrlLoading(
                view: WebView,
                url: String
            ): Boolean {
                view.loadUrl(url)
                return true
            }
        }
        mywebview.loadUrl("https://ww1.123moviesfree.net/genre/romance/")
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