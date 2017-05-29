package com.codeclan.example.todolist;

import java.lang.reflect.Array;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

/**
 * Created by PaulJablonski on 28/05/2017.
 */

public class ListItem {

    private String title;
    private int year;
    private int month;
    private int day;
    private ArrayList<SubItem> subToDoList;
    private ArrayList<SubItem> subDoneList;
    private boolean completed;

    public ListItem(String title, int year, int month, int day){
        this.title = title;
        this.year = year;
        this.month = month;
        this.day = day;
        this.subToDoList = new ArrayList<>();
        this.subDoneList = new ArrayList<>();
        this.completed = false;
    }

    public String getTitle() {
        return this.title;
    }

    public int getYear(){
        return this.year;
    }

    public int getMonth(){
        return this.month;
    }

    public int getDay(){
        return this.day;
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
