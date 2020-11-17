package com.zhenhunfan.broadcast.demo.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.IntentFilter;
import android.os.Bundle;

import com.zhenhunfan.broadcast.demo.R;
import com.zhenhunfan.broadcast.demo.receiver.B02Receiver;

/**
 * 演示动态注册接收器,接收系统广播,网络变更
 */
public class B02DynamicReceiver extends AppCompatActivity {

    private B02Receiver receiver;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b02_dynamic_receiver);

        IntentFilter filter = new IntentFilter();
        //网络改变
        filter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        receiver = new B02Receiver();
        registerReceiver(receiver,filter);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        unregisterReceiver(receiver);
    }
}
