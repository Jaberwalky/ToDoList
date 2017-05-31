package com.codeclan.example.todolist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;


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
        String daysString = DateHelper.getDateDifference(listItem);
        dueDateView.setText(daysString);

        TextView detailView = (TextView) findViewById(R.id.detail_text_view);
        detailView.setText(listItem.getDetails());
    }







}
