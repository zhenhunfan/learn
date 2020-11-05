package com.zhenhunfan.activitytest;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //用膨胀器添加menu资源
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }

    /**
     * option menu 选择事件
     * @param item
     * @return
     */
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.add_item:
                Toast.makeText(this, "add_item", Toast.LENGTH_SHORT).show();
                break;
            case R.id.remove_item:
                Toast.makeText(this, "remove_item", Toast.LENGTH_SHORT).show();
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    /**
     * 初始化视图
     */
    public void initView(){
        button1 = findViewById(R.id.btn1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //视频01：演示toast
                //Toast.makeText(MainActivity.this, "hello mainActivity", Toast.LENGTH_SHORT).show();

                //视频02：演示打开SecondActivity
                //跳转不同的activity,显示intent，从MainActivity 打开SecondActivity
                //Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                //startActivity(intent);

                //跳转不同的activity,隐式intent，从MainActivity 打开SecondActivity，需要在manifest里配一个action
                //Intent intent = new Intent("com.zhenhunfan.ActivityTest.CALL");
                //startActivity(intent);

                //调用拨号应用
                //Intent intent = new Intent();
                //intent.setAction(Intent.ACTION_CALL);
                //intent.setAction(Intent.ACTION_DIAL);
                //intent.setData(Uri.parse("tel:18358112692"));
                //startActivity(intent);

                //打开系统设置界面
                //Intent intent = new Intent();
                //intent.setAction("android.settings.SETTINGS");
                //startActivity(intent);

                //跳转不同的activity,从MainActivity 打开SecondActivity，并且传递数据
                //Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                //intent.putExtra("data","hello secondActivity,I'm MainActivity");
                //startActivity(intent);

                //从MainActivity 打开SecondActivity，并且传递数据，并且接受返回数据
                Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                intent.putExtra("data","hello secondActivity,I'm MainActivity");
                startActivityForResult(intent,1);
            }
        });
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        switch(requestCode){
            case 1:
                if(resultCode == RESULT_OK){
                    String resultData = data.getStringExtra("data");
                    Log.d("返回的值：",resultData);
                }
        }
    }
}
