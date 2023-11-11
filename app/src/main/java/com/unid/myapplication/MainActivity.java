package com.unid.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText editGrade = (EditText)findViewById(R.id.grade);
        EditText editGclass = (EditText)findViewById(R.id.gclass);
        EditText editNumber = (EditText)findViewById(R.id.number);
        EditText editName = (EditText)findViewById(R.id.name);

        editGrade.setText(editGrade.getText());
        editGclass.setText(editGclass.getText());
        editNumber.setText(editNumber.getText());
        editName.setText(editName.getText());

        String grade = editGrade.getText().toString();
        String gclass = editGclass.getText().toString();
        String number = editNumber.getText().toString();
        String name = editName.getText().toString();

        Button imageButton = (Button) findViewById(R.id.nextBtn);
        imageButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, WelcomeActivity.class);

                intent.putExtra("grade", grade);
                intent.putExtra("g_class", gclass);
                intent.putExtra("number", number);
                intent.putExtra("name", name);

                startActivity(intent);
            }
        });
    }
}