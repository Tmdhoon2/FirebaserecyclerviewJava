package com.example.firebaserecyclerview;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.bumptech.glide.Glide;
import com.example.firebaserecyclerview.databinding.ActivitySecondActivityrBinding;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {

    private ActivitySecondActivityrBinding binding;
    private ArrayList<User> arrayList;
    private FirebaseDatabase database;
    private DatabaseReference databaseReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivitySecondActivityrBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Intent intent = getIntent();

        //binding.ProfileImage.setImageResource(intent.getIntExtra("cover"));
        binding.UserId.setText(intent.getStringExtra("id"));
        binding.UserPw.setText(intent.getStringExtra("pw"));
        binding.userName.setText(intent.getStringExtra("userName"));

    }
}