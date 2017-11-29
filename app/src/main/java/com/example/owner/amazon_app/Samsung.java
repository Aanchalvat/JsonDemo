package com.example.owner.amazon_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import org.json.JSONException;
import org.json.JSONObject;

public class Samsung extends AppCompatActivity {

    String aa ="{\n" +
            "\t\"Mobile\": {\n" +
            "\t\t\"debug\": \"on\",\n" +
            "\t\t\"window\": {\n" +
            "\t\t\t\"price\": \"11,220\",\n" +
            "\t\t\t\"camera\": \"8 mega pixel\",\n" +
            "\t\t\t\"ram\": \"2GB\",\n" +
            "\t\t\t\"battery\": \"2500 mAh\"\n" +
            "\t\t},\n" +
            "\t\t\"android\": {\n" +
            "\t\t\t\"price\": \"22,000\",\n" +
            "\t\t\t\"camera\": \"13 mega pixel\",\n" +
            "\t\t\t\"battery\": \"3000 mAh\",\n" +
            "\t\t\t\"ram\": \"4 GB\",\n" +
            "\t\t\t\"alignment\": \"center\"\n" +
            "\t\t},\n" +
            "\t\t\"ios\": {\n" +
            "\t\t\t\"price\": \"60,000\",\n" +
            "\t\t\t\"camera\": \"20 mega pixel\",\n" +
            "\t\t\t\"batery\": \" 5000 mAh\",\n" +
            "\t\t\t\"ram\": \"8 GB\",\n" +
            "\t\t\t\"hOffset\": 250,\n" +
            "\t\t\t\"vOffset\": 100,\n" +
            "\t\t\t\"alignment\": \"center\",\n" +
            "\t\t\t\"onMouseUp\": \"sun1.opacity = (sun1.opacity / 100) * 90;\"\n" +
            "\t\t}\n" +
            "\t}\n" +
            "}";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_samsung);
        TextView tx1 =(TextView)findViewById(R.id.price1);
        TextView tx2 = (TextView)findViewById(R.id.camera1);
        TextView tx3 =(TextView)findViewById(R.id.battery1);
        TextView tx4 =(TextView)findViewById(R.id.ram1);

        try {
            JSONObject root = new JSONObject(aa);
            JSONObject mb = root.getJSONObject("Mobile");
            JSONObject win = mb.getJSONObject("android");
            String bb = win.getString("price");
            Log.d("test",String.valueOf(bb));
            tx1.setText(""+bb);
            String cc = win.getString("camera");
            tx2.setText(""+cc);
            String dd = win.getString("battery");
            tx3.setText(""+dd);
            String ee =win.getString("ram");
            tx4.setText(""+ee);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
