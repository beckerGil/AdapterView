package com.gil_becker.adapterview;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Gil-B on 13/01/2017.
 */

public class Grid extends BaseAdapter {

    private Context mContext;

    public Grid(Context c)
    {
        mContext = c;
    }

    public int getCount(){
        return GridImageArray.length;
    }

    public Object getItem(int position){
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
//        TextView textView;
        ImageView imageView;
        if (convertView == null) {
            imageView = new ImageView(mContext);
//            textView = new TextView(mContext);
            imageView.setLayoutParams(new GridView.LayoutParams(85, 85));
//            textView.setLayoutParams(new GridView.LayoutParams(85, 85));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setPadding(8, 8, 8, 8);
//            textView.setPadding(8, 8, 8, 8);
        } else {
            imageView = (ImageView) convertView;
//            textView = (TextView) convertView;
        }

        imageView.setImageResource(GridImageArray[position]);
        String str = new String();
//        textView.setText(position);
        return imageView;
//        return textView;
    }

    static int[] GridImageArray = {
            R.drawable.acorn,R.drawable.autumn_leaves,R.drawable.bush,R.drawable.cactus,R.drawable.ice,R.drawable.pine_cone,R.drawable.snowflakes,R.drawable.stone
    };
}


