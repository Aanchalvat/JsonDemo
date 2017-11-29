package com.example.owner.amazon_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class Listofmobap extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listofmobap);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowCustomEnabled(true);
        ListView ll = (ListView)findViewById(R.id.listap);
        String[] windo = {"iPHONE 6s PLUS","iPHONE SE","iPHONE 7s PLUS","iPHONE 8s"};
        Windowadp wd = new Windowadp(Listofmobap.this,R.layout.listviewmob,windo);
        ll.setAdapter(wd);
        ll.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0)
                {
                    Intent in = new Intent(Listofmobap.this,I6s.class);
                    startActivity(in);
                }
                else if(position==1)
                {
                    Intent in = new Intent(Listofmobap.this,Ise.class);
                    startActivity(in);
                }
                else if(position==2)
                {
                    Intent in = new Intent(Listofmobap.this, I7s.class);
                    startActivity(in);
                }
                else if(position==3)
                {
                    Intent in = new Intent(Listofmobap.this, I8s.class);
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
