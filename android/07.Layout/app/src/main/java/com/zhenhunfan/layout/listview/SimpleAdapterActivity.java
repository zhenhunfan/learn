package com.zhenhunfan.layout.listview;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import com.zhenhunfan.layout.R;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class SimpleAdapterActivity extends AppCompatActivity {
    private ListView listView;
    private List<Map<String, Object>> data = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_adapter);
        initView();
    }

    private void initView() {
        listView = findViewById(R.id.lv_simple_adapter);

        Map<String, Object> map = new HashMap<>();
        map.put("icon", R.drawable.apple);
        map.put("name", "苹果");
        map.put("content", "apple");
        data.add(map);

        map = new HashMap<>();
        map.put("icon", R.drawable.banana);
        map.put("name", "香蕉");
        map.put("content", "banana");
        data.add(map);

        map = new HashMap<>();
        map.put("icon", R.drawable.peach);
        map.put("name", "桃子");
        map.put("content", "peach");
        data.add(map);

        SimpleAdapter simpleAdapter = new SimpleAdapter(this, data, R.layout.food_item, new String[]{"icon", "name", "content"},
                new int[]{R.id.iv_food_image, R.id.tv_food_name, R.id.tv_food_content});
        listView.setAdapter(simpleAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(SimpleAdapterActivity.this, (String)data.get(position).get("name"), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
