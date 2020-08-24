package com.example.dbenglishtext;

import android.content.Context;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import java.util.ArrayList;

public class PagerItem extends PagerAdapter {
    public PagerItem(Context applicationContext, ArrayList<String> word, ArrayList<String> mean) {

    }

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return false;
    }
}
