package com.tunahan.instagram.Home

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.tunahan.instagram.R

class MessagesFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        //inflater'dan sonra ? koydu nedenini bilmiyorum. O olmasa da çalışıyor.
        var view =inflater.inflate(R.layout.fragment_messages,container,false)
        return view
    }
}