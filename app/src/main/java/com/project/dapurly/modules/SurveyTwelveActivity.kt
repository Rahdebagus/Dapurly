package com.project.dapurly.modules

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.project.dapurly.R
import com.project.dapurly.databinding.ActivitySurveyTenBinding
import com.project.dapurly.databinding.ActivitySurveyTwelveBinding

class SurveyTwelveActivity : AppCompatActivity() {

    lateinit var binding: ActivitySurveyTwelveBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySurveyTwelveBinding.inflate(layoutInflater)
        setContentView(binding.root)




        binding.btnLanjut.setOnClickListener {
            val intent = Intent(this@SurveyTwelveActivity, HomepageActivity::class.java)
            startActivity(intent)
        }
    }
}