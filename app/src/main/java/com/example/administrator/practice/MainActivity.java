package com.example.administrator.practice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main );
        ContextRelation.Relation ( (Button)findViewById(R.id.button_1), MainActivity.this, UC1.class);
        ContextRelation.Relation ( (Button)findViewById(R.id.button_2), MainActivity.this, UC2.class);
        ContextRelation.Relation ( (Button)findViewById(R.id.button_3), MainActivity.this, UC3.class);
        ContextRelation.Relation ( (Button)findViewById(R.id.button_4), MainActivity.this, UC4.class);
        ContextRelation.Relation ( (Button)findViewById(R.id.button_5), MainActivity.this, UC5.class);
    }
}
