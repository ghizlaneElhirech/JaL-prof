package com.example.japrof;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class resendCodeVerificationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resend_code_verification);
    }
    public void SignIN(View view) {
        Intent intent = new Intent(getApplicationContext(), loginActivity.class);

        startActivity(intent);
    }
}