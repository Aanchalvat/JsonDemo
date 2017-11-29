package com.example.owner.amazon_app;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

/**
 * Created by OWNER on 28-Nov-17.
 */

public class Windowadp extends BaseAdapter {
    LayoutInflater ly;
    Context context;
    int res ;
    String[] windo ;

    public Windowadp(Context context, int listviewmob, String[] windo) {
        this.context = context;
        this.res=listviewmob;
        this.windo= windo;
        ly =(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return windo.length;
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
        TextView tt = (TextView)convertView.findViewById(R.id.textwin);
        tt.setText(windo[position]);
        return convertView;
    }
}
