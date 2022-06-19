package com.example.firebaserecyclerview;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivitySecondActivityrBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Bundle extras = getIntent().getExtras();


        String id = extras.getString("id");
        String pw = String.valueOf(extras.getInt("pw"));
        String userName = extras.getString("userName");

        binding.UserId.setText(id);
        binding.UserPw.setText(pw);
        binding.userName.setText(userName);

    }
}