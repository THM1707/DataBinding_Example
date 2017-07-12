package com.nothing.databinding;

import android.databinding.BaseObservable;
import android.graphics.Color;

/**
 * Created by THM on 7/11/2017.
 */
public class User extends BaseObservable {
    private String mUserName, mPassword;
    private int mTextColor, mImageResource;

    public User(String userName, String password) {
        mUserName = userName;
        mPassword = password;
        mTextColor = Color.WHITE;
        mImageResource = R.mipmap.ic_launcher;
    }

    public User(String userName, String password, int textColor, int imageResource) {
        mUserName = userName;
        mPassword = password;
        mTextColor = textColor;
        mImageResource = imageResource;
    }

    public int getImageResource() {
        return mImageResource;
    }

    public void setImageResource(int imageResource) {
        mImageResource = imageResource;
    }

    public int getTextColor() {
        return mTextColor;
    }

    public void setTextColor(int textColor) {
        mTextColor = textColor;
    }

    public String getUserName() {
        return mUserName;
    }

    public void setUserName(String userName) {
        mUserName = userName;
    }

    public String getPassword() {
        return mPassword;
    }

    public void setPassword(String password) {
        mPassword = password;
    }
}
