package com.example.administrator.practice;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class ContextRelation {
        public static void Relation(Button button, final Context context, final Class<?> cls) {
                button.setOnClickListener(new View.OnClickListener() {
                 @Override
                 public void onClick(View v) {
                 Intent intent=new Intent ( context,cls);
                 context.startActivity (intent);
                 }
             });
        }
}
