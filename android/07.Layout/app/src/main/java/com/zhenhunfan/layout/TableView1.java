package com.zhenhunfan.layout;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ColorSpace;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import androidx.annotation.Nullable;

/**
 * 自定义TableLayout，用于动态创建表格
 */
public class TableView1 extends LinearLayout {

    //表格的宽高
    private int width, height;
    //表格的行数和列数
    private int rows, columns;
    //布局依附的activity
    private Context mContext;
    //对应布局文件中的tableHead,tableContent
    private TableLayout mTableHead, mTableContent;
    private final int MP = ViewGroup.LayoutParams.MATCH_PARENT;
    private final int WC = ViewGroup.LayoutParams.WRAP_CONTENT;
    private OnTableClick1 mOnTableClick1;

    public TableView1(Context context) {
        super(context);

        //获取屏幕的宽度，以像素为单位
        DisplayMetrics metrics = context.getResources().getDisplayMetrics();
        width = metrics.widthPixels;
        height = metrics.heightPixels;
        mContext = context;
    }

    public TableView1(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);

        //获取屏幕的宽度，以像素为单位
        DisplayMetrics metrics = context.getResources().getDisplayMetrics();
        width = metrics.widthPixels;
        height = metrics.heightPixels;
        mContext = context;
    }

    /**
     * 设置表格的行数和列数，这两个属性并没有放到构造方法里
     *
     * @param rows
     * @param columns
     */
    public void setTable(int rows, int columns,OnTableClick1 onTableClick1) {
        this.rows = rows;
        this.columns = columns;
        mOnTableClick1 = onTableClick1;
    }

    /**
     * 设置表头
     *
     * @param headTitles
     */
    public void setTableHead(String[] headTitles) {
        initTableHead(headTitles);
    }

    /**
     * 初始化表头
     */
    private void initTableHead(String[] titles) {

        //获取tableview布局对象,mContext只的是TableLayoutActivity实例
        //把tableview布局附加到this实例上
        LayoutInflater.from(mContext).inflate(R.layout.tableview, this);
        mTableHead = findViewById(R.id.table_head);
        //设置所有表格都可以伸缩
        mTableHead.setStretchAllColumns(true);
        //默认表头只有一行
        TableRow rowHead = new TableRow(mContext);
        //设置背景颜色为白色
        rowHead.setBackgroundColor(Color.rgb(255, 255, 255));

        for (int col = 0; col < columns; col++) {
            //设置每个表头单元格
            TextView tvHeadUnit = new TextView(mContext);
            tvHeadUnit.setWidth(width / columns);
            tvHeadUnit.setHeight(100);
            tvHeadUnit.setTextSize(18);
            tvHeadUnit.setGravity(Gravity.CENTER);
            //设置粗体
            tvHeadUnit.setTypeface(Typeface.defaultFromStyle(Typeface.BOLD));
            tvHeadUnit.setTextColor(Color.rgb(255, 255, 255));
            tvHeadUnit.setBackgroundResource(R.drawable.shapee_head);
            if (col < titles.length)
                tvHeadUnit.setText(titles[col]);
            rowHead.addView(tvHeadUnit, col);
        }

        mTableHead.addView(rowHead, MP, WC);
    }

    /**
     * 设置表格内容
     */
    public void setTableContent() {
        initTableContent();
    }

    /**
     * 初始化表格内容
     */
    private void initTableContent() {

        //获取tableview布局对象,mContext只的是TableLayoutActivity实例
        //把tableview布局附加到this实例上
        LayoutInflater.from(mContext).inflate(R.layout.tableview, this);
        mTableContent = findViewById(R.id.table_content);
        //设置所有表格都可以伸缩
        mTableContent.setStretchAllColumns(true);

        for (int row = 0; row < rows; row++) {
            TableRow rowContent = new TableRow(mContext);
            //设置背景颜色为白色
            rowContent.setBackgroundColor(Color.rgb(255, 255, 255));

            for (int col = 0; col < columns; col++) {
                TextView tvContent = new TextView(mContext);
                tvContent.setWidth(width / columns);
                tvContent.setHeight(100);
                tvContent.setGravity(Gravity.CENTER);
                tvContent.setText("表格内容");
                tvContent.setOnClickListener(new MyTableListener(row,col,mOnTableClick1));
                if (col < columns - 1) {
                    tvContent.setBackgroundResource(R.drawable.shapee_left);
                } else {
                    tvContent.setBackgroundResource(R.drawable.shapee_right);
                }
                rowContent.addView(tvContent, col);
            }

            mTableContent.addView(rowContent, MP, WC);
        }
    }
}

class MyTableListener implements ViewGroup.OnClickListener{
    int row,col;
    OnTableClick1 onTableClick1;

    public MyTableListener(int row,int col,OnTableClick1 onTableClick1){
        this.row=row;
        this.col=col;
        this.onTableClick1 = onTableClick1;
    }


    @Override
    public void onClick(View v) {
        onTableClick1.onTableClickListener(row,col);
    }
}

interface OnTableClick1 {
    public void onTableClickListener(int row, int col);
}
