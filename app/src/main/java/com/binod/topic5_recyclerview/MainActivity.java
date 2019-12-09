package com.binod.topic5_recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private  static RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //binding
        recyclerView = findViewById(R.id.recyclerView);

        //create list of contact to display in recyclerview
        List<Contacts> contactsList = new ArrayList<>();
        contactsList.add(new Contacts("Robert","9867543089", R.drawable.logo));
        contactsList.add(new Contacts("John", "9846530001", R.drawable.logo));
        contactsList.add(new Contacts("Roman","9867517650", R.drawable.logo));

        contactsAdapter contactsAdapter = new contactsAdapter(this, contactsList);
        recyclerView.setAdapter(contactsAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
