package com.codeclan.example.todolist;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.annotation.IntegerRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Date;

public class AddItemActivity extends AppCompatActivity {

    private TextView title;
    private TextView year;
    private TextView month;
    private TextView day;
    private TextView sub1;
    private TextView sub2;
    private TextView sub3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_item);

        title = (TextView) findViewById(R.id.title_text);
        year = (TextView) findViewById(R.id.year_text);
        month = (TextView) findViewById(R.id.month_text);
        day = (TextView) findViewById(R.id.day_text);
        sub1 = (TextView) findViewById(R.id.sub_item_1);
        sub2 = (TextView) findViewById(R.id.sub_item_2);
        sub3 = (TextView) findViewById(R.id.sub_item_3);

    }

    public void onAddItemButtonPressed(View button){

        int yearInt = Integer.parseInt(year.getText().toString());
        int monthInt = Integer.parseInt(month.getText().toString());
        int dayInt = Integer.parseInt(day.getText().toString());

        ListItem newItem = new ListItem(title.getText().toString(), yearInt, monthInt, dayInt);

        SubItem subItem1 = new SubItem(sub1.getText().toString());
        SubItem subItem2 = new SubItem(sub2.getText().toString());
        SubItem subItem3 = new SubItem(sub3.getText().toString());
        newItem.addToSubToDo(subItem1);
        newItem.addToSubToDo(subItem2);
        newItem.addToSubToDo(subItem3);


        SharedPreferences prefs = getSharedPreferences(getString(R.string.pref_key), Context.MODE_PRIVATE);
        String toDoJson = SharedPrefsHelper.getToDoListFromSharedPrefs(prefs);
        ToDoList toDoList = SharedPrefsHelper.getToDoListFromJson(toDoJson);

        toDoList.addItemToToDo(newItem);

        SharedPrefsHelper.writeToSharedPrefs(toDoList, prefs);

        Intent intent = new Intent(this, ToDoListActivity.class);
        intent.putExtra("list", "toDoList");
        startActivity(intent);

    }



}
