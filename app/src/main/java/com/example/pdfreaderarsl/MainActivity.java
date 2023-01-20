package com.example.pdfreaderarsl;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Environment;
import android.widget.ListView;

import java.io.File;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lv_pdf;
    public static ArrayList<File> filelist = new ArrayList<>();
    PDFAdapter obj_adapter;
    public static int REQUEST_PERMISSION = 1;
    boolean boolean_permission;
    File dir;//directory



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    lv_pdf = (ListView) findViewById(R.id.listview_pdf);
    dir = new File(Environment.getExternalStorageDirectory().toString());

    permission_fn();
    


    }

    private void permission_fn() {

        if ()



    }
}