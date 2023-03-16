package android.maxim.daggerpractice.activity

import android.maxim.daggerpractice.data.DatabaseHelper
import android.maxim.daggerpractice.data.NetworkUtils
import android.maxim.daggerpractice.R
import android.maxim.daggerpractice.di.App
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    val appComponent = (application as App).appComponent

    lateinit var databaseHelper: DatabaseHelper
    lateinit var networkUtils: NetworkUtils

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        databaseHelper = appComponent.getDatabaseHelper()
        networkUtils = appComponent.getNetworkUtils()
    }
}