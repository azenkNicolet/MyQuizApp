package com.zenk.myquizapp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class ResultActivity : AppCompatActivity() {

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val tvName: TextView = findViewById(R.id.tv_name)
        val tvScore: TextView = findViewById(R.id.tv_score)
        val btnFinish: Button = findViewById(R.id.btn_finish)

        tvName.text = intent.getStringExtra(Constants.USER_NAME).toString()
        /*tvScore.text = "Your Score is " +
                intent.getIntExtra(Constants.CORRECT_ANSWERS, 0).toString() + " out of " +
                intent.getIntExtra(Constants.TOTAL_QUESTIONS, 0).toString() + "!" */
        val correctAnswers: String = intent.getIntExtra(Constants.CORRECT_ANSWERS,0).toString()
        val totalQuestions: String = intent.getIntExtra(Constants.TOTAL_QUESTIONS, 0).toString()

        tvScore.text = "Your Score is $correctAnswers out of $totalQuestions"

        btnFinish.setOnClickListener{
            startActivity(Intent(this, MainActivity::class.java))
        }

    }
}