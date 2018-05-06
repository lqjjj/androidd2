package com.example.administrator.practice;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Timer;
import java.util.TimerTask;

public class UC3 extends AppCompatActivity {
    int i=2;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_uc3 );
        Timer timer = new Timer ();

        timer.schedule ( new TimerTask () {
            @Override
            public void run() {
                ImageView img1 = (ImageView) findViewById ( R.id.imageView+i );
                ImageView img2;
                if(i>1)
                {
                    img2 = (ImageView) findViewById ( R.id.imageView+i-1 );
                }
                else{
                    img2 = (ImageView) findViewById ( R.id.imageView5 );
                }
                img1.setVisibility ( View.VISIBLE );
                img2.setVisibility ( View.INVISIBLE );
                if(i==5)
                {
                    i=1;
                }

                else i++;
            }
        }, 2000,2000 );
    }
}
