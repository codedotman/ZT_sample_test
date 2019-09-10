package test.ztech.views.userprofile

import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 * Created by USER on 10/09/2019.
 */
@Module
abstract class ProfilePageFragmentProvider {

    @ContributesAndroidInjector(modules = arrayOf(ProfilePageModule::class))
    internal abstract fun contributeProfileProvider(): ProfilePageFragment

}