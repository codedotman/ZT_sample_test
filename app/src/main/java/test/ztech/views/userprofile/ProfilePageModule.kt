package test.ztech.views.userprofile

import android.arch.lifecycle.ViewModelProvider
import dagger.Module
import dagger.Provides
import test.ztech.data.network.Repository

/**
 * Created by USER on 10/09/2019.
 */
@Module
class ProfilePageModule {
    @Provides
    fun provideViewModel(repository: Repository): ProfilePageViewModel {
        return ProfilePageViewModel(repository)
    }

    @Provides
    fun getViewModelFactory(myRepository: Repository): ViewModelProvider.Factory {
        return ProfilePageViewModelFactory(myRepository)
    }
}