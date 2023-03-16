package android.maxim.daggerpractice.di

import android.maxim.daggerpractice.data.DatabaseHelper
import dagger.Module
import dagger.Provides

@Module
class StorageModule {

    @Provides
    fun provideDataBaseHelper(): DatabaseHelper {
        return DatabaseHelper()
    }

}