package com.tes.eat.anywhere.mylearningsummary.di

import com.tes.eat.anywhere.mylearningsummary.data.ApiDetails
import com.tes.eat.anywhere.mylearningsummary.data.EmployeeApi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

@Module // to define the definition of  depoendancy injection
@InstallIn(SingletonComponent::class) //to define the scope of dependancy injection
class AppModule {
    //define all the dependancies you will use
    @Provides
    //provide the retrofit instance
    fun providesRetrofit(): Retrofit = Retrofit.Builder()
        .addConverterFactory(GsonConverterFactory.create())
        .baseUrl(ApiDetails.BASE_URL)
        .build()

    @Provides
    //to provide the API instance references in code use
    fun provideAPI(retrofit: Retrofit):EmployeeApi=retrofit.create(EmployeeApi::class.java)

}