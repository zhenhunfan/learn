package com.zhenhunfan.layout.listview.adapter;

import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.zhenhunfan.layout.listview.Fruit;
import com.zhenhunfan.layout.listview.view.holder.MyRecyclerViewHolder;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyRecyclerAdapter extends RecyclerView.Adapter<MyRecyclerViewHolder> {

    private List<Fruit> fruitList;
    private int resourceId;

    public MyRecyclerAdapter(List<Fruit> fruitList, int resourceId) {
        this.fruitList = fruitList;
        this.resourceId = resourceId;
    }

    @NonNull
    @Override
    public MyRecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(resourceId,parent,false);
        MyRecyclerViewHolder myRecyclerViewHolder = new MyRecyclerViewHolder(itemView);
        return myRecyclerViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyRecyclerViewHolder holder, int position) {
        Fruit fruit = fruitList.get(position);
        holder.getFruitImage().setImageResource(fruit.getImageId());
        holder.getFruitName().setText(fruit.getName());
    }

    @Override
    public int getItemCount() {
        return fruitList.size();
    }
}
