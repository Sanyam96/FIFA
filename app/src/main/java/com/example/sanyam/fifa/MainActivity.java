package com.example.sanyam.fifa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

//    Button b1;
    ImageButton ib1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        b1 = (Button)findViewById(R.id.teamsButton2);
//        b1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent i = new Intent();
//                i.setClass(MainActivity.this, teamShowActivity.class);
//                startActivity(i);
//            }
//        });

        ib1 = (ImageButton)findViewById(R.id.teamsButton);
        ib1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent();
                i.setClass(MainActivity.this, teamShowActivity.class);
                startActivity(i);
            }
        });
    }
}
