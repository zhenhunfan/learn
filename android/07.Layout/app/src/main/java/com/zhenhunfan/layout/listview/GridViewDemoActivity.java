package com.zhenhunfan.layout.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;
import android.widget.SimpleAdapter;

import com.zhenhunfan.layout.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GridViewDemoActivity extends AppCompatActivity {
    private GridView gridView;
    private List<Map<String, Object>> data = new ArrayList<>();
//    String[] names = {"苹果","桃子","香蕉","苹果2"};
//    int[] icons = {R.drawable.apple,R.drawable.peach,R.drawable.banana,R.drawable.apple};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_view_demo);

        gridView = findViewById(R.id.grid_view);


        Map<String, Object> map = new HashMap<>();
        map.put("icon", R.drawable.apple);
        map.put("name", "苹果");
        data.add(map);

        map = new HashMap<>();
        map.put("icon", R.drawable.banana);
        map.put("name", "香蕉");
        data.add(map);

        map = new HashMap<>();
        map.put("icon", R.drawable.peach);
        map.put("name", "桃子");
        data.add(map);

        map = new HashMap<>();
        map.put("icon", R.drawable.peach);
        map.put("name", "桃子2");
        data.add(map);

        SimpleAdapter adapter = new SimpleAdapter(this,data,R.layout.grid_item,new String[]{"icon","name"},
                new int[]{R.id.iv_grid_item_img,R.id.tv_grid_item_text});
        gridView.setAdapter(adapter);
    }
}
