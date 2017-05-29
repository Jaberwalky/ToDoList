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

    public ArrayList getToDoList() {
        return this.toDoList;
    }

    public ArrayList<ListItem> getDoneList() {
        return this.doneList;
    }

    public void addItemToDoneList(ListItem listItem) {
        this.doneList.add(listItem);
    }


}
