package com.zhenhunfan.layout.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.zhenhunfan.layout.R;

public class MainListViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_list_view);
    }

    /**
     * 打开Simple ListView
     * @param view
     */
    public void openSimpleListView(View view) {
        Intent intent = new Intent(MainListViewActivity.this, ListViewActivity.class);
        startActivity(intent);
    }


    /**
     * 打开带图片的 ListView,Fruit
     * @param view
     */
    public void openFruitListView(View view) {
        Intent intent = new Intent(MainListViewActivity.this, FruitListViewActivity.class);
        startActivity(intent);
    }
}
