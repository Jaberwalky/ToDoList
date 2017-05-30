package com.codeclan.example.todolist;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

/**
 * Created by PaulJablonski on 29/05/2017.
 */

public class SharedPrefsHelper {

    private static Gson gson = new Gson();

    public static String getToDoListFromSharedPrefs(SharedPreferences prefs){
        return prefs.getString("toDoList", gson.toJson(new ToDoList()));
    }

    public static ToDoList getToDoListFromJson(String json){
        TypeToken<ToDoList> toDoListObject = new TypeToken<ToDoList>(){};
        return gson.fromJson(json, toDoListObject.getType());
    }

    public static void writeToSharedPrefs(ToDoList toDoList, SharedPreferences prefs){
        SharedPreferences.Editor editor = prefs.edit();
        String json = gson.toJson(toDoList);
        editor.putString("toDoList", json);
        editor.apply();
    }


}
