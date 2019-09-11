package test.ztech.di.builders

import dagger.Module
import dagger.android.ContributesAndroidInjector
import test.ztech.views.MainActivity
import test.ztech.views.userprofile.ProfilePageFragmentProvider

/**
 * Created by USER on 10/09/2019.
 */
@Module
abstract class ActivityBuilder {
    @ContributesAndroidInjector(modules = arrayOf(ProfilePageFragmentProvider::class))
    internal abstract fun contributeMainActivity(): MainActivity
}