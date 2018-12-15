package com.tunahan.instagram.Home

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.tunahan.instagram.R
import com.tunahan.instagram.utils.BottomNavigationViewHelper
import com.tunahan.instagram.utils.HomePagerAdapter
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {

    private val ACTIVITY_NO=0
    private val TAG="HomeActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        setupBottomNavigationView()
        setupHomeViewPager()
    }


    private fun setupHomeViewPager() {

        var homePagerAdapter=HomePagerAdapter(supportFragmentManager)
        homePagerAdapter.addFragment(CameraFragment())    //id:0
        homePagerAdapter.addFragment(HomeFragment())      //id:1
        homePagerAdapter.addFragment(MessagesFragment())  //id:2
        homeViewPager.adapter=homePagerAdapter            //activity_main'de bulunan View Pager'a adaptoru atadık
        homeViewPager.currentItem = 1                     //giriste home fragment ile başlaması için
    }


    private fun setupBottomNavigationView(){

        BottomNavigationViewHelper.setupBottomNavigationView(bottomNavigationView,ACTIVITY_NO)
        BottomNavigationViewHelper.setupBottomNavigation(this,bottomNavigationView)

    }

}
