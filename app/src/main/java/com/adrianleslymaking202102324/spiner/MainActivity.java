package com.adrianleslymaking202102324.spiner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private Spinner _Spinner1, _Spinner2, _Spinner3, _Spinner4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        _Spinner1=(Spinner)findViewById(R.id.spinner1);
        _Spinner2=(Spinner)findViewById(R.id.spinner2);
        _Spinner3=(Spinner)findViewById(R.id.spinner3);
        _Spinner4=(Spinner)findViewById(R.id.spinner4);

        initSpinner1();
        initSpinner2();
        initSpinner3();
        initSpinner4();

    }
    private void initSpinner1() {
        List<String> buahList=new ArrayList<>();
        buahList.add("Rambutan");
        buahList.add("Langsat");
        buahList.add("Durian");
        buahList.add("Nangka");
        buahList.add("Mangga");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,buahList);
        _Spinner1.setAdapter(arrayAdapter);
    }
    private void initSpinner2() {
        List<String> MahasiswaList =new ArrayList<>();
        for(int i = 1; i <= 1000; i++) {
            MahasiswaList.add("Mahasiswa ke-" +i);
        }
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,MahasiswaList);
        _Spinner2.setAdapter(arrayAdapter);

    }
}