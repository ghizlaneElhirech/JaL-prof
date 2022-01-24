package com.example.japrof;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class BasketActivity extends AppCompatActivity {
 //TextView nameproduit =findViewById(R.id.textView);
 //TextView priceproduit=findViewById(R.id.textView3);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basket);
    }

    public void addToBasket(View view) {
    }


}