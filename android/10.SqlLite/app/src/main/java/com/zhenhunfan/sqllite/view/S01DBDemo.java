package com.zhenhunfan.sqllite.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.zhenhunfan.sqllite.R;
import com.zhenhunfan.sqllite.utils.MyDBHelper;

public class S01DBDemo extends AppCompatActivity {

    private MyDBHelper helper;
    private SQLiteDatabase database;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_s01_dbdemo);

        helper = new MyDBHelper(this, "mydb.db", 1);
        database = helper.getReadableDatabase();
    }

    /**
     * 创建数据库
     *
     * @param view
     */
    public void createDB(View view) {
        // 在onCreate()中，其实已经相当于创建了数据库
    }

    public void insertData(View view) {

        ContentValues contentValues = new ContentValues();
        contentValues.put("name", "zhenhunfan");
        contentValues.put("age", 33);
        //插入数据后，返回值为-1，则插入失败，否则返回值代表插入的记录的id
        long id = database.insert("person", null, contentValues);
        Toast.makeText(this, "插入记录id为" + id, Toast.LENGTH_SHORT).show();
    }

    public void updateData(View view) {

        ContentValues contentValues = new ContentValues();
        contentValues.put("name", "zhenhunfan2");
        contentValues.put("age", 34);

        //返回值为受影响的行数
        int rows = database.update("person", contentValues, "name = ?", new String[]{"zhenhunfan"});
        Toast.makeText(this, "受影响的行数为" + rows, Toast.LENGTH_SHORT).show();

    }

    public void deleteData(View view) {


        //返回值为受影响的行数
        int rows = database.delete("person", "name = ?", new String[]{"zhenhunfan2"});
        Toast.makeText(this, "受影响的行数为" + rows, Toast.LENGTH_SHORT).show();

    }

    public void queryData(View view) {

        Cursor cursor = database.query("person", null, null, null, null, null, null);
        if (cursor.moveToFirst()) {
            do {
                String name = cursor.getString(cursor.getColumnIndex("name"));
                int age = cursor.getInt(cursor.getColumnIndex("age"));
                Log.d("记录", name + " " + age);
            } while (cursor.moveToNext());
        }

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        database.close();
    }
}
