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
    private ArrayList<SubItem> subToDoList;
    private ArrayList<SubItem> subDoneList;
    private boolean completed;

    public ListItem(String title, String dueDate){
        this.title = title;
        this.dueDate = dueDate;
        this.subToDoList = new ArrayList<>();
        this.subDoneList = new ArrayList<>();
        this.completed = false;
    }

    public String getTitle() {
        return this.title;
    }

    public String getDueDate() {
        return this.dueDate;
    }

    public void addToSubToDo(SubItem subItem) {
        this.subToDoList.add(subItem);
    }

    public ArrayList<SubItem> getSubItemsFromToDo() {
        return this.subToDoList;
    }

    public ArrayList<SubItem> getSubItemsFromDone(){
        return this.subDoneList;
    }

    public boolean getCompleted() {
        return this.completed;
    }
}
