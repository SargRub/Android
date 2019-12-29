package com.example.androidnarek2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.two.SecondActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onClick(final View v) {
        final EditText editText = findViewById(R.id.edit_text);
        final String indexText = editText.getText().toString();
        final int indexNumber = Integer.parseInt(indexText);
        if(indexNumber <= 13 && indexNumber >= 0) {
            final Intent intent = new Intent(this, SecondActivity.class);
            intent.putExtra("indexNumber", indexNumber);
            startActivity(intent);
        }
        else
        {
            Toast.makeText(this, "Error", Toast.LENGTH_SHORT).show();
        }
    }
}
