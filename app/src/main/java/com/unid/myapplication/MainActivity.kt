package com.unid.myapplication

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val editGrade = findViewById<View>(R.id.grade) as EditText
        val editGclass = findViewById<View>(R.id.gclass) as EditText
        val editNumber = findViewById<View>(R.id.number) as EditText
        val editName = findViewById<View>(R.id.name) as EditText
        editGrade.text = editGrade.text
        editGclass.text = editGclass.text
        editNumber.text = editNumber.text
        editName.text = editName.text
        val grade = editGrade.text.toString()
        val gclass = editGclass.text.toString()
        val number = editNumber.text.toString()
        val name = editName.text.toString()
        val imageButton = findViewById<View>(R.id.nextBtn) as Button
        imageButton.setOnClickListener {
            val intent = Intent(this@MainActivity, WelcomeActivity::class.java)
            intent.putExtra("grade", grade)
            intent.putExtra("g_class", gclass)
            intent.putExtra("number", number)
            intent.putExtra("name", name)
            startActivity(intent)
        }
    }
}