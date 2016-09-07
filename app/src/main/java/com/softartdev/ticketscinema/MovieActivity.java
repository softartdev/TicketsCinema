package com.softartdev.ticketscinema;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.softartdev.ticketscinema.model.MovieItem;

public class MovieActivity extends AppCompatActivity {

    public static final String EXTRA_ITEM_PARCELABLE = "PARCELABLE LIST ITEM";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie);

        ImageView posterImageView = (ImageView)findViewById(R.id.photoImage);
        TextView nameTextView = (TextView)findViewById(R.id.nameText);
        TextView tagTextView = (TextView)findViewById(R.id.tagText);
        TextView genreTextView = (TextView)findViewById(R.id.genreText);
        TextView fromTextView = (TextView)findViewById(R.id.fromText);
        TextView descriptionTextView = (TextView)findViewById(R.id.miniDescriptionText);

        MovieItem movieItem = getIntent().getParcelableExtra(EXTRA_ITEM_PARCELABLE);

        posterImageView.setImageResource(movieItem.getImageNumber());
        nameTextView.setText(movieItem.getName());
        tagTextView.setText(movieItem.getTag());
        genreTextView.setText(movieItem.getGenre());
        fromTextView.setText(movieItem.getFrom());
        descriptionTextView.setText(movieItem.getMiniDescription());

        Button fab = (Button) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, getString(R.string.buy), Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }
}
