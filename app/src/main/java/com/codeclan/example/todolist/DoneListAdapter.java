package com.codeclan.example.todolist;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.ArrayList;

/**
 * Created by PaulJablonski on 31/05/2017.
 */

public class DoneListAdapter extends ArrayAdapter<ListItem> {

    public DoneListAdapter(Context context, ArrayList<ListItem> listItem) {
        super(context, 0, listItem);
    }

    @Override
    public View getView(int position, View listItemView, ViewGroup parent) {

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.done_item, parent, false);
        }

        ListItem currentItem = getItem(position);

        TextView title = (TextView) listItemView.findViewById(R.id.title_text);
        title.setText(currentItem.getTitle());

        TextView daysLeft = (TextView) listItemView.findViewById(R.id.due_field);
        String daysString = DateHelper.getDateDifference(currentItem);
        daysLeft.setText(daysString);

        return listItemView;

    }



}
