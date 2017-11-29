package com.example.owner.amazon_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class Mobile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mobile);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowCustomEnabled(true);
        ListView ly =(ListView)findViewById(R.id.list);
        String[] nm = {"WINDOWS","ANDROID","iPHONE"};
        int[] im ={R.drawable.windows,R.drawable.android,R.drawable.apple};
        Mobileadp mb = new Mobileadp(Mobile.this,R.layout.listviewq,nm,im);
        ly.setAdapter(mb);
        ly.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0)
                {
                    Intent in = new Intent(Mobile.this,Listofmob.class);
                    startActivity(in);
                }
                else if(position==1)
                {
                    Intent in = new Intent(Mobile.this,Listofmoban.class);
                    startActivity(in);
                }
               else if(position==2)
                {
                    Intent in = new Intent(Mobile.this,Listofmobap.class);
                    startActivity(in);
                }

            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.amazon_menu,menu);
        return true;
    }
}
