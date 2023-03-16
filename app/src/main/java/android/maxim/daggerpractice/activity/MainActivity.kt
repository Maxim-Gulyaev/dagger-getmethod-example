package android.maxim.daggerpractice.activity

import android.maxim.daggerpractice.data.DatabaseHelper
import android.maxim.daggerpractice.data.NetworkUtils
import android.maxim.daggerpractice.R
import android.maxim.daggerpractice.di.App
import android.maxim.daggerpractice.di.AppComponent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    private lateinit var appComponent: AppComponent

    private lateinit var databaseHelper: DatabaseHelper
    private lateinit var networkUtils: NetworkUtils

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        appComponent = (application as App).appComponent

        databaseHelper = appComponent.getDatabaseHelper()
        networkUtils = appComponent.getNetworkUtils()
    }
}