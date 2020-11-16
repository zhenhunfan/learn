package com.zhenhunfan.layout.listview;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.zhenhunfan.layout.R;
import com.zhenhunfan.layout.listview.adapter.MyRecyclerAdapter;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class RecycleViewDemoActivity extends AppCompatActivity {

    private List<Fruit> fruitList = new ArrayList<>();

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycle_view_demo);

        //准备数据
        Fruit fruit = new Fruit("苹果", R.drawable.apple);

        for (int i = 0; i < 5; i++)
            fruitList.add(fruit);


        recyclerView = findViewById(R.id.recycler_view);
        //控制RecyclerView的显示方向为水平方向
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);

        recyclerView.setLayoutManager(linearLayoutManager);

        MyRecyclerAdapter myRecyclerAdapter = new MyRecyclerAdapter(fruitList,R.layout.recycler_view_item);

        recyclerView.setAdapter(myRecyclerAdapter);
    }
}
