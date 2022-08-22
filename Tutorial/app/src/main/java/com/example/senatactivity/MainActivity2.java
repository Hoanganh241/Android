package com.example.senatactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {


    private EditText editEmail;
    private Button btnUpdate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        editEmail = findViewById(R.id.edit_email);
        btnUpdate = findViewById(R.id.btn_update);

        editEmail.setText(AppUtil.mEmail);

        btnUpdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                backActivity();
            }
        });
    }

    private void backActivity() {
        String strEmailUpdadte = editEmail.getText().toString().trim();
        AppUtil.mEmail = strEmailUpdadte;
        finish();
    }
}