package com.codeclan.example.todolist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ToDoListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_to_do_list);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();

        ArrayList<ListItem> currentList = (ArrayList<ListItem>) extras.getSerializable("list");



        ToDoList toDoList = new ToDoList();
        ArrayList<ListItem> list = toDoList.getToDoList();

        ToDoListAdapter toDoListAdapter = new ToDoListAdapter(this, list);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(toDoListAdapter);
    }
}
