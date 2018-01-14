package com.photoviewer.View.Adapter;

import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;

import com.photoviewer.Model.BandPhotoModel;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 2018. 1. 14..
 */

public class PhotoDetailAdapter extends PagerAdapter {

    private List<BandPhotoModel> photoModelList = new ArrayList<>();

    public PhotoDetailAdapter(List<BandPhotoModel> photoModelList) {
        this.photoModelList = photoModelList;
    }

    @Override
    public int getCount() {
        return photoModelList.size();
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        return super.instantiateItem(container, position);
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View) object);
    }
}
