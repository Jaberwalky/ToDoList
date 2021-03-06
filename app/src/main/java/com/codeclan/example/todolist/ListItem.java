package com.codeclan.example.todolist;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by PaulJablonski on 28/05/2017.
 */

public class ListItem implements Serializable {

    private String title;
    private int year;
    private int month;
    private int day;
    private String details;



    public ListItem(String title, int year, int month, int day, String details){
        this.title = title;
        this.year = year;
        this.month = month;
        this.day = day;
        this.details = details;
    }

    public String getTitle() {
        return this.title;
    }

    public int getYear(){
        return this.year;
    }

    public int getMonth(){
        return this.month;
    }

    public int getDay(){
        return this.day;
    }

    public String getDetails(){
        return this.details;
    }

    public boolean equals(ListItem listItem) {
        return this.getTitle().equals(listItem.getTitle())
                && this.getYear() == listItem.getYear()
                && this.getMonth() == listItem.getMonth()
                && this.getDay() == listItem.getDay()
                && this.getDetails().equals(listItem.getDetails());
    }






}
