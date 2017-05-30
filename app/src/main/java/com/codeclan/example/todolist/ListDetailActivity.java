package com.codeclan.example.todolist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;

import java.util.List;

public class ListDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_detail);

        Intent intent = getIntent();
        ListItem listItem = (ListItem) intent.getSerializableExtra("toDoListItem");

        TextView titleView = (TextView) findViewById(R.id.title_view);
        titleView.setText(listItem.getTitle());

        TextView dueDateView = (TextView) findViewById(R.id.due_date_view);
        String daysString = DateHelper.getDateDifference(listItem.getYear(), listItem.getMonth(), listItem.getDay());
        dueDateView.setText(daysString);
//
//        TextView subItem1 = (TextView) findViewById(R.id.sub_item_1_view);
//        CheckBox sub1Done = (CheckBox) findViewById(R.id.sub_1_done);
//
//
//        TextView subItem2 = (TextView) findViewById(R.id.sub_item_2_view);
//        CheckBox sub2Done = (CheckBox) findViewById(R.id.sub_2_done);
//
//        TextView subItem3 = (TextView) findViewById(R.id.sub_item_3_view);
//        CheckBox sub3Done = (CheckBox) findViewById(R.id.sub_3_done);


    }
}
