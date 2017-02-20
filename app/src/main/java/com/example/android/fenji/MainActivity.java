package com.example.android.fenji;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openMaps(View v){

        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://www.google.be/maps/place/Kruishoutemseweg+28,+9790+Wortegem-Petegem/@50.8730193,3.5217946,17z/data=!3m1!4b1!4m5!3m4!1s0x47c311542b921767:0xbe28726fcde5099b!8m2!3d50.8730193!4d3.5239833"));
        startActivity(intent);
    }
}
