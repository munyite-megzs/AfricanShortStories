package com.example.meg.africanshortstories;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Meg on 2015-04-30.
 */
public class CardAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    List<Story>sItems;
    public CardAdapter(){
        super();
        sItems = new ArrayList<Story>();
        Story story = new Story();
    }
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
