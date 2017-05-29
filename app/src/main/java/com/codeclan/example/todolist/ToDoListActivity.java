package com.codeclan.example.todolist;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;

public class ToDoListActivity extends AppCompatActivity {

    private ArrayList list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_to_do_list);

        SharedPreferences prefs = getSharedPreferences(getString(R.string.pref_key), Context.MODE_PRIVATE);
        String toDoJson = SharedPrefsHelper.getToDoListFromSharedPrefs(prefs);
        ToDoList toDoList = SharedPrefsHelper.getToDoListFromJson(toDoJson);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();

        if (extras.getString("list").equals("toDoList")) {
            list = toDoList.getToDoList();
        } else if (extras.getString("list").equals("doneList")){
            list = toDoList.getDoneList();
        }

        ListItem listItem = new ListItem("Create To Do List", 2017, 6, 3);
        list.add(listItem);
        ListItem listItem2 = new ListItem("Another Task", 2017, 6, 6);
        list.add(listItem2);

        ToDoListAdapter toDoListAdapter = new ToDoListAdapter(this, list);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(toDoListAdapter);

    }

    // add menu for add item.
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.activity_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.add_item) {
            // TODO: do something
            return true;
        } return super.onOptionsItemSelected(item);
    }


}
