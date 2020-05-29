package com.avoir.synthesemusicale;

import androidx.appcompat.app.AppCompatActivity;

import android.content.pm.ActivityInfo;

import android.view.View;
import android.widget.Button;

import android.os.Bundle;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button dodo = (Button)findViewById(R.id.dodo);
        final Button re = (Button)findViewById(R.id.re);
        final Button mi = (Button)findViewById(R.id.mi);
        final Button fa = (Button)findViewById(R.id.fa);
        final Button sol = (Button)findViewById(R.id.sol);
        final Button la = (Button)findViewById(R.id.la);
        final Button si = (Button)findViewById(R.id.si);
        final TextView textView = (TextView) findViewById(R.id.textView);
        dodo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("do");

            }
        });
        re.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("re");

            }
        });
        mi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("mi");

            }
        });
        fa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("fa");

            }
        });
        sol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("sol");

            }
        });
        la.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("la");

            }
        });
        si.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("si");

            }
        });
    }
}
