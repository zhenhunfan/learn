package com.zhenhunfan.file;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openF01(View view){
        Intent intent = new Intent(MainActivity.this,F01SaveDataActivity.class);
        startActivity(intent);
    }

    public void openF02(View view){
        Intent intent = new Intent(MainActivity.this,F02SaveAssetActivity.class);
        startActivity(intent);
    }
}
