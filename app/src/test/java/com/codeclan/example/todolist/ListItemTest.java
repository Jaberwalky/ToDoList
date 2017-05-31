package com.codeclan.example.todolist;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by PaulJablonski on 28/05/2017.
 */
public class ListItemTest {

    @Test
    public void canGetTitle(){
        ListItem listItem = new ListItem("Create To Do List", 2017, 6, 1, "Finish the bloody project.");
        assertEquals("Create To Do List", listItem.getTitle());
    }

    @Test
    public void canGetDueMonth(){
        ListItem listItem = new ListItem("Create To Do List", 2017, 6, 1, "Finish the bloody project.");
        assertEquals(2017, listItem.getYear());
    }

    @Test
    public void canGetDetails(){
        ListItem listItem = new ListItem("Create To Do List", 2017, 6, 1, "Finish the bloody project.");
        assertEquals("Finish the bloody project.", listItem.getDetails());
    }









}