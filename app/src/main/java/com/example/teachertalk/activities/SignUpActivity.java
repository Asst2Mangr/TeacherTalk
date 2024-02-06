package com.example.teachertalk.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.teachertalk.R;
import com.example.teachertalk.databinding.ActivitySignUpBinding;


public class SignUpActivity extends AppCompatActivity {
    private ActivitySignUpBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySignUpBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setListeners();
    }
    private void setListeners () {
        binding.textSignin.setOnClickListener(v -> getOnBackPressedDispatcher());
    }
}