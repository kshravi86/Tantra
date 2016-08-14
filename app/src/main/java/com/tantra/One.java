package com.tantra;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by aakash on 14/8/16.
 */
public  class One extends Activity {
    String[] CHEESES = {
            "How to HACK WiFi",
            "Audio Manager Hack",
            "Speed Up Your Phone",
            "UnLock Your android Phone",
            "WhatsApp Hack(ROOT)",
            "AppLocker Hack",


    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //  super.onCreate(savedInstanceState);
        // setContentView(R.layout.sample_main);

        setContentView(R.layout.activity_main2);

        ArrayAdapter adapter = new ArrayAdapter<String>(this, R.layout.activity_listview3, CHEESES);

        ListView listView = (ListView) findViewById(R.id.mobile_list);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

                switch( position )
                {
                    case 0:  Intent newActivity = new Intent(One.this, One1.class);
                        startActivity(newActivity);
                        break;
                    /*case 1:  Intent newActivity2 = new Intent(ThirdActivity.this, Third2.class);
                        startActivity(newActivity2);
                        break;
                    case 2:  Intent newActivity3 = new Intent(ThirdActivity.this, Third3.class);
                        startActivity(newActivity3);
                        break;
                    case 3:Intent newActivity4 = new Intent(ThirdActivity.this, Third4.class);
                        startActivity(newActivity4);
                        break;
                    case 4:Intent newActivity5 = new Intent(ThirdActivity.this, Third5.class);
                        startActivity(newActivity5);
                        break;
                    case 5:Intent newActivity6 = new Intent(ThirdActivity.this, Third6.class);
                        startActivity(newActivity6);
                        break;
                    case 6:Intent newActivity7 = new Intent(ThirdActivity.this, Third7.class);
                        startActivity(newActivity7);
                        break;
                    case 7:Intent newActivity8 = new Intent(ThirdActivity.this, Third8.class);
                        startActivity(newActivity8);
                        break;
                    case 8:Intent newActivity9 = new Intent(ThirdActivity.this, Third9.class);
                        startActivity(newActivity9);
                        break;*/


                }
            }
        });


    }
}

