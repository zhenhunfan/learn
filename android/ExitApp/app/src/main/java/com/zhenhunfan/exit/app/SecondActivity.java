package com.zhenhunfan.exit.app;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends BaseActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        initView();
    }

    private void initView(){
        button = findViewById(R.id.btn_exit_app);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ActivityCollector.finishAll();
            }
        });
    }
}
