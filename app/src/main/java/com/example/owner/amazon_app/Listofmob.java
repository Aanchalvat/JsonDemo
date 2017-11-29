package com.example.owner.amazon_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

public class Listofmob extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listofmob);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowCustomEnabled(true);
        ListView ll = (ListView)findViewById(R.id.listwin);
        String[] windo = {"Micosoft Lumia 640 L","Nokia Lumia 635","Nokia Lumia 1020"};
        Windowadp wd = new Windowadp(Listofmob.this,R.layout.listviewmob,windo);
        ll.setAdapter(wd);
        ll.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0)
                {
                    Intent in = new Intent(Listofmob.this,Microsoft.class);
                    startActivity(in);
                }
                else if(position==1)
                {
                    Intent in = new Intent(Listofmob.this,Nokia635.class);
                    startActivity(in);
                }
                else if(position==2)
                {
                    Intent in = new Intent(Listofmob.this, Nokia1020.class);
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
