package com.example.owner.amazon_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import org.json.JSONException;
import org.json.JSONObject;

public class I7s extends AppCompatActivity {
    String aa = "{\n" +
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
            "\t\t\t\"battery\": \" 5000 mAh\",\n" +
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
        setContentView(R.layout.activity_i7s);
        TextView pr = (TextView)findViewById(R.id.price);
        TextView cm = (TextView)findViewById(R.id.camera);
        TextView bt = (TextView)findViewById(R.id.battery);
        TextView rm = (TextView)findViewById(R.id.ram);
        try {

            JSONObject root = new JSONObject(aa);
            JSONObject wd = root.getJSONObject("Mobile");
            JSONObject wi = wd.getJSONObject("ios");
            String bb = wi.getString("price");
            Log.d("test",String.valueOf(bb));
            pr.setText(""+bb);
            String cc = wi.getString("camera");
            cm.setText(""+cc);
            String dd = wi.getString("battery");
            bt.setText(""+dd);
            String ee = wi.getString("ram");
            rm.setText(""+ee);

        } catch (JSONException e) {
            e.printStackTrace();
        }


    }
}
