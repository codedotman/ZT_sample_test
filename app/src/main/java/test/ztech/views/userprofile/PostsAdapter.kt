package test.ztech.views.userprofile

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.post_items.view.*
import test.ztech.R
import test.ztech.data.models.Post
import test.ztech.data.models.UserProfileResponse
import test.ztech.utils.ImageUtils
import java.util.ArrayList

/**
 * Created by USER on 10/09/2019.
 */
class PostsAdapter : RecyclerView.Adapter<PostsAdapter.PostsViewHolder>() {
    private var resultList: List<Post> = ArrayList()

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): PostsViewHolder {
        val view = LayoutInflater.from(p0.context).inflate(R.layout.post_items,
                p0, false)
        return PostsViewHolder(view)    }

    override fun getItemCount(): Int {
        return resultList.size
    }

    override fun onBindViewHolder(p0: PostsViewHolder, p1: Int) {
        val result = resultList[p1]
        ImageUtils.loadImage(result.mediaUrl!!, p0.Tposition)

    }

    inner class PostsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val Tposition = itemView.pixxxs
    }


    fun setItems(resuult: UserProfileResponse) {
        resultList = resuult.posts!!
        notifyDataSetChanged()

    }
}