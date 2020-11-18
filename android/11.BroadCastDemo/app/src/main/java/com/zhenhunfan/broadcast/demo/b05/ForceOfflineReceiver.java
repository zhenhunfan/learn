package com.zhenhunfan.broadcast.demo.b05;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;

import android.app.AlertDialog;

public class ForceOfflineReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(final Context context, Intent intent) {
        new AlertDialog.Builder(context)
                .setTitle("警告")
                .setMessage("你已被强制下线,请重新登录")
                .setCancelable(false)
                .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        ActivityCollector.removeAll();
                        Intent intent = new Intent(context,B05LoginActivity.class);
                        context.startActivity(intent);
                    }
                })
                .show();
    }
}
