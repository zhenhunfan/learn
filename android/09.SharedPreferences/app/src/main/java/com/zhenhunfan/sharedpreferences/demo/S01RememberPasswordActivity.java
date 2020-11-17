package com.zhenhunfan.sharedpreferences.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class S01RememberPasswordActivity extends AppCompatActivity {

    /*
        轻量级的文件存储方案
        保存在包文件夹下
        以键值对的方式保存
     */
    private SharedPreferences preferences;
    private EditText etUserName, etPassword;
    private CheckBox cbRemember;
    private SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_s01_remember_password);

        etUserName = findViewById(R.id.et_s01_username);
        etPassword = findViewById(R.id.et_s01_password);
        cbRemember = findViewById(R.id.cb_s01_remember);

        //获取preferences
        //除了下面的方式外，还可以getPreferences()
        //用于拿数据
        preferences = PreferenceManager.getDefaultSharedPreferences(this);
        //获取写preferences的对象
        //用于写数据
        editor = preferences.edit();

        boolean isChecked = preferences.getBoolean("isChecked", false);
        if (isChecked) {
            cbRemember.setChecked(true);
            etUserName.setText(preferences.getString("username", ""));
            etPassword.setText(preferences.getString("psw", ""));
        }
    }

    public void login(View view) {
        if (cbRemember.isChecked()) {
            String userName = etUserName.getText().toString();
            String psw = etPassword.getText().toString();
            editor.putString("username", userName);
            editor.putString("psw", psw);
            editor.putBoolean("isChecked", true);
            Toast.makeText(this, "保存成功", Toast.LENGTH_SHORT).show();
        } else {
            editor.clear();
        }
        editor.apply();
        finish();
    }
}
