package com.codeclan.example.todolist;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ButtonBarLayout;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class ListOptionActivity extends AppCompatActivity {

    private SharedPreferences prefs;
    private Gson gson = new Gson();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_option);

        TextView toDoQty = (TextView) findViewById(R.id.to_do_num_of_items);
        TextView doneQty = (TextView) findViewById(R.id.done_num_of_items);

        String toDoJson = getToDoListFromSharedPrefs();
        ToDoList toDoList = getToDoListFromJson(toDoJson);

        toDoQty.setText(toDoList.getToDoList().size() + " Items");
        doneQty.setText(toDoList.getDoneList().size() + " Items");
    }

    public void onToDoListClicked(View button){
        Intent intent = new Intent(this, ToDoListActivity.class);
        intent.putExtra("list", "toDoList");
        startActivity(intent);
    }

    public void onDoneListClicked(View button){
        Intent intent = new Intent(this, ToDoListActivity.class);
        intent.putExtra("list", "doneList");
        startActivity(intent);
    }

    private String getToDoListFromSharedPrefs(){
        String sharedPrefsKey = getString(R.string.pref_key);
        prefs = getSharedPreferences(sharedPrefsKey, Context.MODE_PRIVATE);
        return prefs.getString("toDoList", gson.toJson(new ToDoList()));
    }

    private ToDoList getToDoListFromJson(String json){
        TypeToken<ToDoList> toDoListObject = new TypeToken<ToDoList>(){};
        return gson.fromJson(json, toDoListObject.getType());
    }



}
