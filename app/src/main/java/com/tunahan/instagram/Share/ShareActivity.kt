package com.tunahan.instagram.Share

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.tunahan.instagram.R
import com.tunahan.instagram.utils.BottomNavigationViewHelper
import kotlinx.android.synthetic.main.activity_home.*

class ShareActivity : AppCompatActivity() {

    private val ACTIVITY_NO=2
    private val TAG="ShareActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        setupBottomNavigationView()
    }

    fun setupBottomNavigationView(){

        BottomNavigationViewHelper.setupBottomNavigationView(bottomNavigationView,ACTIVITY_NO)
        BottomNavigationViewHelper.setupBottomNavigation(this,bottomNavigationView)

    }

}
