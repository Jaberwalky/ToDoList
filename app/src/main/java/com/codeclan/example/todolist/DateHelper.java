package com.codeclan.example.todolist;

import java.util.Calendar;

/**
 * Created by PaulJablonski on 29/05/2017.
 */

public class DateHelper {

    public static int getDateDifference(int year, int month, int day){
        Calendar dueDate = Calendar.getInstance();
        dueDate.setTimeInMillis(0);
        dueDate.set(Calendar.YEAR, year);
        dueDate.set(Calendar.MONTH, month - 1);
        dueDate.set(Calendar.DAY_OF_MONTH, day);

        Calendar today = Calendar.getInstance();
        long difference = (dueDate.getTimeInMillis() - today.getTimeInMillis()) / 1000;
        return (int) (difference / (1440 * 60));
    }







}
