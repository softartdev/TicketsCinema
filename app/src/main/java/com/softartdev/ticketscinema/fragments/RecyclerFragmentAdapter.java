package com.softartdev.ticketscinema.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.softartdev.ticketscinema.MovieActivity;
import com.softartdev.ticketscinema.R;
import com.softartdev.ticketscinema.model.MovieItem;

import java.util.ArrayList;

public class RecyclerFragmentAdapter extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    public class CustomRecyclerAdapter extends RecyclerView.Adapter<CustomRecyclerHolder>{
        private ArrayList<MovieItem> mListData;
        public CustomRecyclerAdapter(ArrayList<MovieItem> listItems) {
            mListData = listItems;
        }

        @Override
        public CustomRecyclerHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            LayoutInflater layoutInflater = LayoutInflater.from(getActivity());
            View view = layoutInflater.inflate(R.layout.movies_list_row, parent, false);
            return new CustomRecyclerHolder(view);
        }

        @Override
        public void onBindViewHolder(CustomRecyclerHolder holder, int position) {
            MovieItem listItem = mListData.get(position);
            holder.bindItem(listItem);
        }

        @Override
        public int getItemCount() {
            return mListData.size();
        }
    }

    protected class CustomRecyclerHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        ImageView posterImageView;
        TextView nameTextView;
        TextView tagTextView;
        TextView genreTextView;
        TextView fromTextView;
        TextView descriptionTextView;
        TextView moreButton;
        MovieItem item;

        public CustomRecyclerHolder(final View itemView) {
            super(itemView);
            posterImageView = (ImageView)itemView.findViewById(R.id.photo);
            nameTextView = (TextView)itemView.findViewById(R.id.name);
            tagTextView = (TextView)itemView.findViewById(R.id.tag);
            genreTextView = (TextView)itemView.findViewById(R.id.genre);
            fromTextView = (TextView)itemView.findViewById(R.id.from);
            descriptionTextView = (TextView)itemView.findViewById(R.id.miniDescription);
            moreButton = (TextView)itemView.findViewById(R.id.btn_more);
            moreButton.setOnClickListener(this);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            Toast.makeText(view.getContext(), item.getName() + " clicked", Toast.LENGTH_SHORT).show();

            Intent intent = new Intent(view.getContext(), MovieActivity.class);
            intent.putExtra(MovieActivity.EXTRA_ITEM_PARCELABLE, item);
            startActivity(intent);
        }

        public void bindItem (MovieItem listItem){
            item = listItem;
            //posterImageView.setImageResource(imgId[listItem.getImageNumber() - 1]);
            posterImageView.setImageResource(listItem.getImageNumber());
            nameTextView.setText(item.getName());
            tagTextView.setText(item.getTag());
            genreTextView.setText(item.getGenre());
            fromTextView.setText(item.getFrom());
            descriptionTextView.setText(item.getMiniDescription());
        }
    }

}
