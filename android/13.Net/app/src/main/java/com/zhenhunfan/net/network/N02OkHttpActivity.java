package com.zhenhunfan.net.network;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.squareup.okhttp.Callback;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import com.zhenhunfan.net.R;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class N02OkHttpActivity extends AppCompatActivity {

    private TextView tv_response;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_n02_ok_http);

        tv_response = findViewById(R.id.tv_n02_response);
    }

    public void sendRequest(View view){
        sendRealRequest("Http://www.zhenhunfan.com", new Callback() {
            /**
             * 网络访问失败
             * @param request
             * @param e
             */
            @Override
            public void onFailure(Request request, IOException e) {
                showResponse("网络访问失败");
            }

            /**
             * 网络访问成功
             * @param response
             * @throws IOException
             */
            @Override
            public void onResponse(Response response) throws IOException {
                showResponse(response.body().string());
            }
        });
    }

    private void sendRealRequest(final String address, final Callback callback){

        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();

        client.newCall(request).enqueue(callback);
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
