package test.ztech.data.network

import io.reactivex.Observable
import retrofit2.http.GET
import test.ztech.data.models.UserProfileResponse

/**
 * Created by USER on 10/09/2019.
 */
interface Api {
    @GET("/users/-LmKkNDAh60zMZt1GrI4")
    fun getUserDetails(): Observable<UserProfileResponse>
}