package com.zhenhunfan.layout.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

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
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            /**
             *
             * @param parent
             * @param view ListItem的视图
             * @param position
             * @param id
             */
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Fruit fruit = fruits.get(position);
                Toast.makeText(FruitListViewActivity.this, fruit.getName(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
