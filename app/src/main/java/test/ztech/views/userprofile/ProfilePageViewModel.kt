package test.ztech.views.userprofile

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers
import test.ztech.data.models.UserProfileResponse
import test.ztech.data.network.Repository
import javax.inject.Inject

/**
 * Created by USER on 10/09/2019.
 */
class ProfilePageViewModel  @Inject
constructor(private val repository: Repository
) : ViewModel() {
    private val disposables = CompositeDisposable()

    fun getUserDetails(): LiveData<UserProfileResponse> {

        val data = MutableLiveData<UserProfileResponse>()


        disposables.add(repository.getUserDetails()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(
                        { result ->
                            data.setValue(result)
                            }, { error ->
                }))
        return data
    }

    override fun onCleared() {
        disposables.clear()
    }

}