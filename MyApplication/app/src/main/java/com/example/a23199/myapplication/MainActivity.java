package com.example.a23199.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.);

        System.out.println("你好");
//        listView = (ListView) findViewById(R.id.listView);
//        String[] names = {"生命壹号", "生命壹号", "生命壹号", "生命壹号", "生命壹号", "生命壹号"};
//        //第二个参数，也可以新建一个布局文件，在这个布局文件的TextView当中设置其他属性。因为每个Item本身就是一个TextView
//        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, names);
//        listView.setAdapter(adapter);test
    }
}

