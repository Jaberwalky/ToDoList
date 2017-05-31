package com.codeclan.example.todolist;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class DoneListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_done_list);

        SharedPreferences prefs = getSharedPreferences(getString(R.string.pref_key), Context.MODE_PRIVATE);
        String toDoJson = SharedPrefsHelper.getToDoListFromSharedPrefs(prefs);
        ToDoList toDoList = SharedPrefsHelper.getToDoListFromJson(toDoJson);

        ArrayList list = toDoList.getDoneList();

        DoneListAdapter doneListAdapter = new DoneListAdapter(this, list);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(doneListAdapter);
    }







}
