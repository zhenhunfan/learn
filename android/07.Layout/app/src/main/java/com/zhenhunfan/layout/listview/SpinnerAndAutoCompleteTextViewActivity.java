package com.zhenhunfan.layout.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Spinner;

import com.zhenhunfan.layout.R;

import java.util.ArrayList;
import java.util.List;

public class SpinnerAndAutoCompleteTextViewActivity extends AppCompatActivity {

    private Spinner spinner;
    private AutoCompleteTextView actv;
    private List<String> dataList;

    private ArrayAdapter<String> adapter1,adapter2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner_and_auto_complete_text_view);

        spinner = findViewById(R.id.spinner);

        dataList = new ArrayList<>();
        dataList.add("北京");
        dataList.add("上海");

        adapter1 = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,dataList);
        spinner.setAdapter(adapter1);

        actv = findViewById(R.id.auto_complete_text_view);
        String[] arr = {"山东","山西","河南","河北"};
        adapter2 = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,arr);
        actv.setAdapter(adapter2);
    }
}
