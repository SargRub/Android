package com.example.two;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        final Intent intent = getIntent();
        int indexNumber = intent.getIntExtra("indexNumber", 0);

        final TextView textView = new TextView(this);
        textView.setBackgroundColor(Color.BLACK);
        textView.setTextSize(50);
        textView.setGravity(Gravity.CENTER);
        textView.setTextColor(Color.WHITE);
        textView.setText(String.valueOf(indexNumber));
        setContentView(textView);
    }
}
