package com.example.dukaan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.dukaan.databinding.ActivityLoginViewAcivityBinding;

public class Login_view_acivity extends AppCompatActivity {

    RecyclerView.Adapter pmAdapter;
    ActivityLoginViewAcivityBinding binding;
    ViewPager viewpager;

    int[] images = {R.drawable.img1,R.drawable.img2,R.drawable.img3};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        binding = ActivityLoginViewAcivityBinding.inflate(getLayoutInflater());
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(binding.getRoot());

//        ViewPager mViewPager = (ViewPager) findViewById(R.id.viewpager);
//        RecyclerView.Adapter adapterView = new RecyclerView.Adapter(Login_view_acivity.this,images);
//        mViewPager.setAdapter(adapterView);

//        viewpager = (ViewPager)findViewById(R.id.viewpager);
//        pmAdapter = new Adapter(Login_view_acivity.this, images);
//        viewpager.setAdapter(pmAdapter);

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