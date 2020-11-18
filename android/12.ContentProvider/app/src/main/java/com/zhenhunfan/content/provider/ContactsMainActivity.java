package com.zhenhunfan.content.provider;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class ContactsMainActivity extends AppCompatActivity {

    private EditText et_contact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_contact = findViewById(R.id.et_contact);
    }

    public void openContactList(View view){
        Intent intent = new Intent(this,ContactListActivity.class);
        startActivityForResult(intent,1);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        switch (requestCode){
            case 1:
                if(resultCode == RESULT_OK){
                    String contactContent = data.getStringExtra("contactContent");
                    et_contact.setText(contactContent);
                }else {
                    et_contact.setHint("没有联系人信息");
                }
        }

    }
}
