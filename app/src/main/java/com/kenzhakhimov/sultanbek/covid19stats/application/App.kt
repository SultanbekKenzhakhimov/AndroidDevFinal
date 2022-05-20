package com.halil.ozel.covid19stats.application

import android.app.Application
import com.kenzhakhimov.sultanbek.common.utils.NetworkHelper
import dagger.hilt.android.HiltAndroidApp
import javax.inject.Inject

@HiltAndroidApp
class App : Application() {
    @Inject
    lateinit var networkHelper: NetworkHelper
}