package com.codeclan.example.todolist;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;


public class ListDetailActivity extends AppCompatActivity {

    private ListItem listItem;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_detail);

        Intent intent = getIntent();
        listItem = (ListItem) intent.getSerializableExtra("toDoListItem");

        TextView titleView = (TextView) findViewById(R.id.title_view);
        titleView.setText(listItem.getTitle());

        TextView dueDateView = (TextView) findViewById(R.id.due_date_view);
        String daysString = DateHelper.getDateDifference(listItem);
        dueDateView.setText(daysString);

        TextView detailView = (TextView) findViewById(R.id.detail_text_view);
        detailView.setText(listItem.getDetails());
    }

    public void onMarkCompleteButtonPressed(View button){
        SharedPreferences prefs = getSharedPreferences(getString(R.string.pref_key), Context.MODE_PRIVATE);
        String toDoJson = SharedPrefsHelper.getToDoListFromSharedPrefs(prefs);
        ToDoList toDoList = SharedPrefsHelper.getToDoListFromJson(toDoJson);

        toDoList.removeItemFromToDoList(listItem);
        toDoList.addItemToDoneList(listItem);

        SharedPrefsHelper.writeToSharedPrefs(toDoList, prefs);

        Intent intent = new Intent(this, ToDoListActivity.class);
        startActivity(intent);
    }






}
