package test.ztech.di.module

import android.util.Log
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import dagger.Provides
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import test.ztech.data.network.Api
import javax.inject.Singleton

/**
 * Created by USER on 10/09/2019.
 */
class zModule {

    @Provides
    @Singleton
    internal fun gson(): Gson {
        val gsonBuilder = GsonBuilder()
        return gsonBuilder.create()
    }

    @Provides
    @Singleton
    internal fun gsonConverterFactory(gson: Gson): GsonConverterFactory {
        return GsonConverterFactory.create(gson)
    }

    @Provides
    @Singleton
    internal fun okHttpClient(httpLoggingInterceptor : HttpLoggingInterceptor): OkHttpClient {
        return OkHttpClient()
                .newBuilder()
                .addInterceptor(httpLoggingInterceptor)
                .build()
    }

    @Provides
    @Singleton
    fun httpLoggingInterceptor(): HttpLoggingInterceptor {
        val httpLoggingInterceptor = HttpLoggingInterceptor(HttpLoggingInterceptor.Logger { message -> Log.e("LOGININGINTERCEPTOR",message) })
        httpLoggingInterceptor.level = HttpLoggingInterceptor.Level.BODY
        return httpLoggingInterceptor
    }

    @Provides
    @Singleton
    internal fun retrofit(okHttpClient: OkHttpClient,
                          gsonConverterFactory: GsonConverterFactory): Retrofit {
        return Retrofit.Builder()
                .client(okHttpClient)
                .baseUrl("http://35.226.14.35:8080/api/v1")
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(gsonConverterFactory)
                .build()
    }

    @Provides
    @Singleton
    internal fun LiveFootballApi(retrofit: Retrofit): Api {
        return retrofit.create(Api::class.java)
    }
}