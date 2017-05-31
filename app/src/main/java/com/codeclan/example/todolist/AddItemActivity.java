package com.codeclan.example.todolist;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class AddItemActivity extends AppCompatActivity {

    private TextView title;
    private TextView year;
    private TextView month;
    private TextView day;
    private TextView details;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_item);

        title = (TextView) findViewById(R.id.title_text);
        year = (TextView) findViewById(R.id.year_text);
        month = (TextView) findViewById(R.id.month_text);
        day = (TextView) findViewById(R.id.day_text);
        details = (TextView) findViewById(R.id.details_view);

    }

    public void onAddItemButtonPressed(View button){

        int yearInt = Integer.parseInt(year.getText().toString());
        int monthInt = Integer.parseInt(month.getText().toString());
        int dayInt = Integer.parseInt(day.getText().toString());

        ListItem newItem = new ListItem(title.getText().toString(), yearInt, monthInt, dayInt, details.getText().toString());

        SharedPreferences prefs = getSharedPreferences(getString(R.string.pref_key), Context.MODE_PRIVATE);
        String toDoJson = SharedPrefsHelper.getToDoListFromSharedPrefs(prefs);
        ToDoList toDoList = SharedPrefsHelper.getToDoListFromJson(toDoJson);

        toDoList.addItemToToDo(newItem);

        SharedPrefsHelper.writeToSharedPrefs(toDoList, prefs);

        Intent intent = new Intent(this, ToDoListActivity.class);
        startActivity(intent);

    }



}
