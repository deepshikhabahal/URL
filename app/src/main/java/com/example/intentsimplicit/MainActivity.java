package com.example.intentsimplicit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    Button buttonCall, buttonCallFriend, buttonWeb, buttonMap;
    ImageView ice,man,infinity,umbrella;
    Button change;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonCall = findViewById(R.id.callbtn);
        buttonCallFriend = findViewById(R.id.callfriendbtn);
        buttonWeb = findViewById(R.id.webbtn);
        buttonMap = findViewById(R.id.mapbtn);

        ice = findViewById(R.id.iVIce);
        man = findViewById(R.id.iVMan);
        umbrella = findViewById(R.id.iVUmbrella);
        infinity = findViewById(R.id.iVInfinity);
        change = findViewById(R.id.change);

        buttonCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Intent.ACTION_DIAL);
                startActivity(intent);
            }
        });

        buttonCallFriend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:9720123922"));
                startActivity(intent);
            }
        });

        buttonWeb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.materialpalette.com/"));
                startActivity(intent);

            }
        });

        buttonMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:https://goo.gl/maps/kRbFZva3W8Ud49sj8"));
                startActivity(intent);

            }
        });

        change.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ice.setImageResource(R.drawable.umbrella);
            }
        });

        umbrella.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                umbrella.setImageResource(R.drawable.infinity) ;
            }
        });
        infinity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                infinity.setImageResource(R.drawable.man);
            }
        });
        man.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                man.setImageResource(R.drawable.ice);
            }
        });
    }
}