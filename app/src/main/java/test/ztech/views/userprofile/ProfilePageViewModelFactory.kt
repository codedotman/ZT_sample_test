package test.ztech.views.userprofile

import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProvider
import test.ztech.data.network.Repository

/**
 * Created by USER on 10/09/2019.
 */
class ProfilePageViewModelFactory constructor(private val mRepository: Repository) : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return if (modelClass.isAssignableFrom(ProfilePageViewModel::class.java))
            ProfilePageViewModel(mRepository) as T
        else {
            throw IllegalArgumentException("Unknown ViewModel class")
        }
    }
}