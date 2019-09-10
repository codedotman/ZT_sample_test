package test.ztech.data.models

import android.telecom.Call
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList


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
    var details: Details? = null,
    @SerializedName("posts")
    @Expose
    var posts: List<Post> = ArrayList()

)

data class Post (

    @SerializedName("id")
    @Expose
    var id: String? = null,
    @SerializedName("category_id")
    @Expose
    var categoryId: String? = null,
    @SerializedName("title")
    @Expose
    var title: String? = null,
    @SerializedName("media_url")
    @Expose
    var mediaUrl: String? = null,
    @SerializedName("thumbnail_url")
    @Expose
    var thumbnailUrl: String? = null,
    @SerializedName("created_at")
    @Expose
    var createdAt: String? = null,
    @SerializedName("post_duration")
    @Expose
    var postDuration: Int? = null,
    @SerializedName("user_info")
    @Expose
    var userInfo: UserInfo? = null,
    @SerializedName("comments")
    @Expose
    var comments: List<Comment>? = null,
    @SerializedName("hashtags")
    @Expose
    var hashtags: List<Hashtag>? = null,
    @SerializedName("competition")
    @Expose
    var competition: Competition? = null,
    @SerializedName("comment_count")
    @Expose
    var commentCount: String? = null,
    @SerializedName("like_count")
    @Expose
    var likeCount: String? = null,
    @SerializedName("post_shares_count")
    @Expose
    var postSharesCount: String? = null,
    @SerializedName("post_like_status")
    @Expose
    var postLikeStatus: Any? = null,
    @SerializedName("bookmark_status")
    @Expose
    var bookmarkStatus: Any? = null

)

data class Hashtag (

    @SerializedName("name")
    @Expose
    var name: String? = null

)

data class Details (

    @SerializedName("id")
    @Expose
    var id: String? = null,
    @SerializedName("role_id")
    @Expose
    var roleId: String? = null,
    @SerializedName("fullname")
    @Expose
    var fullname: String,
    @SerializedName("auth_id")
    @Expose
    var authId: String? = null,
    @SerializedName("auth_type")
    @Expose
    var authType: String? = null,
    @SerializedName("username")
    @Expose
    var username: String,
    @SerializedName("avatar")
    @Expose
    var avatar: String,
    @SerializedName("gender")
    @Expose
    var gender: String? = null,
    @SerializedName("height")
    @Expose
    var height: Any? = null,
    @SerializedName("date_of_birth")
    @Expose
    var dateOfBirth: String? = null,
    @SerializedName("email")
    @Expose
    var email: Any? = null,
    @SerializedName("phone_number")
    @Expose
    var phoneNumber: Any? = null,
    @SerializedName("eye_colour")
    @Expose
    var eyeColour: Any? = null,
    @SerializedName("skin_colour")
    @Expose
    var skinColour: Any? = null,
    @SerializedName("biography")
    @Expose
    var biography: String? = null,
    @SerializedName("website")
    @Expose
    var website: Any? = null,
    @SerializedName("address")
    @Expose
    var address: Any? = null,
    @SerializedName("follower_count")
    @Expose
    var followerCount: String? = null,
    @SerializedName("following_count")
    @Expose
    var followingCount: String? = null,
    @SerializedName("post_like_count")
    @Expose
    var postLikeCount: String? = null

    )

