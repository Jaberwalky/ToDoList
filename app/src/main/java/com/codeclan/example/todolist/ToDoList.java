package com.codeclan.example.todolist;

import java.util.ArrayList;

/**
 * Created by PaulJablonski on 28/05/2017.
 */

public class ToDoList {

    private ArrayList<ListItem> toDoList;
    private ArrayList<ListItem> doneList;

    public ToDoList() {
        this.toDoList = new ArrayList<>();
        this.doneList = new ArrayList<>();
    }


    public void addItemToToDO(ListItem listItem) {
        this.toDoList.add(listItem);
    }

    public ArrayList getList() {
        return this.toDoList;
    }

    public void addItemToDoneList(ListItem listItem) {
        this.doneList.add(listItem);
    }
}
