package com.softartdev.ticketscinema.model;

import android.os.Parcel;
import android.os.Parcelable;

public class MovieItem implements Parcelable {
    private String name;
    private String tag;
    private String genre;
    private String from;
    private String miniDescription;
    private int imageNumber;

    public MovieItem() {
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setTag(String tag) {
        this.tag = tag;
    }
    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }
    public void setFrom(String from) {
        this.from = from;
    }
    public String getTag() {
        return tag;
    }
    public String getFrom() {
        return from;
    }
    public String getMiniDescription() {
        return miniDescription;
    }
    public void setMiniDescription(String miniDescription) {
        this.miniDescription = miniDescription;
    }
    public int getImageNumber() {
        return imageNumber;
    }
    public void setImageNumber(int imageNumber) {
        this.imageNumber = imageNumber;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name);
        parcel.writeString(tag);
        parcel.writeString(genre);
        parcel.writeString(from);
        parcel.writeString(miniDescription);
        parcel.writeInt(imageNumber);
    }

    public static final Creator<MovieItem> CREATOR = new Creator<MovieItem>() {
        @Override
        public MovieItem createFromParcel(Parcel in) {
            return new MovieItem(in);
        }

        @Override
        public MovieItem[] newArray(int size) {
            return new MovieItem[size];
        }
    };

    protected MovieItem(Parcel in) {
        name = in.readString();
        tag = in.readString();
        genre = in.readString();
        from = in.readString();
        miniDescription = in.readString();
        imageNumber = in.readInt();
    }
}
