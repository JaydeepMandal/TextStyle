package com.example.ee.textstyle;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView tv1= (TextView)findViewById(R.id.textView9);
        TextView tv2= (TextView)findViewById(R.id.textView10);
        TextView tv3= (TextView)findViewById(R.id.textView11);
        TextView tv5= (TextView)findViewById(R.id.textView12);
        TextView tv4= (TextView)findViewById(R.id.textView13);
        TextView tv6= (TextView)findViewById(R.id.textView14);

        Typeface f1 = Typeface.createFromAsset(getAssets(),"Bates Shower.ttf");
        Typeface f2 = Typeface.createFromAsset(getAssets(),"GoodDog.ttf");
        Typeface f3 = Typeface.createFromAsset(getAssets(),"GrandHotel-Regular.ttf");
        Typeface f4 = Typeface.createFromAsset(getAssets(),"KaushanScript-Regular.ttf");
        Typeface f5 = Typeface.createFromAsset(getAssets(),"Pacifico.ttf");
        Typeface f6 = Typeface.createFromAsset(getAssets(),"Stackyard_PERSONAL_USE.ttf");

        tv1.setTypeface(f1);
        tv2.setTypeface(f2);
        tv3.setTypeface(f3);
        tv4.setTypeface(f4);
        tv5.setTypeface(f5);
        tv6.setTypeface(f6);


    }
}
