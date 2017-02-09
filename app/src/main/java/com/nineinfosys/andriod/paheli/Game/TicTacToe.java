package com.nineinfosys.andriod.paheli.Game;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.nineinfosys.andriod.paheli.R;


public class TicTacToe extends AppCompatActivity {
	
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        android.support.v7.app.ActionBar actionBar = getSupportActionBar();
        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);
        /* get controls */
        final Button pvp = (Button) findViewById(R.id.pvp);
        final Button pvc = (Button) findViewById(R.id.pvc);
        final Button vs = (Button) findViewById(R.id.vs);
        final Button quit = (Button) findViewById(R.id.quit);
        
        /* so the listeners can access me */
        final TicTacToe me = this;
        
        /* quit control */
        quit.setOnClickListener(new Button.OnClickListener( ) {
            public void onClick(View v) {
            	me.finish( );
            }
        });
        
        /* player versus player control */
        pvp.setOnClickListener(new Button.OnClickListener( ) {
            public void onClick(View v) {
            	Intent i = new Intent(me, Game.class);
            	i.setType("2");
            	me.startActivity(i);
            }
        });
        
        /* player versus computer control */
        pvc.setOnClickListener(new Button.OnClickListener( ) {
            public void onClick(View v) {
            	Intent i = new Intent(me, Game.class);
            	i.setType("1");
            	me.startActivity(i);
            }
        });
        
        /* view high score control */
        vs.setOnClickListener(new Button.OnClickListener( ) {
            public void onClick(View v) {
            	Intent i = new Intent(me, StatsView.class);
            	i.setType("1");
            	me.startActivity(i);
            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        switch (item.getItemId()) {
            case android.R.id.home:
                // app icon in action bar clicked; goto parent activity.
                this.finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);

        }
    }
}
        
        