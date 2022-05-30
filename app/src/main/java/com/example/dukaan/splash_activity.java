package com.example.dukaan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class splash_activity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_splash);

        TextView textView = findViewById(R.id.textsp);
        Animation textanim = AnimationUtils.loadAnimation(this,R.anim.text_animation);
        textView.startAnimation(textanim);

        ImageView imageView = findViewById(R.id.logo);
        Animation anim = AnimationUtils.loadAnimation(this,R.anim.image_animation);
        imageView.startAnimation(anim);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(splash_activity.this,Login_view_acivity.class);
                startActivity(intent);
                finish();
            }
        },3000);
    }
}