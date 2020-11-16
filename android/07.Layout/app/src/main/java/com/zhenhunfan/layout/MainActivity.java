package com.zhenhunfan.layout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import com.zhenhunfan.layout.listview.ListViewActivity;
import com.zhenhunfan.layout.listview.MainListViewActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * 打开Percent布局
     * @param view
     */
    public void openPercent(View view){
        Intent intent = new Intent(MainActivity.this,PercentLayoutActivity.class);
        startActivity(intent);
    }

    /**
     * 打开Relative布局
     * @param view
     */
    public void openRelative(View view){
        Intent intent = new Intent(MainActivity.this, RelativeActivity.class);
        startActivity(intent);
    }

    /**
     * 打开Table布局
     * @param view
     */
    public void openTable(View view){
        Intent intent = new Intent(MainActivity.this, TableLayoutActivity.class);
        startActivity(intent);
    }

    /**
     * 打开Linear布局
     * @param view
     */
    public void openLinear(View view){
        Intent intent = new Intent(MainActivity.this, LinearActivity.class);
        startActivity(intent);
    }

    /**
     * 打开Frame布局
     * @param view
     */
    public void openFrame(View view){
        Intent intent = new Intent(MainActivity.this, FrameActivity.class);
        startActivity(intent);
    }

    /**
     * 打开Constraint布局
     * @param view
     */
    public void openConstraint(View view){
        Intent intent = new Intent(MainActivity.this, ConstraintLayoutActivity.class);
        startActivity(intent);
    }

    /**
     * 打开JD案例
     * @param view
     */
    public void openJD(View view){
        Intent intent = new Intent(MainActivity.this, JDLoginActivity.class);
        startActivity(intent);
    }

    /**
     * 打开Draw布局
     * @param view
     */
    public void openDraw(View view){
        Intent intent = new Intent(MainActivity.this, DrawLayoutActivity.class);
        startActivity(intent);
    }

    /**
     * 打开ListView布局
     * @param view
     */
    public void openListView(View view){
        Intent intent = new Intent(MainActivity.this, MainListViewActivity.class);
        startActivity(intent);
    }
}
