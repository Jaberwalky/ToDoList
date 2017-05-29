package com.codeclan.example.todolist;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by PaulJablonski on 28/05/2017.
 */

public class SubItemTest {

    @Test
    public void canAddSubItem(){
        SubItem subItem = new SubItem("Create sub item class.");
        assertEquals("Create sub item class.", subItem.getTitle());
    }

    @Test
    public void subItemCompletedDefaultsToFalse(){
        SubItem subItem = new SubItem("Check sub item completed variable defaults to false");
        assertEquals(false, subItem.getCompleted());
    }



}