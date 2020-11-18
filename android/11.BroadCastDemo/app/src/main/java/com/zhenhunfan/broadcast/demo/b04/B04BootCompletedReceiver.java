package com.zhenhunfan.broadcast.demo.b04;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * 设备启动完成后的接收器
 */
public class B04BootCompletedReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "开机启动", Toast.LENGTH_SHORT).show();
    }
}
