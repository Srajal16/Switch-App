package com.example.dayandnight;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    TextView tv;
    @SuppressLint("UseSwitchCompatOrMaterialCode")
    Switch sw;
    ConstraintLayout ct;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = findViewById(R.id.tv);
        sw = findViewById(R.id.sw);
        ct = findViewById(R.id.ct);

        sw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (sw.isChecked()){
                    tv.setText("Dark mode is on !");
                    tv.setTextColor(Color.WHITE);
                    ct.setBackgroundColor(Color.BLACK);
                    sw.setTextColor(Color.WHITE);

                }
                else {
                    tv.setText("Light mode is on !");
                    tv.setTextColor(Color.BLACK);
                    ct.setBackgroundColor(Color.WHITE);
                    sw.setTextColor(Color.BLACK);
                }
            }
        });
    }
}