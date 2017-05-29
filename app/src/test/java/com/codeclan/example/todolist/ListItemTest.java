package com.codeclan.example.todolist;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by PaulJablonski on 28/05/2017.
 */
public class ListItemTest {

    @Test
    public void canGetTitle(){
        ListItem listItem = new ListItem("Create To Do List", "2017-06-01");
        assertEquals("Create To Do List", listItem.getTitle());
    }

    @Test
    public void canGetDueDate(){
        ListItem listItem = new ListItem("Create To Do List", "2017-06-01");
        assertEquals("2017-06-01", listItem.getDueDate());
    }

    @Test
    public void canAddSubItem(){
        ListItem listItem = new ListItem("Create To Do List", "2017-06-01");
        SubItem subItem = new SubItem("Add subitem to listitem class");
        listItem.addSubItem(subItem);
        assertEquals(1, listItem.getSubItems().size());
    }

    @Test
    public void listItemCompletedDefaultsToFalse(){
        ListItem listItem = new ListItem("Create To Do List", "2017-06-01");
        assertEquals(false, listItem.getCompleted());
    }






}