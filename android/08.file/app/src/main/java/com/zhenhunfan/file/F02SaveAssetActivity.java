package com.zhenhunfan.file;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * assets文件夹中的文件不宜超过1m
 */
public class F02SaveAssetActivity extends AppCompatActivity {

    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_f02_save_asset);
        imageView = findViewById(R.id.iv_f02_image);
    }

    /**
     * 把assets中的图片保存到本机某个目录下
     * @param view
     */
    public void f02SaveImage(View view){
        AssetManager assetManager = getAssets();
        InputStream is = null;
        FileOutputStream fileOutputStream = null;
        try {
            is = assetManager.open("wx.jpg");
            fileOutputStream = openFileOutput("wx.jpg", Context.MODE_PRIVATE);
            byte[] buffer = new byte[1024];
            int len = -1;
            while ((len=is.read(buffer))!=-1){
                fileOutputStream.write(buffer,0,len);
            }
            Toast.makeText(this, "保存成功", Toast.LENGTH_SHORT).show();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(fileOutputStream!=null){
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(is!=null){
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     * 加载图片
     * @param view
     */
    public void f02LoadImage(View view){
        String path = getFilesDir().getAbsolutePath()+"/wx.jpg";
        Bitmap bitmap = BitmapFactory.decodeFile(path);
        imageView.setImageBitmap(bitmap);
    }
}
