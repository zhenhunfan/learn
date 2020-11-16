package com.zhenhunfan.layout.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.zhenhunfan.layout.R;

public class ListViewActivity extends AppCompatActivity {

    private ListView listView;
    private String[] data= {"apple","banana","peach"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);
        initView();
    }

    private void initView(){
        listView = findViewById(R.id.lv_simple_list_view);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,data);
        listView.setAdapter(adapter);
    }
}
