package com.simplemobiletools.filemanager.pro.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.simplemobiletools.filemanager.pro.R
import android.view.View
import kotlinx.android.synthetic.main.activity_about_change.*

class AboutChangeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about_change)
    }

    override fun onResume() {
        super.onResume()

    }
    fun clickBack(view: View) {
        finish()
    }
}
