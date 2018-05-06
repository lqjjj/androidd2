package com.example.administrator.practice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class UC1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_uc1 );
        Button button=(Button) findViewById ( R.id.button6 );
        ContextRelation.Relation ( (Button) findViewById ( R.id.button3 ), UC1.this, horizontal.class );
        ContextRelation.Relation ( (Button) findViewById ( R.id.button4 ), UC1.this, vertical.class );
        ContextRelation.Relation ( (Button) findViewById ( R.id.button5 ), UC1.this, KeepLeft.class );
        button.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                onBackPressed ();
            }
        } );
    }
}
