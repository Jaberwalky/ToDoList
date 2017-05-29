package com.codeclan.example.todolist;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by PaulJablonski on 29/05/2017.
 */
public class DateHelperTest {

    @Test
    public void canCalculateDateDifference(){
       int difference = DateHelper.getDateDifference(2017, 6, 3);
        assertEquals(5, difference);
    }


}