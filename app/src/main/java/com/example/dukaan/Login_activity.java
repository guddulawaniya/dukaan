package com.example.dukaan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.dukaan.databinding.ActivityLoginBinding;

public class Login_activity extends AppCompatActivity {

    ActivityLoginBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        binding = ActivityLoginBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        binding.email.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Login_activity.this,Enter_email_id.class);
                startActivity(intent);
            }
        });
        binding.backlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Login_activity.this,Login_view_acivity.class);
                startActivity(intent);
                finish();
            }
        });

        EditText mobile = findViewById(R.id.inputNumber);

        String number = mobile.getText().toString();


        binding.numberconitinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (binding.inputNumber.getText().toString().trim().length()==10)
                {
                    Intent intent = new Intent(Login_activity.this,verify_otp_activity.class);
                    intent.putExtra("mobilenumber", number);
                    startActivity(intent);
                }
                else if (binding.inputNumber.getText().toString().trim().isEmpty()){
                    binding.inputNumber.setError("Please enter the Mobile number");
                }
                else
                {
                    binding.inputNumber.setError("Invalid number");
                }

            }
        });


    }
}