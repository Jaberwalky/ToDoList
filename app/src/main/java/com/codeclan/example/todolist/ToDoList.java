package com.codeclan.example.todolist;

import android.util.Log;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by PaulJablonski on 28/05/2017.
 */

public class ToDoList implements Serializable {

    private ArrayList<ListItem> toDoList;
    private ArrayList<ListItem> doneList;

    public ToDoList() {
        this.toDoList = new ArrayList<>();
        this.doneList = new ArrayList<>();
    }


    public void addItemToToDo(ListItem listItem) {
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

//    TODO : add method that first finds item in the list then moves selected item to doneList





    public void moveItemToDoneList(ListItem listItem) {
        ArrayList newArrayList = new ArrayList<>();
        for (ListItem item : this.toDoList) {
            if (!item.equals(listItem)) {
                newArrayList.add(item);
            }
        }
        setToDoList(newArrayList);
        this.doneList.add(listItem);
    }

    public void setToDoList(ArrayList toDoList) {
        this.toDoList = toDoList;
    }
}
