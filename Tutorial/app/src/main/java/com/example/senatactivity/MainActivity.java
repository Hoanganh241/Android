package com.example.senatactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText editEmail;
    private Button btnSend;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editEmail = findViewById(R.id.edit_email);
        btnSend = findViewById(R.id.btn_send);
        
        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nextActivity();
            }
        });
    }

    private void nextActivity() {
        String strEmail = editEmail.getText().toString().trim();
        AppUtil.mEmail = strEmail;

        Intent intent = new Intent(MainActivity.this, MainActivity2.class);
        startActivity(intent);
    }

    @Override
    protected void onResume() {
        super.onResume();
        editEmail.setText(AppUtil.mEmail);
    }
}