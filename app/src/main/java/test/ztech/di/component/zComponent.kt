package test.ztech.di.component

import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import test.ztech.di.builders.ActivityBuilder
import test.ztech.di.module.zMainModule
import test.ztech.di.module.zModule
import test.ztech.zApplication
import javax.inject.Singleton

/**
 * Created by USER on 10/09/2019.
 */
@Singleton
@Component(modules = arrayOf(AndroidSupportInjectionModule::class, zMainModule::class, zModule::class, ActivityBuilder::class))
interface zComponent  : AndroidInjector<zApplication> {
    @Component.Builder
    abstract class Builder : AndroidInjector.Builder<zApplication>()
}