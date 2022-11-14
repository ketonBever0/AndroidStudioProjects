package com.example.navigacio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI
import com.google.android.material.navigation.NavigationView

private lateinit var drawerLayout: DrawerLayout
private lateinit var appBarConfiguration: AppBarConfiguration

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        /*val navController=this.findNavController(R.id.nav_host_fragment)
        drawerLayout=findViewById(R.id.drawerLayout)
        NavigationUI.setupActionBarWithNavController(this,navController, drawerLayout)
        appBarConfiguration= AppBarConfiguration(navController.graph, drawerLayout)

        val navigationView:NavigationView=findViewById(R.id.navView)

        NavigationUI.setupActionBarWithNavController(this,navController)*/

        val navController=this.findNavController(R.id.nav_host_fragment)
        drawerLayout=findViewById(R.id.drawerLayout)
        val navigationView:NavigationView=findViewById(R.id.navView)
        NavigationUI.setupActionBarWithNavController(this,navController,drawerLayout)

        appBarConfiguration= AppBarConfiguration(navController.graph,drawerLayout)
        NavigationUI.setupWithNavController(navigationView, navController)

    }

    override fun onSupportNavigateUp(): Boolean {

        val navController=this.findNavController(R.id.nav_host_fragment)
        return NavigationUI.navigateUp(navController,drawerLayout)

    }

}