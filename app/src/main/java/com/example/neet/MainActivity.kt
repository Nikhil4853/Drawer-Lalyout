package com.example.neet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var toggle: ActionBarDrawerToggle
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var drawerLayout: DrawerLayout = drawer_layout
        var navView: NavigationView = nav_view
        toggle = ActionBarDrawerToggle(this, drawerLayout, R.string.open, R.string.close)
        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        navView.setNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.nev_bio_notes -> Toast.makeText(
                    applicationContext,
                    "bionotes",
                    Toast.LENGTH_SHORT
                ).show()
                R.id.nev_chemistry_notes -> Toast.makeText(
                    applicationContext,
                    "chemist",
                    Toast.LENGTH_SHORT
                ).show()
                R.id.nev_physics_notes -> Toast.makeText(
                    applicationContext,
                    "physic",
                    Toast.LENGTH_SHORT
                ).show()
                R.id.nev_paper_2021 -> Toast.makeText(applicationContext, "21", Toast.LENGTH_SHORT)
                    .show()
                R.id.nev_paper_2020 -> Toast.makeText(applicationContext, "20", Toast.LENGTH_SHORT)
                    .show()
                R.id.nev_paper_2019 -> Toast.makeText(applicationContext, "19", Toast.LENGTH_SHORT)
                    .show()
                R.id.nev_paper_2018 -> Toast.makeText(applicationContext, "18", Toast.LENGTH_SHORT)
                    .show()
                R.id.nev_paper_2017 -> Toast.makeText(applicationContext, "17", Toast.LENGTH_SHORT)
                    .show()
                R.id.nev_paper_2016 -> Toast.makeText(applicationContext, "16", Toast.LENGTH_SHORT)
                    .show()
            }
            true
        }

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (toggle.onOptionsItemSelected(item)) {
            return true
        }
        return super.onOptionsItemSelected(item)
    }
}
