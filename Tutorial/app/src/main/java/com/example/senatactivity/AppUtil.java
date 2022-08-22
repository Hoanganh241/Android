package com.example.senatactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class AppUtil extends AppCompatActivity {
    public static String mEmail = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app_util);
    }
}