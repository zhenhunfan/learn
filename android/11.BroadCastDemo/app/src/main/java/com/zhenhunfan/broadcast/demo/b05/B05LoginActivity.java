package com.zhenhunfan.broadcast.demo.b05;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.zhenhunfan.broadcast.demo.R;

public class B05LoginActivity extends BaseActivity {

    private EditText et_username,et_password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b05_login);

        et_username =  findViewById(R.id.et_b05_username);
        et_password = findViewById(R.id.et_b05_password);
    }

    public void login(View view){
        String username = et_username.getText().toString();
        String password = et_password.getText().toString();

        if("admin".equals(username) && "123".equals(password)){
            Intent intent = new Intent(this,Main2Activity.class);
            startActivity(intent);
            finish();
        }else{
            Toast.makeText(this, "用户名或密码错误", Toast.LENGTH_SHORT).show();
        }
    }
}
