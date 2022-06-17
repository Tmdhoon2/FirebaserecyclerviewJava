package com.example.firebaserecyclerview;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.CustomViewHolder> {

    private ArrayList<User> arrayList;                                                                                  // ArrayList of User
    private Context context;                                                                                            // Context

    public CustomAdapter(ArrayList<User> arrayList, Context context) {                                                  // CustomAdapter Method
        this.arrayList = arrayList;
        this.context = context;
    }


    @NonNull
    @Override
    public CustomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item,parent,false);      //
        CustomViewHolder holder = new CustomViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull CustomViewHolder holder, int position) {

        Glide.with(holder.itemView)                                                                                   // Glide 호출
                .load(arrayList.get(position).getCover())                                                             // arraylist에서 이미지 불러오기
                .into(holder.cover);                                                                                  // into cover
        holder.id.setText(arrayList.get(position).getId());
        holder.pw.setText(String.valueOf(arrayList.get(position).getPw()));
        holder.userName.setText(arrayList.get(position).getUserName());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, SecondActivity.class);
                intent.putExtra("cover", arrayList.get(position).getCover());
                intent.putExtra("id", arrayList.get(position).getId());
                intent.putExtra("pw", arrayList.get(position).getPw());
                intent.putExtra("userName", arrayList.get(position).getUserName());
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        // 삼항 연산자
        return (arrayList !=null ? arrayList.size() : 0);
    }

    public class CustomViewHolder extends RecyclerView.ViewHolder {
        ImageView cover;
        TextView id;
        TextView pw;
        TextView userName;

        public CustomViewHolder(@NonNull View itemView) {
            super(itemView);
            this.cover = itemView.findViewById(R.id.cover);
            this.id = itemView.findViewById(R.id.id);
            this.pw = itemView.findViewById(R.id.pw);
            this.userName = itemView.findViewById(R.id.userName);
        }
    }
}
