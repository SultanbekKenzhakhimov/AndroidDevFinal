package com.halil.ozel.covid19stats.business.repository

import com.kenzhakhimov.sultanbek.covid19stats.api.ApiHelper
import javax.inject.Inject


class Repository @Inject constructor(private val apiHelper: ApiHelper) {
    suspend fun getCountryList() = apiHelper.getCountryList()
    suspend fun getCountryInfo(country: String) = apiHelper.getCountryInfo(country)
}