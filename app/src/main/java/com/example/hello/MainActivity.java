package com.example.hello;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView txv = (TextView) findViewById(R.id.txv);
        txv.setText("Hello tcyang");
        TestMaster();
        TestDev();
    }
    public void TestMaster(){
        TextView txv = (TextView) findViewById(R.id.txv);
        txv.setText("Master分支");
        TestDev();
    }
    public void TestDev(){
        TextView txv = (TextView) findViewById(R.id.txv);
        txv.setText("Dev分支");
    }
}
