package test.ztech.data.models

import android.telecom.Call
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * Created by USER on 10/09/2019.
 */

data class Comment (

    @SerializedName("id")
    @Expose
    var id: String? = null,
    @SerializedName("comment")
    @Expose
    var comment: String? = null,
    @SerializedName("created_at")
    @Expose
    var createdAt: String? = null,
    @SerializedName("commenter_id")
    @Expose
    var commenterId: String? = null,
    @SerializedName("commenter_avatar")
    @Expose
    var commenterAvatar: String? = null,
    @SerializedName("commenter_name")
    @Expose
    var commenterName: String? = null

)

data class Competition (

    @SerializedName("cpid")
    @Expose
    var cpid: String? = null,
    @SerializedName("title")
    @Expose
    var title: String? = null,
    @SerializedName("vote_end_date")
    @Expose
    var voteEndDate: String? = null,
    @SerializedName("judge_status")
    @Expose
    var judgeStatus: String? = null,
    @SerializedName("vote_status")
    @Expose
    var voteStatus: Any? = null

)

data class UserInfo (

    @SerializedName("user_id")
    @Expose
    var userId: String? = null,
    @SerializedName("role_id")
    @Expose
    var roleId: String? = null,
    @SerializedName("fullname")
    @Expose
    var fullname: String? = null,
    @SerializedName("username")
    @Expose
    var username: String? = null,
    @SerializedName("avatar")
    @Expose
    var avatar: String? = null

)

data class UserProfileResponse (

    @SerializedName("details")
    @Expose
    var details: Call.Details? = null
    //@SerializedName("posts")
    //@Expose
    //var posts: List<Post>? = null

)
