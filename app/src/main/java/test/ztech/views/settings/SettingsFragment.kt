package test.ztech.views.settings


import android.os.Bundle
import android.support.v4.app.Fragment

import test.ztech.R
import android.support.v7.app.AppCompatActivity
import android.view.*
import kotlinx.android.synthetic.main.activity_main.*


/**
 * A simple [Fragment] subclass.
 */
class SettingsFragment : Fragment() {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        setHasOptionsMenu(true)


        val toolbar = activity!!.toolbar
        val appCompatActivity = activity as AppCompatActivity?
        appCompatActivity?.setSupportActionBar(toolbar)
        appCompatActivity?.supportActionBar?.setDisplayHomeAsUpEnabled(true)


        return inflater.inflate(R.layout.fragment_settings, container, false)
    }

    override fun onPrepareOptionsMenu(menu: Menu) {
        menu.findItem(R.id.action_settings).isVisible = false
        super.onPrepareOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        val id = item.itemId

        return if (id == android.R.id.home) {
            activity!!.toolbar_title.text = ""

            fragmentManager!!.popBackStack()
            true
        } else super.onOptionsItemSelected(item)

    }


}// Required empty public constructor
