package com.zhenhunfan.layout;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.annotation.Nullable;

/**
 * 自定义布局
 */
public class TitleLayout extends LinearLayout {
    public TitleLayout(final Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        View v = LayoutInflater.from(context).inflate(R.layout.title_bar, this);
        Button btnBack = v.findViewById(R.id.btn_title_back);
        Button btnEdit = v.findViewById(R.id.btn_edit);

        btnBack.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                ((Activity)context).finish();
            }
        });

        btnEdit.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "点击了"+context.getClass().getSimpleName()+"上的编辑按钮", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
