package com.zhenhunfan.net;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.zhenhunfan.net.network.N01HttpURLConnectionActivity;
import com.zhenhunfan.net.network.N02OkHttpActivity;

/**
 * 演示网络访问
 * Http 访问网络的方式
 * 1. 安卓官方提供的HttpURLConnection类及其相关方法
 * 2. OkHttp 第三方提供的高效的网络访问开发包
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openN01(View view){
        startActivity(new Intent(this, N01HttpURLConnectionActivity.class));
    }

    public void openN02(View view){
        startActivity(new Intent(this, N02OkHttpActivity.class));
    }
}
