package com.zhenhunfan.broadcast.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.zhenhunfan.broadcast.demo.view.B01MyBroadcast;
import com.zhenhunfan.broadcast.demo.view.B02DynamicReceiver;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openB01(View view){
        Intent intent = new Intent(this, B01MyBroadcast.class);
        startActivity(intent);
    }

    public void openB02(View view){
        Intent intent = new Intent(this, B02DynamicReceiver.class);
        startActivity(intent);
    }
}
