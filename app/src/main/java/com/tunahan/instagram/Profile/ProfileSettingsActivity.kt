package com.tunahan.instagram.Profile

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.tunahan.instagram.R
import com.tunahan.instagram.utils.BottomNavigationViewHelper
import kotlinx.android.synthetic.main.activity_profile_settings.*

class ProfileSettingsActivity : AppCompatActivity() {

    private val ACTIVITY_NO=4
    private val TAG="ProfilesActivity"


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile_settings)

        setupBottomNavigationView()
        setupToolbar()
    }

    private fun setupBottomNavigationView(){

        BottomNavigationViewHelper.setupBottomNavigationView(bottomNavigationView,ACTIVITY_NO)
        BottomNavigationViewHelper.setupBottomNavigation(this,bottomNavigationView)

    }

    private fun setupToolbar(){

        profileSettingsActivityBackImageView.setOnClickListener{
            onBackPressed()
        }

    }
}
