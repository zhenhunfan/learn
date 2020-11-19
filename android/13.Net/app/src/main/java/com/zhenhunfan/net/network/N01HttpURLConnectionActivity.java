package com.zhenhunfan.net.network;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.zhenhunfan.net.R;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class N01HttpURLConnectionActivity extends AppCompatActivity {

    private TextView tv_response;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_n01_http_url_connection);

        tv_response = findViewById(R.id.tv_n01_response);
    }

    public void sendRequest(View view){

        new Thread(new Runnable() {
            @Override
            public void run() {
                HttpURLConnection connection = null;
                BufferedReader reader = null;

                URL url = null;
                try {
                    url = new URL("http://www.zhenhunfan.com/");
                    connection = (HttpURLConnection)url.openConnection();

                    connection.setRequestMethod("GET");
                    connection.setConnectTimeout(5000);
                    connection.setReadTimeout(5000);

                    InputStream inputStream = connection.getInputStream();
                    reader = new BufferedReader(new InputStreamReader(inputStream));

                    StringBuilder response = new StringBuilder();
                    String line;
                    while ((line=reader.readLine())!=null){
                        response.append(line);
                    }
                    showResponse(response.toString());
                } catch (MalformedURLException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }finally {
                    if(reader!=null){
                        try {
                            reader.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if(connection !=null){
                        connection.disconnect();
                    }
                }

            }
        }).start();
    }

    /**
     * 因为子线程不能修改主线的变量
     */
    private void showResponse(final String response){
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                tv_response.setText(response);
            }
        });
    }
}
