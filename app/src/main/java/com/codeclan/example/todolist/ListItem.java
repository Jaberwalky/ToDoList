package com.codeclan.example.todolist;

import java.lang.reflect.Array;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

/**
 * Created by PaulJablonski on 28/05/2017.
 */

public class ListItem {

    private String title;
    private String dueDate;
    private ArrayList<SubItem> subItems;
    private boolean completed;

    public ListItem(String title, String dueDate){
        this.title = title;
        this.dueDate = dueDate;
        this.subItems = new ArrayList<>();
        this.completed = false;
    }

    public String getTitle() {
        return this.title;
    }

    public String getDueDate() {
        return this.dueDate;
    }

    public void addSubItem(SubItem subItem) {
        this.subItems.add(subItem);
    }

    public ArrayList<SubItem> getSubItems() {
        return this.subItems;
    }

    public boolean getCompleted() {
        return this.completed;
    }
}
