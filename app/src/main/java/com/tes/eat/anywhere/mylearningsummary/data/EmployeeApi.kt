package com.tes.eat.anywhere.mylearningsummary.data

import com.tes.eat.anywhere.mylearningsummary.data.model.People
import retrofit2.Response
import retrofit2.http.GET

interface EmployeeApi {//we do not have to any implementation

    @GET(ApiDetails.PEOPLE) //to define type of request GET, POST, PUT
    suspend fun getPeople(): Response<People>
}