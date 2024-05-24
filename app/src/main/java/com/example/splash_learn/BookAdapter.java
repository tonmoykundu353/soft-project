// BookAdapter.java
package com.example.splash_learn;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class BookAdapter extends ArrayAdapter<String> {
    private Context context;
    private ArrayList<String> books;

    public BookAdapter(Context context, ArrayList<String> books) {
        super(context, 0, books);
        this.context = context;
        this.books = books;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.book_item, parent, false);
        }

        TextView bookTitle = convertView.findViewById(R.id.book_title);
        bookTitle.setText(books.get(position));

        return convertView;
    }
}