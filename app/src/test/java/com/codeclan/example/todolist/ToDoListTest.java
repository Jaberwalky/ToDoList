package com.codeclan.example.todolist;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by PaulJablonski on 28/05/2017.
 */
public class ToDoListTest {

    @Test
    public void canAddItemToToDoList(){
        ToDoList todo = new ToDoList();
        ListItem listItem = new ListItem("Create To Do List", 2017, 6, 1, "Finish the bloody project.");
        todo.addItemToToDo(listItem);
        assertEquals(1, todo.getToDoList().size());
    }

    @Test
    public void canAddItemToDoneList(){
        ToDoList todo = new ToDoList();
        ListItem listItem = new ListItem("Create To Do List", 2017, 6, 1, "Finish the bloody project.");
        todo.addItemToDoneList(listItem);
        assertEquals(1, todo.getDoneList().size());
    }




}