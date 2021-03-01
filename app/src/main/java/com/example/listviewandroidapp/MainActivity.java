package com.example.listviewandroidapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String data[]={
            "Country No. 1",
            "Country No. 2",
            "Country No. 3",
            "Country No. 4",
            "Country No. 5",
            "Country No. 6",
            "Country No. 7",
            "Country No. 8",
            "Country No. 9",
            "Country No. 10",
            "Country No. 11",
            "Country No. 12",
            "Country No. 13",
            "Country No. 14",
            "Country No. 15",
            "Country No. 16",
            "Country No. 17",
            "Country No. 18",
            "Country No. 19",
            "Country No. 20",
            "Country No. 21",
            "Country No. 22",
            "Country No. 23",
            "Country No. 24",
            "Country No. 25",
            "Country No. 26",
            "Country No. 27",
            "Country No. 28",
            "Country No. 29",
            "Country No. 30",
    };

    ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv=findViewById(R.id.listView);

        ArrayAdapter adapter= new ArrayAdapter(MainActivity.this, android.R.layout.simple_list_item_1, data);
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "You clicked on "+data[position], Toast.LENGTH_SHORT).show();
            }
        });
    }

}