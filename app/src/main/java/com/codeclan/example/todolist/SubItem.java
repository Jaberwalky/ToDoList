package com.codeclan.example.todolist;

import java.io.Serializable;

/**
 * Created by PaulJablonski on 28/05/2017.
 */

public class SubItem implements Serializable {

    private boolean completed;
    private String title;

    public SubItem(String title) {
        this.title = title;
        this.completed = false;
    }


    public String getTitle() {
        return title;
    }

    public boolean getCompleted() {
        return completed;
    }
}
