package com.example.owner.amazon_app;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import de.hdodenhof.circleimageview.CircleImageView;

/**
 * Created by OWNER on 28-Nov-17.
 */

public class Mobileadp extends BaseAdapter {
    LayoutInflater ly;
    Context context;
    int res ;
    String[] nm;
    int[] im ;

    public Mobileadp(Context context, int listviewq, String[] nm, int[] im) {
        this.context = context;
        this.res=listviewq;
        this.nm=nm;
        this.im=im;
        ly =(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

    }

    @Override
    public int getCount() {
        return im.length;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView=ly.inflate(res,parent,false);
        TextView tx =(TextView)convertView.findViewById(R.id.textmo);
        tx.setText(nm[position]);
        CircleImageView ig =(CircleImageView)convertView.findViewById(R.id.image);
        ig.setImageResource(im[position]);
        return convertView;
    }
}