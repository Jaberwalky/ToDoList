package com.codeclan.example.todolist;

import java.util.Calendar;

/**
 * Created by PaulJablonski on 29/05/2017.
 */

public class DateHelper {

    public static String getDateDifference(int year, int month, int day){
        Calendar dueDate = Calendar.getInstance();
        dueDate.setTimeInMillis(0);
        dueDate.set(Calendar.YEAR, year);
        dueDate.set(Calendar.MONTH, month - 1);
        dueDate.set(Calendar.DAY_OF_MONTH, day);

        Calendar today = Calendar.getInstance();
        long difference = (dueDate.getTimeInMillis() - today.getTimeInMillis()) / 1000;
        int days = (int) (difference / (1440 * 60));

        if (days > 0) {
            return "Due in " + days;
        } else if (days == 0) {
            return "Due Today";
        } else {
            return "Overdue";
        }




    }







}
