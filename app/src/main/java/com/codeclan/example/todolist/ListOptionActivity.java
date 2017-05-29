package com.codeclan.example.todolist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ButtonBarLayout;
import android.widget.Button;
import android.widget.TextView;

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

        Button showToDo = (Button) findViewById(R.id.show_to_do_list);
        Button showDone = (Button) findViewById(R.id.show_done_list);




    }
}
