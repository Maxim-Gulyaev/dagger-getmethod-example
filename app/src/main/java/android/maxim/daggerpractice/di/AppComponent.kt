package android.maxim.daggerpractice.di

import android.maxim.daggerpractice.data.DatabaseHelper
import android.maxim.daggerpractice.data.NetworkUtils
import dagger.Component

@Component(modules = [StorageModule::class, NetworkModule::class])
interface AppComponent {

    fun getDatabaseHelper(): DatabaseHelper

    fun getNetworkUtils(): NetworkUtils

}