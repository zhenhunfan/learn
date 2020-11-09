package com.zhenhunfan.launch.mode.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {

    private Button button1;


    public void initView(){
        button1 = findViewById(R.id.btn_start_main_activity);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //用于测试singletask模式
                //Intent intent = new Intent(SecondActivity.this,MainActivity.class);
                //用于测试singleinstance模式
                Intent intent = new Intent(SecondActivity.this,ThirdActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        initView();
        //用于观察是否新建了栈，因为singleinstance模式会新建栈
        Log.d("SecondActivity","task id "+getTaskId());
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("SecondActivity","onDestroy");
    }
}
