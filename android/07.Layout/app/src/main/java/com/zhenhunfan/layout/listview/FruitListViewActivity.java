package com.zhenhunfan.layout.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.zhenhunfan.layout.R;

import java.util.ArrayList;

public class FruitListViewActivity extends AppCompatActivity {
    private ListView listView;
    private ArrayList<Fruit> fruits = new ArrayList<Fruit>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fruit_list_view);
        initView();
    }

    public void initView(){
        listView = findViewById(R.id.lv_fruit_list_view);
        fruits.add(new Fruit("apple",R.drawable.apple));
        fruits.add(new Fruit("banana",R.drawable.banana));
        fruits.add(new Fruit("peach",R.drawable.peach));

        FruitAdapter fruitAdapter = new FruitAdapter(FruitListViewActivity.this,R.layout.fruit_item,fruits);
        listView.setAdapter(fruitAdapter);
    }
}
