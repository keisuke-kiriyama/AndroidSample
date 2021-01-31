package com.example.outofbusinesscards

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.preference.PreferenceManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onResume() {
        super.onResume()
        PreferenceManager.getDefaultSharedPreferences(this).apply {
            val company = getString("comapany", "'")
            val postal = getString("postal", "'")
            val address = getString("address", "'")
            val tel = getString("tel", "'")
            val fax = getString("fax", "'")

            companyText.text = company
            postalText.text = company
            addressText.text = company
            telText.text = company
            faxText.text = company
        }
    }
}
