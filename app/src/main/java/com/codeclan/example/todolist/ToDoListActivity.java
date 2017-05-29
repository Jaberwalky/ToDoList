package com.codeclan.example.todolist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class ToDoListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_to_do_list);

        ToDoList toDoList = new ToDoList();
        ArrayList<ListItem> list = toDoList.getToDoList();

        ToDoListAdapter toDoListAdapter = new ToDoListAdapter(this, list);


    }
}
