package com.shici.kingo33.testdemoshichi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //ceishi
        TextView tv = new TextView(this);

        tv.setText("liuhengpu");
    }
}
