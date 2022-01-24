package com.example.japrof;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CategoriesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categorie);
    }
    public void seeProducts(View view){
        Intent intent = new Intent(getApplicationContext(), ProductsListActivity.class);

        startActivity(intent);
    }


}