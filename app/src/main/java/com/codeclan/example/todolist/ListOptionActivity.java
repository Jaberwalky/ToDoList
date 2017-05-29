package com.codeclan.example.todolist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ButtonBarLayout;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class ListOptionActivity extends AppCompatActivity {

    private TextView toDoQty;
    private TextView doneQty;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_option);

        toDoQty = (TextView) findViewById(R.id.to_do_num_of_items);
        doneQty = (TextView) findViewById(R.id.done_num_of_items);

        ToDoList toDoList = new ToDoList();

        toDoQty.setText(toDoList.getToDoList().size() + " Items");
        doneQty.setText(toDoList.getDoneList().size() + " Items");


    }

    public void onToDoListClicked(View button){
        ToDoList lists = new ToDoList();
        ArrayList toDoList = lists.getToDoList();

        Intent intent = new Intent(this, ToDoListActivity.class);
        intent.putExtra("list", toDoList);
        startActivity(intent);
    }

    public void onDoneListClicked(View button){
        ToDoList lists = new ToDoList();
        ArrayList doneList = lists.getDoneList();

        Intent intent = new Intent(this, ToDoListActivity.class);
        intent.putExtra("list", doneList);
        startActivity(intent);
    }



}
