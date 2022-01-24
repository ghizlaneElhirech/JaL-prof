package com.example.japrof;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void SignUP(View view){
        Intent intent = new Intent(getApplicationContext(), loginActivity.class);
        //Button singup=(Button) findViewById(R.id.signup);
        startActivity(intent);

    }

    public void SignIN(View view){
        Intent intent = new Intent(getApplicationContext(), CategoriesActivity.class);
        //Button singin=(Button) findViewById(R.id.signin);
        startActivity(intent);

    }
    public void seeProducts(View view){
        Intent intent = new Intent(getApplicationContext(), ProductsListActivity.class);

        startActivity(intent);
    }
    public void returnToCategorie(View view) {
        Intent intent = new Intent(getApplicationContext(), CategoriesActivity.class);

        startActivity(intent);
    }
}