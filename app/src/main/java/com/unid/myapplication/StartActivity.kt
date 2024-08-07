package com.unid.myapplication

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity

class StartActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)

        // 일정 시간 후에 전환할 시간(ms) 설정
        val delayMillis = 3000 // 3초 후에 전환

        // Handler를 사용하여 postDelayed를 호출하여 일정 시간이 지난 후에 다른 액티비티로 전환
        Handler().postDelayed({
            val intent = Intent(this@StartActivity, GameActivity::class.java)
            startActivity(intent)

            // 현재 액티비티를 종료하고 전환 후의 액티비티를 스택에서 Back 버튼으로 돌아갈 때 생략
            finish()
        }, delayMillis.toLong())
    }
}