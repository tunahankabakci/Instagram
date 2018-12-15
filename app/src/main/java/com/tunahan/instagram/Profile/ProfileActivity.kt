package com.tunahan.instagram.Profile

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.tunahan.instagram.R
import com.tunahan.instagram.utils.BottomNavigationViewHelper
import kotlinx.android.synthetic.main.activity_profile.*

class ProfileActivity : AppCompatActivity() {

    private val ACTIVITY_NO=4
    private val TAG="ProfilesActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        setupBottomNavigationView()
        setupToolbar()

    }

    private fun setupToolbar() {
        profileActivityProfileOptionsImageView.setOnClickListener{

            val intent=Intent(this,ProfileSettingsActivity::class.java).addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION)
            startActivity(intent)

        }
    }


    private fun setupBottomNavigationView(){

        BottomNavigationViewHelper.setupBottomNavigationView(bottomNavigationView,ACTIVITY_NO)
        BottomNavigationViewHelper.setupBottomNavigation(this,bottomNavigationView)

    }




}
