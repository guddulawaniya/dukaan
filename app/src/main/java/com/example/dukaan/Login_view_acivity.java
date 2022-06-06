package com.example.dukaan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.dukaan.databinding.ActivityLoginViewAcivityBinding;
import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;

import java.util.ArrayList;
import java.util.List;

public class Login_view_acivity extends AppCompatActivity {

    ActivityLoginViewAcivityBinding binding;

    SliderView sliderView;
    int[] images = {R.drawable.img1,
            R.drawable.img2,
            R.drawable.img3,};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        binding = ActivityLoginViewAcivityBinding.inflate(getLayoutInflater());
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(binding.getRoot());

        sliderView = findViewById(R.id.image_slider);

        SliderAdapter sliderAdapter = new SliderAdapter(images);

        sliderView.setSliderAdapter(sliderAdapter);
        sliderView.setIndicatorAnimation(IndicatorAnimationType.WORM);
        sliderView.setSliderTransformAnimation(SliderAnimations.DEPTHTRANSFORMATION);
        sliderView.startAutoCycle();

        binding.startbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Login_view_acivity.this,Login_activity.class);
                startActivity(intent);
            }
        });

        binding.login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Login_view_acivity.this,Login_activity.class);
                startActivity(intent);
            }
        });


    }
}