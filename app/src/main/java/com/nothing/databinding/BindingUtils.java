package com.nothing.databinding;

import android.databinding.BindingAdapter;
import android.widget.ImageView;

/**
 * Created by THM on 7/12/2017.
 */
public class BindingUtils {
    @BindingAdapter("android:src")
    public static void setImage(ImageView view, int src) {
        view.setImageResource(src);
    }
}
