package com.gmail.ayushagrawal049.gameofstones;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;


public class stone0 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stone0);

    }

    int q=1;
    public void a(View view) {  int p = (int)((Math.random()*6));
        display(p);
    }
    public void c(View view) {
        dis(q);
    }
Layout view;
    private void display(int a) {
       if (a==0){
           TextView tv = (TextView)findViewById(R.id.text);
           tv.setText(R.string.power1);
           LinearLayout layout =(LinearLayout)findViewById(R.id.lay);
           layout.setBackgroundResource(R.drawable.power);
           TextView t = (TextView)findViewById(R.id.a2);
           t.setText("    Power Stone");
           TextView tv19 = (TextView)findViewById(R.id.te);
           tv19.setText("PRESS 'HUNT STONES' TO CONTINUE");


           if(q%3!=0){
               q=3*q;
           }
           if(q==30030){TextView tv1 = (TextView)findViewById(R.id.te);
               tv1.setText("YOU HAVE All SIX INFINITY STONES NOW SNAP YOUR FINGERS AND SAVE THE WORLD");
               TextView t2 = (TextView)findViewById(R.id.a2);
               t2.setText("");
               TextView t21 = (TextView)findViewById(R.id.a3);
               t21.setText("");
               TextView t22 = (TextView)findViewById(R.id.a4);
               t22.setText("");
               TextView t23 = (TextView)findViewById(R.id.a5);
               t23.setText("");
               TextView t24 = (TextView)findViewById(R.id.a6);
               t24.setText("");
               TextView t25 = (TextView)findViewById(R.id.a7);
               t25.setText("");



           }
       }
        if (a==1){TextView tv = (TextView)findViewById(R.id.text);
            tv.setText(R.string.power2);
            LinearLayout layout =(LinearLayout)findViewById(R.id.lay);
            layout.setBackgroundResource(R.drawable.space);
            TextView t = (TextView)findViewById(R.id.a3);
            t.setText("    Space Stone");
            TextView tv19 = (TextView)findViewById(R.id.te);
            tv19.setText("PRESS 'HUNT STONES' TO CONTINUE");
            if(q%2!=0){
                q=2*q;
            }
            if(q==30030){TextView tv1 = (TextView)findViewById(R.id.te);
                tv1.setText("YOU HAVE All SIX INFINITY STONES NOW SNAP YOUR FINGERS AND SAVE THE WORLD");
                TextView t2 = (TextView)findViewById(R.id.a2);
                t2.setText("");
                TextView t21 = (TextView)findViewById(R.id.a3);
                t21.setText("");
                TextView t22 = (TextView)findViewById(R.id.a4);
                t22.setText("");
                TextView t23 = (TextView)findViewById(R.id.a5);
                t23.setText("");
                TextView t24 = (TextView)findViewById(R.id.a6);
                t24.setText("");
                TextView t25 = (TextView)findViewById(R.id.a7);
                t25.setText("");



            }

        }
        if (a==2){TextView tv = (TextView)findViewById(R.id.text);
            tv.setText(R.string.power3);
            LinearLayout layout =(LinearLayout)findViewById(R.id.lay);
            layout.setBackgroundResource(R.drawable.time);
            TextView t = (TextView)findViewById(R.id.a4);
            t.setText("    Time Stone");
            TextView tv19 = (TextView)findViewById(R.id.te);
            tv19.setText("PRESS 'HUNT STONES' TO CONTINUE");
            if(q%5!=0){
                q=5*q;
            }
            if(q==30030){TextView tv1 = (TextView)findViewById(R.id.te);
                tv1.setText("YOU HAVE All SIX INFINITY STONES NOW SNAP YOUR FINGERS AND SAVE THE WORLD");
                TextView t2 = (TextView)findViewById(R.id.a2);
                t2.setText("");
                TextView t21 = (TextView)findViewById(R.id.a3);
                t21.setText("");
                TextView t22 = (TextView)findViewById(R.id.a4);
                t22.setText("");
                TextView t23 = (TextView)findViewById(R.id.a5);
                t23.setText("");
                TextView t24 = (TextView)findViewById(R.id.a6);
                t24.setText("");
                TextView t25 = (TextView)findViewById(R.id.a7);
                t25.setText("");



            }
        }
        if (a==3){TextView tv = (TextView)findViewById(R.id.text);
            tv.setText(R.string.power4);
            LinearLayout layout =(LinearLayout)findViewById(R.id.lay);
            layout.setBackgroundResource(R.drawable.reality);
            TextView t = (TextView)findViewById(R.id.a5);
            t.setText("    Reality Stone");
            TextView tv19 = (TextView)findViewById(R.id.te);
            tv19.setText("PRESS 'HUNT STONES' TO CONTINUE");
            if(q%7!=0){
                q=7*q;
            }
            if(q==30030){TextView tv1 = (TextView)findViewById(R.id.te);
                tv1.setText("YOU HAVE All SIX INFINITY STONES NOW SNAP YOUR FINGERS AND SAVE THE WORLD");
                TextView t2 = (TextView)findViewById(R.id.a2);
                t2.setText("");
                TextView t21 = (TextView)findViewById(R.id.a3);
                t21.setText("");
                TextView t22 = (TextView)findViewById(R.id.a4);
                t22.setText("");
                TextView t23 = (TextView)findViewById(R.id.a5);
                t23.setText("");
                TextView t24 = (TextView)findViewById(R.id.a6);
                t24.setText("");
                TextView t25 = (TextView)findViewById(R.id.a7);
                t25.setText("");



            }
        }
        if (a==4){TextView tv = (TextView)findViewById(R.id.text);
            tv.setText(R.string.power5);
            LinearLayout layout =(LinearLayout)findViewById(R.id.lay);
            layout.setBackgroundResource(R.drawable.soul);
            TextView t = (TextView)findViewById(R.id.a6);
            t.setText("    Soul Stone");
            TextView tv19 = (TextView)findViewById(R.id.te);
            tv19.setText("PRESS 'HUNT STONES' TO CONTINUE");
            if(q%11!=0){
                q=11*q;
            }
            if(q==30030){TextView tv1 = (TextView)findViewById(R.id.te);
                tv1.setText("YOU HAVE All SIX INFINITY STONES NOW SNAP YOUR FINGERS AND SAVE THE WORLD");
                TextView t2 = (TextView)findViewById(R.id.a2);
                t2.setText("");
                TextView t21 = (TextView)findViewById(R.id.a3);
                t21.setText("");
                TextView t22 = (TextView)findViewById(R.id.a4);
                t22.setText("");
                TextView t23 = (TextView)findViewById(R.id.a5);
                t23.setText("");
                TextView t24 = (TextView)findViewById(R.id.a6);
                t24.setText("");
                TextView t25 = (TextView)findViewById(R.id.a7);
                t25.setText("");



            }
        }
        if (a==5){TextView tv = (TextView)findViewById(R.id.text);
            tv.setText(R.string.power6);
            LinearLayout layout =(LinearLayout)findViewById(R.id.lay);
            layout.setBackgroundResource(R.drawable.mind);
            TextView t = (TextView)findViewById(R.id.a7);
            t.setText("    Mind Stone");
            TextView tv19 = (TextView)findViewById(R.id.te);
            tv19.setText("PRESS 'HUNT STONES' TO CONTINUE");
            if(q%13!=0){
                q=13*q;
            }
            if(q==30030){TextView tv1 = (TextView)findViewById(R.id.te);
                tv1.setText("YOU HAVE All SIX INFINITY STONES NOW SNAP YOUR FINGERS AND SAVE THE WORLD");
                TextView t2 = (TextView)findViewById(R.id.a2);
                t2.setText("");
                TextView t21 = (TextView)findViewById(R.id.a3);
                t21.setText("");
                TextView t22 = (TextView)findViewById(R.id.a4);
                t22.setText("");
                TextView t23 = (TextView)findViewById(R.id.a5);
                t23.setText("");
                TextView t24 = (TextView)findViewById(R.id.a6);
                t24.setText("");
                TextView t25 = (TextView)findViewById(R.id.a7);
                t25.setText("");



            }
        }
    }
    private void dis(int a){ TextView tv = (TextView)findViewById(R.id.text);
        tv.setText(R.string.start);
        LinearLayout layout =(LinearLayout)findViewById(R.id.lay);
        layout.setBackgroundResource(R.drawable.welcome);
        q=q/q;

        TextView tv19 = (TextView)findViewById(R.id.te);
        tv19.setText("PRESS 'HUNT STONES' TO START");
        TextView t2 = (TextView)findViewById(R.id.a2);
        t2.setText("");
        TextView t21 = (TextView)findViewById(R.id.a3);
        t21.setText("");
        TextView t22 = (TextView)findViewById(R.id.a4);
        t22.setText("");
        TextView t23 = (TextView)findViewById(R.id.a5);
        t23.setText("");
        TextView t24 = (TextView)findViewById(R.id.a6);
        t24.setText("");
        TextView t25 = (TextView)findViewById(R.id.a7);
        t25.setText("");


    }
}
