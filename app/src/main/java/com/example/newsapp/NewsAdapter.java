package com.example.newsapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class NewsAdapter extends ArrayAdapter<com.example.newsapp.NewsData> {

    public NewsAdapter(Context context, ArrayList<NewsData> arrayList) {
        super(context, 0, arrayList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View currentListView = convertView;

        if (currentListView == null) {
            currentListView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        com.example.newsapp.NewsData newsData = getItem(position);

        TextView titleView = currentListView.findViewById(R.id.title);
        titleView.setText(newsData.getTitle());

        TextView dateView = currentListView.findViewById(R.id.date);
        dateView.setText(newsData.getDate());


        TextView authorView = currentListView.findViewById(R.id.author);
        authorView.setText("~" + newsData.getAuthor());

        TextView sectionNameView = currentListView.findViewById(R.id.sectionName);
        sectionNameView.setText(newsData.getSectionName());

        return currentListView;


    }
}