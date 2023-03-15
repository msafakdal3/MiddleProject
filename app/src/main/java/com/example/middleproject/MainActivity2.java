package com.example.middleproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.middleproject.databinding.ActivityMain2Binding;

public class MainActivity2 extends AppCompatActivity {

    ImageView imageView;
    TextView textView;

    private ActivityMain2Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        binding = ActivityMain2Binding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        Intent intent = getIntent();
        Bilgiler safak = (Bilgiler)intent.getSerializableExtra("bilgiler");
        binding.imageView.setImageResource(safak.image);
        binding.textView.setText(safak.name);


    }
}