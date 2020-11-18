package com.zhenhunfan.broadcast.demo.b03;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.SmsMessage;
import android.widget.Toast;

/**
 * 演示短信接收器
 */
public class B03SmsReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Bundle bundle = intent.getExtras();
        Object[] obj = (Object[]) bundle.get("pdus");
        String format = intent.getStringExtra("format");
        SmsMessage message = SmsMessage.createFromPdu((byte[])obj[0],format);
        //短信发件人
        String address = message.getOriginatingAddress();
        //短信内容
        String content = message.getMessageBody();

        Toast.makeText(context, " 短信发送人:" + address + " 短信内容:" + content, Toast.LENGTH_SHORT).show();
    }
}
