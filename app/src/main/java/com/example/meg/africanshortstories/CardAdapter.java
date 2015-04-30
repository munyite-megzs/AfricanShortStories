package com.example.meg.africanshortstories;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Meg on 2015-04-30.
 */
public  class  CardAdapter extends RecyclerView.Adapter<CardAdapter.ViewHolder> {


    List<Story> sItems;

    public CardAdapter() {
        super();
        sItems = new ArrayList<Story>();
        Story story = new Story();
        story.setName("Inkalima and the Hare");
        story.setThumbnail(R.drawable.inke);
        sItems.add(story);


        story = new Story();
        story.setName("Marwe in the underworld");
        story.setThumbnail(R.drawable.marwe);
        sItems.add(story);


        story = new Story();
        story.setName("Murilie and the Moon Chief");
        story.setThumbnail(R.drawable.murile);
        sItems.add(story);



        story = new Story();
        story.setName("The girl who broke her pot");
        story.setThumbnail(R.drawable.noking);
        sItems.add(story);



        story = new Story();
        story.setName("No king as God");
        story.setThumbnail(R.drawable.noking);
        sItems.add(story);


        story = new Story();
        story.setName("Kammapa the Monster");
        story.setThumbnail(R.drawable.kamapa);
        sItems.add(story);



        story = new Story();
        story.setName("Wanjiru the Maiden");
        story.setThumbnail(R.drawable.wanjiru);
        sItems.add(story);



        story = new Story();
        story.setName("Tortoise and the Baboon");
        story.setThumbnail(R.drawable.tortoise);
        sItems.add(story);



        story = new Story();
        story.setName("The spirit in the Tree");
        story.setThumbnail(R.drawable.spirit);
        sItems.add(story);



        story = new Story();
        story.setName("The story Tree");
        story.setThumbnail(R.drawable.tree);
        sItems.add(story);
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.recycler_view_card_item, viewGroup, false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        Story story = sItems.get(i);
        viewHolder.tvMovie.setText(story.getName());
        viewHolder.imgThumbnail.setImageResource(story.getThumbnail());
    }

    @Override
    public int getItemCount() {
        return sItems.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder{

        public ImageView imgThumbnail;
        public TextView tvMovie;

        public ViewHolder(View itemView) {
            super(itemView);
            imgThumbnail = (ImageView)itemView.findViewById(R.id.img_thumbnail);
            tvMovie = (TextView)itemView.findViewById(R.id.story);
        }
    }

}
