package com.islavstan.settinggroupchat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
GroupContactsAdapter adapter;
    List<Users> list =new ArrayList();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView =(RecyclerView)findViewById(R.id.recycler);
        adapter =new GroupContactsAdapter(this,list,R.layout.group_members_item);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setAdapter(adapter);
        prepareUserData();
    }

    private void prepareUserData() {
        Users user =new Users("Василий Петров","+3000.58487576");
        list.add(user);
        user =new Users("Василий Кинцов","+3000.969787887");
        list.add(user);
        user =new Users("Василий Кинцов","+3000.969787887");
        list.add(user);
        user =new Users("Василий Кинцов","+3000.969787887");
        list.add(user);
        user =new Users("Василий Кинцов","+3000.969787887");
        list.add(user);
        user =new Users("Василий Кинцов","+3000.969787887");
        list.add(user);
        user =new Users("Василий Кинцов","+3000.969787887");
        list.add(user);
        user =new Users("Василий Кинцов","+3000.969787887");
        list.add(user);
        user =new Users("Василий Кинцов","+3000.969787887");
        list.add(user);
    }
}
