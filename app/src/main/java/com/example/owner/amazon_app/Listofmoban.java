package com.example.owner.amazon_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class Listofmoban extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listofmoban);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowCustomEnabled(true);
        ListView ll = (ListView)findViewById(R.id.listan);
        String[] windo = {"Samsung Galaxy Note 8","Google Pixel XL","One Plus 5","LG G6"};
        Windowadp wd = new Windowadp(Listofmoban.this,R.layout.listviewmob,windo);
        ll.setAdapter(wd);
        ll.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0)
                {
                    Intent in = new Intent(Listofmoban.this,Samsung.class);
                    startActivity(in);
                }
                else if(position==1)
                {
                    Intent in = new Intent(Listofmoban.this,Google.class);
                    startActivity(in);
                }
                else if(position==2)
                {
                    Intent in = new Intent(Listofmoban.this, One_plus.class);
                    startActivity(in);
                }
                else if(position==3)
                {
                    Intent in = new Intent(Listofmoban.this, Lg.class);
                    startActivity(in);
                }
            }
        });



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.amazon_menu, menu);
        return true;
    }
}


