package com.zhenhunfan.layout.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.zhenhunfan.layout.R;

import java.util.ArrayList;
import java.util.List;

public class BaseAdapterActivity extends AppCompatActivity {

    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base_adapter);
        initView();
    }

    private void initView(){
        listView = findViewById(R.id.lv_base_adapter);

        List<FoodInfo> data = new ArrayList<>();
        data.add(new FoodInfo(R.drawable.apple,"苹果","apple"));
        data.add(new FoodInfo(R.drawable.banana,"香蕉","banana"));
        data.add(new FoodInfo(R.drawable.peach,"桃子","peach"));

        FoodAdapter adapter = new FoodAdapter(this,R.layout.food_item,data);

        listView.setAdapter(adapter);
    }
}
