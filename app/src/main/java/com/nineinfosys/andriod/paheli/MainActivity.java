package com.nineinfosys.andriod.paheli;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import com.nineinfosys.andriod.paheli.Paheli.PaheliIndex;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Thread t=new Thread()
        {
            public void run()
            {
                try {
                    sleep(2000);
                    finish();
                    Intent cv=new Intent(MainActivity.this,PaheliIndex.class);
                    startActivity(cv);
                }
                catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        t.start();
    }
}
