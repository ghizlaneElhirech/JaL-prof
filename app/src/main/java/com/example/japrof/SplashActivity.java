package com.example.japrof;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class SplashActivity extends AppCompatActivity {
    private static int SPLASH_TIME_OUT=1500;
    Animation topAnim;
    TextView welcometxt;
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        //getSupportActionBar().hide();
       new Handler().postDelayed(()->{
               Intent intent=new Intent(SplashActivity.this,MainActivity.class);
                 startActivity(intent);
                 finish();

        },SPLASH_TIME_OUT);
       //welcometxt=(TextView)findViewById(R.id.splash);

       topAnim= AnimationUtils.loadAnimation(this,R.anim.top_animation);
       //welcometxt.setText("JA l'PROF");


    }

}