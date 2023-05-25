package com.example.androidproject10_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    private RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup = findViewById(R.id.radioGroup);


        Button btnNewActivity = (Button) findViewById(R.id.btnNewActivity);
        btnNewActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int selectedRadioButtonId = radioGroup.getCheckedRadioButtonId();
                switch (selectedRadioButtonId){
                case R.id.radio1:
                    Intent intent1 = new Intent(getApplicationContext(),secondActivity2.class);
                    startActivity(intent1);
                    break;
                    case R.id.radio2:
                    Intent intent2 = new Intent(getApplicationContext(),thirdActivity2.class);
                    startActivity(intent2);
                    break;
                default:
                    break;

            }}
        });
    }
}