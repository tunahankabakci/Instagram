package com.tunahan.instagram.utils

import android.content.Context
import android.content.Intent
import android.support.design.widget.BottomNavigationView
import android.view.MenuItem
import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx
import com.tunahan.instagram.Home.HomeActivity
import com.tunahan.instagram.News.NewsActivity
import com.tunahan.instagram.Profile.ProfileActivity
import com.tunahan.instagram.Search.SearchActivity
import com.tunahan.instagram.Share.ShareActivity

class BottomNavigationViewHelper {

    companion object {

        fun setupBottomNavigationView(bottomNavigationViewEx: BottomNavigationViewEx,a:Int){

            bottomNavigationViewEx.enableAnimation(false)
            bottomNavigationViewEx.enableShiftingMode(false)
            bottomNavigationViewEx.enableItemShiftingMode(false)
            bottomNavigationViewEx.setTextVisibility(false)
            var menu=bottomNavigationViewEx.menu
            var menuItem=menu.getItem(a)
            menuItem.setChecked(true)
        }

        fun setupBottomNavigation(context: Context,bottomNavigationViewEx: BottomNavigationViewEx){

            bottomNavigationViewEx.onNavigationItemSelectedListener= object : BottomNavigationView.OnNavigationItemSelectedListener{

                override fun onNavigationItemSelected(p0: MenuItem): Boolean {

                    when(p0.itemId){

                        com.tunahan.instagram.R.id.bottom_navigation_view_home_button->{
                            val intent=Intent(context,HomeActivity::class.java).addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION)
                            context.startActivity(intent)
                            p0.setChecked(true)
                            return true
                        }

                        com.tunahan.instagram.R.id.bottom_navigation_view_search_button ->{
                            val intent=Intent(context,SearchActivity::class.java).addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION)
                            context.startActivity(intent)

                            return true
                        }

                        com.tunahan.instagram.R.id.bottom_navigation_view_share_button ->{
                            val intent=Intent(context,ShareActivity::class.java).addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION)
                            context.startActivity(intent)
                            return true
                        }

                        com.tunahan.instagram.R.id.bottom_navigation_view_news_button ->{
                            val intent=Intent(context,NewsActivity::class.java).addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION)
                            context.startActivity(intent)
                            p0.setChecked(true)
                            return true
                        }

                        com.tunahan.instagram.R.id.bottom_navigation_view_profile_button ->{
                            val intent=Intent(context,ProfileActivity::class.java).addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION)
                            context.startActivity(intent)
                            p0.setChecked(true)
                            return true
                        }
                    }
                    return false
                }
                
            }


        }


    }

}