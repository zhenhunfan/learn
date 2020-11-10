package com.zhenhunfan.layout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class TableLayoutActivity extends AppCompatActivity {

    private TableView1 tableView1;
    private String[] headTitles= {"类型","金额","单价","日期"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table_layout);

        tableView1 = findViewById(R.id.table);
        tableView1.setTable(4, 4, new OnTableClick1() {
            @Override
            public void onTableClickListener(int row, int col) {
                Toast.makeText(TableLayoutActivity.this, "col:"+col+" row:"+row, Toast.LENGTH_SHORT).show();
            }
        });
        tableView1.setTableHead(headTitles);
        tableView1.setTableContent();
    }
}
