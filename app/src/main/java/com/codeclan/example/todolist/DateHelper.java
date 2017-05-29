package com.codeclan.example.todolist;

import java.util.Calendar;

/**
 * Created by PaulJablonski on 29/05/2017.
 */

public class DateHelper {

    public static int getDateDifference(int year, int month, int day){
        Calendar dueDate = Calendar.getInstance();
        dueDate.set(Calendar.YEAR, year);
        dueDate.set(Calendar.MONTH, month);
        dueDate.set(Calendar.DAY_OF_MONTH, day);

        Calendar today = Calendar.getInstance();
        int difference = (int) (dueDate.getTimeInMillis() - today.getTimeInMillis()) / 1000;
        return difference / (1440 * 60);
//        can anyone tell me why I'm having to add 1 to this to make it work???
    }







}
