package com.gil_becker.adapterview;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Gil-B on 14/01/2017.
 */

public class List extends BaseAdapter {


    private Context mContext;

    public List(Context c) {
        mContext = c;
    }

    public int getCount() {
        return ListArray.length;
    }

    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v;
        ImageView iconView = new ImageView(mContext);

        if (convertView == null) {
            LayoutInflater inflater = ((AppCompatActivity)mContext).getLayoutInflater();
            v = inflater.inflate(R.layout.row,null,true);
        }
        else {
            v = convertView;
        }

        iconView = (ImageView)v.findViewById(R.id.image);
        TextView txtTitle = (TextView)v.findViewById(R.id.name);
        TextView txtSubTitle = (TextView)v.findViewById(R.id.item);

        txtTitle.setText((ListArray[position]).getSubTitle());
        txtSubTitle.setText((ListArray[position]).getTitle());
        iconView.setImageResource((ListArray[position]).getImageId());

        return v;

    }

    static OneItemData[] ListArray =

    {
            new OneItemData(R.drawable.acorn, "acorn", "item1"),
            new OneItemData(R.drawable.autumn_leaves,"autumn_leaves","item2"),
            new OneItemData(R.drawable.bush,"bush","item3"),
            new OneItemData(R.drawable.cactus,"cactus","item4"),
            new OneItemData(R.drawable.ice,"ice","item5"),
            new OneItemData(R.drawable.pine_cone,"pine_cone","item6"),
            new OneItemData(R.drawable.snowflakes,"snowflakes","item7"),
            new OneItemData(R.drawable.stone,"stone","item8"),
            new OneItemData(R.drawable.acorn, "acorn", "item1"),
            new OneItemData(R.drawable.autumn_leaves,"autumn_leaves","item2"),
            new OneItemData(R.drawable.bush,"bush","item3"),
            new OneItemData(R.drawable.cactus,"cactus","item4"),
            new OneItemData(R.drawable.ice,"ice","item5"),
            new OneItemData(R.drawable.pine_cone,"pine_cone","item6"),
            new OneItemData(R.drawable.snowflakes,"snowflakes","item7"),
            new OneItemData(R.drawable.stone,"stone","item8")
    };

}

