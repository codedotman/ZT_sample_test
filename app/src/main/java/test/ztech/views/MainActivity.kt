package test.ztech.views

import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v4.app.Fragment
import android.view.Menu
import android.view.MenuItem
import dagger.android.support.DaggerAppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import test.ztech.R
import test.ztech.views.settings.SettingsFragment
import test.ztech.views.userprofile.ProfilePageFragment

class MainActivity : DaggerAppCompatActivity(), BottomNavigationView.OnNavigationItemSelectedListener {
    override fun onNavigationItemSelected(p0: MenuItem): Boolean {
        var fragment: Fragment? = null

        when (p0.itemId) {
            R.id.navigation_profile -> {
                fragment = ProfilePageFragment()
            }
        }


        return loadFragment(fragment)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setSupportActionBar(toolbar)
        val actionBar = supportActionBar
        actionBar!!.title = ""
        loadFragment(ProfilePageFragment())

        navigation.setOnNavigationItemSelectedListener(this)
    }

    private fun loadFragment(fragment: Fragment?): Boolean {
        if (fragment != null) {
            supportFragmentManager
                    .beginTransaction()
                    .replace(R.id.home_container, fragment)
                    .addToBackStack(null)
                    .commit()
            return true
        }
        return false
    }


    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.main2, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        val id = item.itemId


        return if (id == R.id.action_settings) {
            toolbar_title.text = settings
            supportActionBar!!.setDisplayShowHomeEnabled(true)
            loadFragment(SettingsFragment())

            true
        } else super.onOptionsItemSelected(item)

    }


    companion object {
        private val settings = "Settings"
    }
}
