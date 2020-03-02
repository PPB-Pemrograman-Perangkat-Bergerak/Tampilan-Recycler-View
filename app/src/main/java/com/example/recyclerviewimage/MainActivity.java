package com.example.recyclerviewimage;



import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MyListData[] myListData = new MyListData[] {
                new MyListData("Email"),
                new MyListData("Info"),
                new MyListData("Delete"),
                new MyListData("Dialer"),
                new MyListData("Alert"),
                new MyListData("Map"),
                new MyListData("Email"),
                new MyListData("Info"),
                new MyListData("Delete"),
                new MyListData("Dialer"),
                new MyListData("Alert"),
                new MyListData("Map"),
        };

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        MyListAdapter adapter = new MyListAdapter(myListData);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }
}


