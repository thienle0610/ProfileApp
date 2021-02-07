package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText profileDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

        public void sendProfile (View view){
        Intent intent = new Intent(this, DisplayThienProfile.class);
        startActivity(intent);
    }

        public void sendUyenProfile(View v){
            Intent in = new Intent(this, UyenProfile.class);
            startActivity(in);
        }

}