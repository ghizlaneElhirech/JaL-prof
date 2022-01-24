package com.example.japrof;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class loginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

    }

    public void SignIN(View view){
        Intent intent = new Intent(getApplicationContext(), CategoriesActivity.class);
        Button singin=(Button) findViewById(R.id.signin);
        startActivity(intent);

    }
    public void SignUP(View view){
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        //Button singin=(Button) findViewById(R.id.signin);
        startActivity(intent);

    }
    public void ForgetPassword(View view){
        Intent intent=new Intent(getApplicationContext(), SendVerificationCodeActivity.class);
        startActivity(intent);
    }

}