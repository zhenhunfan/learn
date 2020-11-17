package com.zhenhunfan.broadcast.demo.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.zhenhunfan.broadcast.demo.R;

/**
 * 演示定义广播，和静态注册接收器
 */
public class B01MyBroadcast extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b01_my_broadcast);
    }

    public void sendMyBroadcast(View view){
        Intent intent = new Intent();
        intent.setAction("com.zhenhunfan.broadcast.demo.view.B01MyBroadcast.MYBROADCAST");
        sendBroadcast(intent);
    }
}
