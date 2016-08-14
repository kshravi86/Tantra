package com.tantra;

import android.app.Activity;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.text.method.ScrollingMovementMethod;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by aakash on 14/8/16.
 */
public class One1 extends Activity
{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eighteenth_1);


        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setMovementMethod(new ScrollingMovementMethod());
        textView.setText("Everyone wants to use someone else's wifi!"+"\n"
                +"Its hard to steal WiFi password!!!! Weird haaaa?"+"\n"
                +"I will give YOU a way to steal password if the router has WPS enabled"+"\n"
                +"WPS(WiFi Protected SetUp) is a authentication method which exchanges 8 digit pin between the phone and router"+"\n"
                +"\n"+
                "STEP 1:"+
                "\n"+
                "Dowload this app"+"\n");
        TextView textView1 = (TextView) findViewById(R.id.link);
        TextView textView2 = (TextView) findViewById(R.id.textView1);

        textView2.setText("You can buy this app or can install the FREE version of the app too"+"\n"
        +"Then just open the app and you will see the screen like this");

        ImageView image1=(ImageView)findViewById(R.id.image1);

        TextView textView3 = (TextView) findViewById(R.id.textView2);
        textView3.setText("Click on the WiFi network that shows Green colour"+"\n"
        +"Then select connect automatic PIN option "+"\n"
                +"Rest of the thing will be done by that app"+"\n"+
                "\n"+
                "\n"+
                "NOTE: It also shows password if your phone is rooted"
        );


    }
}