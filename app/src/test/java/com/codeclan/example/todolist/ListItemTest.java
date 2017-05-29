package com.codeclan.example.todolist;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by PaulJablonski on 28/05/2017.
 */
public class ListItemTest {

    @Test
    public void canGetTitle(){
        ListItem listItem = new ListItem("Create To Do List", 2017, 6, 1);
        assertEquals("Create To Do List", listItem.getTitle());
    }

    @Test
    public void canGetDueMonth(){
        ListItem listItem = new ListItem("Create To Do List", 2017, 6, 1);
        assertEquals(2017, listItem.getYear());
    }

    @Test
    public void canAddSubItem(){
        ListItem listItem = new ListItem("Create To Do List", 2017, 6, 1);
        SubItem subItem = new SubItem("Add subitem to listitem class");
        listItem.addToSubToDo(subItem);
        assertEquals(1, listItem.getSubItemsFromToDo().size());
    }

    @Test
    public void listItemCompletedDefaultsToFalse(){
        ListItem listItem = new ListItem("Create To Do List", 2017, 6, 1);
        assertEquals(false, listItem.getCompleted());
    }








}