package com.zhenhunfan.ui.component.test;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * 打开normal对话框
     * @param view
     */
    public void startNormalDialog(View view){
        new AlertDialog.Builder(this)
                .setTitle("普通对话框")
                .setMessage("对话框内容")
                .setCancelable(true)
                .setPositiveButton("确定", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(MainActivity.this, "点击了确定按钮", Toast.LENGTH_SHORT).show();
                    }
                })
                .setNegativeButton("取消", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(MainActivity.this, "点击了取消按钮", Toast.LENGTH_SHORT).show();
                    }
                })
                .show();
    }

    /**
     * 打开单选/复选对话框
     * @param view
     */
    public void startListDialog(View view){
        final String[] colors = {"Green","Blue","Red","Yellow"};
        new AlertDialog.Builder(this)
                .setTitle("单选/复选对话框")
                .setCancelable(false)
                .setSingleChoiceItems(colors, -1, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(MainActivity.this, colors[which], Toast.LENGTH_SHORT).show();
                    }
                })
                //.setMultiChoiceItems()  设置复选对话框
                .setPositiveButton("确定", null)
                .show();
    }

    /**
     * 打开自定义对话框
     * @param view
     */
    public void startCustomDialog(View view){
        View v = View.inflate(this,R.layout.custom_dialog,null);
        final EditText et_username = v.findViewById(R.id.et_username);
        final EditText et_pwd = v.findViewById(R.id.et_pwd);

        new AlertDialog.Builder(this)
                .setTitle("单选/复选对话框")
                .setCancelable(false)
                .setView(v)
                .setPositiveButton("确定", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(MainActivity.this, "username:"+et_username.getText()+" pwd:"+et_pwd.getText(), Toast.LENGTH_SHORT).show();
                    }
                })
                .show();
    }

    /**
     * 打开Camera Activity
     * @param view
     */
    public void startCameraActivity(View view){
        Intent intent = new Intent(MainActivity.this,CameraActivity.class);
        startActivity(intent);
    }
}
