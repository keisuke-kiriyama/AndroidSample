package com.example.outofbusinesscards

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.preference.PreferenceManager
import kotlinx.android.synthetic.main.activity_edit.*

class EditActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit)


        PreferenceManager.getDefaultSharedPreferences(this).apply {
            val company = getString("company", "")
            val postal = getString("postal", "")
            val address = getString("address", "")
            val tel = getString("tel", "")
            val fax = getString("fax", "")

            companyEdit.setText(company)
            postalEdit.setText(postal)
            addressEdit.setText(address)
            telEdit.setText(tel)
            faxEdit.setText(fax)
        }



        saveBtn.setOnClickListener() {
            saveData()
            finish()
        }

        cancelBtn.setOnClickListener() {
            finish()
        }
    }

    private fun saveData() {
        // https://qiita.com/kph7mgb/items/bdaab20ca708df571b46
        val pref = PreferenceManager.getDefaultSharedPreferences(this)
        val editor = pref.edit()
        editor.putString("company", companyEdit.text.toString())
            .putString("postal", postalEdit.text.toString())
            .putString("address", addressEdit.text.toString())
            .putString("tel", telEdit.text.toString())
            .putString("fax", faxEdit.text.toString())
            .apply()

    }
}
