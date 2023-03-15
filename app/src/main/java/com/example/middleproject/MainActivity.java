package com.example.middleproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;

import com.example.middleproject.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class MainActivity extends AppCompatActivity {

    ArrayList<Bilgiler> arrayList;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        arrayList = new ArrayList<>();

        Bilgiler androidDeveloper = new Bilgiler(R.drawable.android,"Android Developer");
        Bilgiler apple = new Bilgiler(R.drawable.apple,"İOS Developer");

        arrayList.add(androidDeveloper);
        arrayList.add(apple);

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,
                arrayList.stream().map(Bilgiler -> Bilgiler.name).collect(Collectors.toList())
                );
        binding.listView.setAdapter(adapter);

        binding.listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                intent.putExtra("bilgiler",arrayList.get(i));
                startActivity(intent);
            }
        });
    }
}