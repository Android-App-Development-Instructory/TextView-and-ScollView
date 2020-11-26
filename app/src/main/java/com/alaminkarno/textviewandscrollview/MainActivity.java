package com.alaminkarno.textviewandscrollview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView nameTV,ageTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameTV = findViewById(R.id.nameTV);
        ageTV = findViewById(R.id.ageID);

        nameTV.setText("MD Al-Amin set by JAVA file");
        ageTV.setText("23 Set by JAVA File");
    }
}