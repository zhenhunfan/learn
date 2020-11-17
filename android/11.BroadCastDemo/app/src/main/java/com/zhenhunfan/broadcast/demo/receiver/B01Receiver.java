package com.zhenhunfan.broadcast.demo.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * 自定义广播接收器
 */
public class B01Receiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "接收到了自定义广播B01", Toast.LENGTH_SHORT).show();
    }
}
