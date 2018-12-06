package com.itfun.strike.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int pointA = 0;
    private int pointB = 0;

    private TextView txtA;
    private TextView txtB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtA = (TextView) findViewById(R.id.textPointA);
        txtB = (TextView) findViewById(R.id.textPointB);
    }

    public void btnA(View view) {
        pointA += 1; // увеличиваю счетчик
        txtA.setText(Integer.toString(pointA)); // передаю значение переменной в текстовое поле

    }

    public void btnB(View view) {
        pointB += 1;
        txtB.setText(Integer.toString(pointB));
    }
}
