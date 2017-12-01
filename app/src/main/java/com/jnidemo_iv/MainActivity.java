package com.jnidemo_iv;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        JniUtil util=new JniUtil();
        TextView tv = (TextView) findViewById(R.id.sample_text);
        tv.setText(util.sum(10,4)+"");
    }

}
