package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class IngredientsActivity extends AppCompatActivity {
    Button es ;
    Button ou ;
    Button om ;
    Button om2 ;
    Button om3 ;
    Button om5;
    Button am;
    Button roo1;
    Button fl;
    Button caca;
    Button poi;
    Button riz;
    Button da;
    Button ma;
    Button aa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ingredients);
        es=(Button) findViewById(R.id.es);
        ou=(Button) findViewById(R.id.ou);
        om=(Button) findViewById(R.id.om);
        om2=(Button) findViewById(R.id.om2);
        om3=(Button) findViewById(R.id.om3);
        om5=(Button) findViewById(R.id.om5);
        am=(Button) findViewById(R.id.am);
        roo1=(Button) findViewById(R.id.roo1);
        fl=(Button) findViewById(R.id.fl);
        caca=(Button) findViewById(R.id.caca);
        poi=(Button) findViewById(R.id.poi);
        riz=(Button) findViewById(R.id.riz);
        da=(Button) findViewById(R.id.da);
        ma=(Button) findViewById(R.id.ma);
        aa=(Button) findViewById(R.id.aa);


        es.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(IngredientsActivity.this,ingActivity2.class);
                startActivity(i);
            }
        });
        ou.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(IngredientsActivity.this,oeufPocheActivity.class);
                startActivity(i);
            }
        });
        om.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(IngredientsActivity.this,omleteActivity.class);
                startActivity(i);
            }
        });
        om2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(IngredientsActivity.this,sardineActivity.class);
                startActivity(i);
            }
        });
        om3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(IngredientsActivity.this,pommeActivity.class);
                startActivity(i);
            }
        });
        om5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(IngredientsActivity.this,thonActivity.class);
                startActivity(i);
            }
        });
        am.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(IngredientsActivity.this,AmandeActivity.class);
                startActivity(i);
            }
        });
        roo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(IngredientsActivity.this,BananeActivity2.class);
                startActivity(i);
            }
        });

        fl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(IngredientsActivity.this,floconActivity.class);
                startActivity(i);
            }
        });
        caca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(IngredientsActivity.this,cacahoueteActivity.class);
                startActivity(i);
            }
        });
        poi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(IngredientsActivity.this,poisActivity.class);
                startActivity(i);
            }
        });
        riz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(IngredientsActivity.this,RizActivity.class);
                startActivity(i);
            }
        });
        da.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(IngredientsActivity.this,datteActivity.class);
                startActivity(i);
            }
        });
        ma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(IngredientsActivity.this,MaisActivity.class);
                startActivity(i);
            }
        });
        aa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(IngredientsActivity.this,MainActivity.class);
                startActivity(i);
            }
        });
    }
}