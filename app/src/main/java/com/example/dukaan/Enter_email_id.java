package com.example.dukaan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.dukaan.databinding.ActivityEnterEmailIdBinding;

public class Enter_email_id extends AppCompatActivity {
    ActivityEnterEmailIdBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        binding = ActivityEnterEmailIdBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());



        binding.back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Enter_email_id.this,Login_activity.class);
                startActivity(intent);
                finish();
            }
        });

        binding.continuebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



                if (binding.enterEmail.getText().toString().trim().length()!=0)
                {
                    Intent intent = new Intent(Enter_email_id.this,Enter_password.class);
                    startActivity(intent);
                    finish();
                }
                else
                {
                    binding.enterEmail.setError("Enter the Email Id");
                }

            }
        });
    }
}