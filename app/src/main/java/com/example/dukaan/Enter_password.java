package com.example.dukaan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.dukaan.databinding.ActivityEnterPasswordBinding;

public class Enter_password extends AppCompatActivity {

    ActivityEnterPasswordBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        binding = ActivityEnterPasswordBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        binding.setPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!binding.inputpass.getText().toString().isEmpty())
                {
                    Intent intent = new Intent(Enter_password.this,MainActivity.class);
                    startActivity(intent);
                    finish();
                }
                else
                {
                    binding.inputpass.setError("Enter the password");

                }

            }
        });
        binding.backpass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Enter_password.this,Enter_email_id.class);
                startActivity(intent);
                finish();
            }
        });
    }
}