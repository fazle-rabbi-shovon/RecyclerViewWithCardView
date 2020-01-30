package com.example.recyclerviewwithcardview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private String[] title, disc;
    private int[] flags = {R.drawable.afghanistan,R.drawable.america,R.drawable.bahrain,
            R.drawable.bangladesh,R.drawable.bhutan,R.drawable.canada,
            R.drawable.denmark,R.drawable.finland,R.drawable.ghana,
            R.drawable.hungary,R.drawable.indonesia,R.drawable.japan};
    RecyclerView recyclerView;
    MyAdapter myAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        title = getResources().getStringArray(R.array.country_name);
        disc = getResources().getStringArray(R.array.country_details);
        recyclerView = findViewById(R.id.recyclerViewId);

        myAdapter = new MyAdapter(this,title,disc,flags);

        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        myAdapter.setOnItemClickListener(new MyAdapter.ClickListener() {
            @Override
            public void onItemClick(int position, View v) {
                Toast.makeText(MainActivity.this, "On Item Click"+position, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onItemLongClick(int position, View v) {
                Toast.makeText(MainActivity.this, "On Long Item Click"+position, Toast.LENGTH_SHORT).show();

            }
        });


    }

    int i = 2+3;
}
