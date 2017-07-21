package com.example.ee.textstyle;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv1,tv2,tv3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tv1= (TextView)findViewById(R.id.kookaburra_3d);
        TextView tv2= (TextView)findViewById(R.id.kookaburra_outline);
        TextView tv3= (TextView)findViewById(R.id.kookobora_regular);

        
    }
}
