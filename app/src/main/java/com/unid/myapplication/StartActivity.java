package com.unid.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;

public class StartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        // 일정 시간 후에 전환할 시간(ms) 설정
        int delayMillis = 3000; // 3초 후에 전환

        // Handler를 사용하여 postDelayed를 호출하여 일정 시간이 지난 후에 다른 액티비티로 전환
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(StartActivity.this, GameActivity.class);
                startActivity(intent);

                // 현재 액티비티를 종료하고 전환 후의 액티비티를 스택에서 Back 버튼으로 돌아갈 때 생략
                finish();
            }
        }, delayMillis);
    }
}

