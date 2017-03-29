package com.gil_becker.adapterview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        System.out.println("gil");

        System.out.println("becker");


        setContentView(R.layout.activity_main);
        displayGrid();
    }

    private void displayGrid()
    {

        setContentView(R.layout.grid_view);

        GridView gridview = (GridView) findViewById(R.id.gridView);

        gridview.setAdapter(new Grid(this));

        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener(){

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this,""+position,Toast.LENGTH_SHORT).show();
            }

        });
    }

    private void displayList()
    {

        setContentView(R.layout.list_view);

        ListView listview = (ListView) findViewById(R.id.listView);

        listview.setAdapter(new List(this));

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener(){

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this,""+position,Toast.LENGTH_SHORT).show();
            }

        });
    }

}


