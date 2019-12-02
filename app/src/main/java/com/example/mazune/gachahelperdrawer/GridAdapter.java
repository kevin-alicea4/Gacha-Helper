package com.example.mazune.gachahelperdrawer;

import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;

import java.lang.reflect.Field;
import java.util.ArrayList;

/**
 * Created by k3vo1 on 5/2/2018.
 */

public class GridAdapter extends BaseAdapter
{
    private Context context;
    ArrayList<Integer> imageIds = new ArrayList<>();


    public GridAdapter(Context c)
    {
        context = c;
    }

    public int getCount()
    {
        return imageIds.size();
    }

    public Object getItem(int position)
    {
        return imageIds.get(position);
    }

    public long getItemId(int position)
    {
        return 0;
    }

    //create new ImageView for each item referenced by the Adapter
    public View getView(int position, View view, ViewGroup parent)
    {
        ImageView iview;

        if (view == null)
        {
            iview = new ImageView(context);
            iview.setLayoutParams(new GridView.LayoutParams((int) context.getResources().getDimension(R.dimen.widthBbsChar),
                    (int)context.getResources().getDimension(R.dimen.heightBbsChar)));
            iview.setScaleType(ImageView.ScaleType.CENTER_CROP);
            iview.setPadding(5, 5, 5, 5);
        }
        else
        {
            iview = (ImageView) view;
        }

        iview.setImageResource(imageIds.get(position));
        return iview;
    }
}