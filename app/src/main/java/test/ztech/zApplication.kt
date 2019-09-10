package test.ztech

import dagger.android.AndroidInjector
import dagger.android.DaggerApplication
import test.ztech.di.component.DaggerZComponent




/**
 * Created by USER on 10/09/2019.
 */
class zApplication: DaggerApplication() {
    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return DaggerZComponent.builder().create(this)

    }
}