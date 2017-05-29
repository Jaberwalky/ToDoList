package com.codeclan.example.todolist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ToDoListActivity extends AppCompatActivity {

    private ArrayList<ListItem> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_to_do_list);

        ToDoList toDoList = new ToDoList();

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();

        if (extras.getString("list").equals("toDoList")) {
            list = toDoList.getToDoList();
        } else if (extras.getString("list").equals("doneList")){
            list = toDoList.getDoneList();
        }

        ListItem listItem = new ListItem("Create To Do List", "2017-06-01");
        list.add(listItem);


        ToDoListAdapter toDoListAdapter = new ToDoListAdapter(this, list);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(toDoListAdapter);


        PlusO
    }
}
