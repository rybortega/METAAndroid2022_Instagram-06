package com.example.instagram;

import android.os.Parcelable;

import com.parse.ParseClassName;
import com.parse.ParseFile;
import com.parse.ParseObject;
import com.parse.ParseUser;

import org.parceler.Parcel;


@ParseClassName("Post")
@Parcel(analyze=Post.class)
public class Post extends ParseObject implements Parcelable {

    public static final String KEY_DESCRIPTION = "Caption";
    public static final String KEY_IMAGE = "Image";
    public static final String KEY_USER = "Username";

    public String getDescription(){
        return getString(KEY_DESCRIPTION);
    }

    public void setDescription(String des){
        put(KEY_DESCRIPTION, des);
    }

    public ParseFile getImage() {
        return getParseFile(KEY_IMAGE);
    }

    public void setImage(ParseFile parseFile){
        put(KEY_IMAGE, parseFile);
    }

    public ParseUser getUser() {
        return getParseUser(KEY_USER);
    }
    public void setUser(ParseUser key){
        put(KEY_USER, key);

    }
}
