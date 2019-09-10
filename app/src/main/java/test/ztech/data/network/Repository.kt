package test.ztech.data.network

import io.reactivex.Observable
import test.ztech.data.models.UserProfileResponse
import javax.inject.Inject

/**
 * Created by USER on 10/09/2019.
 */
class Repository  @Inject constructor(private val api: Api) {

    fun getUserDetails(): Observable<UserProfileResponse> {
        return api.getUserDetails()
    }
}