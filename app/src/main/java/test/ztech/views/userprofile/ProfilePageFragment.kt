package test.ztech.views.userprofile


import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProvider
import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.DividerItemDecoration
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import dagger.android.support.DaggerFragment
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_profile_page.*

import test.ztech.R
import test.ztech.utils.ImageUtils
import javax.inject.Inject


/**
 * A simple [Fragment] subclass.
 */
class ProfilePageFragment : DaggerFragment() {

    @Inject
    internal lateinit var factory: ViewModelProvider.Factory
    private lateinit var mProfileViewModel: ProfilePageViewModel
    private lateinit var mAdapter: PostsAdapter

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_profile_page, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initViews()
        mProfileViewModel = ViewModelProviders.of(this, factory).get(ProfilePageViewModel::class.java)
        populateUsers()

    }

    private fun initViews() {
        mAdapter = PostsAdapter()
        recyclerView2.setHasFixedSize(true)
        recyclerView2.layoutManager = GridLayoutManager(activity, 3)
        recyclerView2.adapter = mAdapter

    }

    private fun populateUsers() {

        mProfileViewModel.getUserDetails().observe(this, Observer{ listResource ->
            if (listResource != null) {
                textView13.visibility = View.VISIBLE
                textView14.visibility = View.VISIBLE
                textView15.visibility = View.VISIBLE
                textView17.visibility = View.VISIBLE
                button2.visibility = View.VISIBLE
                activity!!.toolbar_title.text = listResource.details?.username
                textView2.text = listResource.details?.followerCount
                textView4.text = listResource.details?.followingCount
                textView8.text = listResource.details?.postLikeCount
                textView16.text = listResource.details?.fullname
                ImageUtils.loadRoundImage(listResource.details!!.avatar, imageView)
                mAdapter.setItems(listResource)


            }


        })
    }


}// Required empty public constructor
