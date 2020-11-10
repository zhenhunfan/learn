package com.zhenhunfan.layout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class PercentLayoutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_percent_layout);
    }

    public void openTableLayout(View v){
        Intent intent = new Intent(PercentLayoutActivity.this,TableLayoutActivity.class);
        startActivity(intent);
    }
}
