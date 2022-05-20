package com.halil.ozel.covid19stats.api

import com.halil.ozel.covid19stats.common.models.CountriesResponse
import retrofit2.Response


interface ApiHelper {
    suspend fun getCountryList(): Response<List<CountriesResponse>>
    suspend fun getCountryInfo(country: String): Response<CountriesResponse>
}