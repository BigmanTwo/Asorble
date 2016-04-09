package com.example.asus.asorble;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
        private Spinner mSpinner;
    private List<String> mList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mSpinner=(Spinner)findViewById(R.id.spinner);
        mList=new ArrayList<>();
        mList.add("红花");
        mList.add("百花");
        mList.add("紫花");
        mList.add("兰花");
        mList.add("开花");
        mList.add("落花");
        ArrayAdapter adapter=new ArrayAdapter(this,android.R.layout.simple_selectable_list_item,mList);
        mSpinner.setAdapter(adapter);
       
    }
}
