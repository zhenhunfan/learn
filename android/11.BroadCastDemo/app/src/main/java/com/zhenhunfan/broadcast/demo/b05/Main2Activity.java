package com.zhenhunfan.broadcast.demo.b05;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.zhenhunfan.broadcast.demo.R;

public class Main2Activity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void forceOffLine(View view){
        Intent intent = new Intent();
        intent.setAction("com.zhenhunfan.broadcast.demo.b05.FORCE_OFFLINE");
        sendBroadcast(intent);
    }
}
