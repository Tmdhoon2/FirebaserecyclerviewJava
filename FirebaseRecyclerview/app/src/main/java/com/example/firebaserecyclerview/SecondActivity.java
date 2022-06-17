package com.example.firebaserecyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.bumptech.glide.Glide;
import com.example.firebaserecyclerview.databinding.ActivitySecondActivityrBinding;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {

    private ActivitySecondActivityrBinding binding;
    private FirebaseDatabase database;
    private DatabaseReference databaseReference;
    private ArrayList<User> arrayList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivitySecondActivityrBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        database = FirebaseDatabase.getInstance();

        databaseReference = database.getReference("User");
    }
}