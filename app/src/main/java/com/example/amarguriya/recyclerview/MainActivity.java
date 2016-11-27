package com.example.amarguriya.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
    RecyclerView.LayoutManager layoutManager;
    String[] names,edus;
    int[] imgs={R.drawable.amar,R.drawable.amar,R.drawable.amar,R.drawable.amar,R.drawable.amar,R.drawable.amar,R.drawable.amar,R.drawable.amar,R.drawable.amar,R.drawable.amar,R.drawable.amar,R.drawable.amar,R.drawable.amar,R.drawable.amar,R.drawable.amar,R.drawable.amar,R.drawable.amar,R.drawable.amar,R.drawable.amar,R.drawable.amar,};
    ArrayList<DataProvider> arrayList=new ArrayList<DataProvider>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView= (RecyclerView) findViewById(R.id.recyclerView);
        names=getResources().getStringArray(R.array.names);
        edus=getResources().getStringArray(R.array.education);
        int i=0;
        for(String name : names)
        {
            DataProvider dataProvider=new DataProvider(imgs[i],name,edus[i]);
            arrayList.add(dataProvider);
            i++;
        }

        adapter=new RecyclerAdapter(arrayList,this);
        recyclerView.setHasFixedSize(true);
        layoutManager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);

    }

}