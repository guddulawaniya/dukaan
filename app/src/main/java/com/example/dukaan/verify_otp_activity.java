package com.example.dukaan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Toast;

import com.example.dukaan.databinding.ActivityVerifyOtpBinding;

public class verify_otp_activity extends AppCompatActivity {

    ActivityVerifyOtpBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding =ActivityVerifyOtpBinding.inflate(getLayoutInflater());
        getSupportActionBar().hide();
        setContentView(binding.getRoot());

        Intent intent = getIntent();
        String mnumber = intent.getStringExtra("mobilenumber");
        binding.setnumber.setText("Please enter  the 6-digit code sent to you at +91-" + mnumber);

        binding.nextstepotp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if((binding.num1.getText().toString().trim().length()==1) &&
                        (binding.num2.getText().toString().trim().length()==1) &&
                        (binding.num3.getText().toString().trim().length()==1)  &&
                        (binding.num4.getText().toString().trim().length()==1) &&
                        (binding.num5.getText().toString().trim().length()==1) &&
                        (binding.num6.getText().toString().trim().length()==1))
                {
                    Toast.makeText(verify_otp_activity.this, "OTP Verify ", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(verify_otp_activity.this,MainActivity.class);
                    startActivity(intent);
                    finish();

                }
                else
                {
                    Toast.makeText(verify_otp_activity.this, "please Enter the OTP", Toast.LENGTH_SHORT).show();
                }

            }
        });


        binding.backverify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(verify_otp_activity.this,Login_activity.class);
                startActivity(intent);
                finish();
            }
        });

        moveotpnumber();
    }

    private  void moveotpnumber()
    {
        binding.num1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence s, int i, int i1, int i2) {
                if(!s.toString().trim().isEmpty())
                {
                    binding.num2.requestFocus();
                }

            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        binding.num2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int i, int i1, int i2) {
                if (!s.toString().trim().isEmpty())
                {
                    binding.num1.requestFocus();
                }

            }

            @Override
            public void onTextChanged(CharSequence s, int i, int i1, int i2) {
                if(!s.toString().trim().isEmpty())
                {
                    binding.num3.requestFocus();
                }

            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        binding.num3.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int i, int i1, int i2) {
                if (!s.toString().trim().isEmpty())
                {
                    binding.num2.requestFocus();
                }

            }

            @Override
            public void onTextChanged(CharSequence s, int i, int i1, int i2) {
                if(!s.toString().trim().isEmpty())
                {
                    binding.num4.requestFocus();
                }

            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        binding.num4.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int i, int i1, int i2) {
                if (!s.toString().trim().isEmpty())
                {
                    binding.num3.requestFocus();
                }

            }

            @Override
            public void onTextChanged(CharSequence s, int i, int i1, int i2) {
                if(!s.toString().trim().isEmpty())
                {
                    binding.num5.requestFocus();
                }

            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        binding.num5.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int i, int i1, int i2) {

                if (!s.toString().trim().isEmpty())
                {
                    binding.num4.requestFocus();
                }
            }

            @Override
            public void onTextChanged(CharSequence s, int i, int i1, int i2) {
                if(!s.toString().trim().isEmpty())
                {
                    binding.num6.requestFocus();
                }

            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        binding.num6.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int i, int i1, int i2) {

                if (!s.toString().trim().isEmpty())
                {
                    binding.num5.requestFocus();
                }
            }

            @Override
            public void onTextChanged(CharSequence s, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
    }
}