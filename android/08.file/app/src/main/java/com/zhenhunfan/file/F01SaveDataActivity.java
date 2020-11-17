package com.zhenhunfan.file;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class F01SaveDataActivity extends AppCompatActivity {
    private Button btnSave;
    private EditText etContent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_f01_save_data);

        etContent = findViewById(R.id.et_f01_save_data_content);

        //看一下文件路径
        Log.d("文件路径",this.getFileStreamPath("f01.txt").getAbsolutePath());

        FileInputStream fileInputStream = null;
        BufferedReader reader = null;
        try {
            fileInputStream =openFileInput("f01.txt");

            FileDescriptor fd = fileInputStream.getFD();

            reader = new BufferedReader(new InputStreamReader(fileInputStream));

            String str = null;
            StringBuilder content = new StringBuilder();
            while ((str=reader.readLine())!=null){
                content.append(str);
            }
            etContent.setText(content.toString());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(reader!=null){
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(fileInputStream!=null){
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     * 按钮保存事件
     * @param view
     */
    public void f01SaveContent(View view){
        BufferedWriter writer = null;
        FileOutputStream fileOutputStream = null;
        try {
            //如果文件不存在则新建，否则将覆盖
            fileOutputStream = openFileOutput("f01.txt", Context.MODE_PRIVATE);
            writer = new BufferedWriter(new OutputStreamWriter(fileOutputStream));

            //写入的路径是 /data/data/packagename/files/f01.txt
            writer.write(etContent.getText().toString());

            Toast.makeText(this, "保存成功", Toast.LENGTH_SHORT).show();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(writer!=null){
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(fileOutputStream!=null){
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
