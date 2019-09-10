package test.ztech.di.module

import android.content.Context
import dagger.Module
import dagger.Provides
import test.ztech.data.network.Api
import test.ztech.data.network.Repository
import test.ztech.zApplication
import javax.inject.Singleton

/**
 * Created by USER on 10/09/2019.
 */
@Module
class zMainModule {


    @Singleton
    @Provides
    fun provideContext(application: zApplication): Context {
        return application
    }

    @Provides
    internal fun provideRepository(zApi: Api): Repository {
        return Repository(zApi)
    }
}