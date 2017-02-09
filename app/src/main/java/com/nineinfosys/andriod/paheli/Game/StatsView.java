package com.nineinfosys.andriod.paheli.Game;

import android.database.Cursor;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.nineinfosys.andriod.paheli.R;

import java.text.NumberFormat;


public class StatsView extends AppCompatActivity {

	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.highscore);

		android.support.v7.app.ActionBar actionBar = getSupportActionBar();
		actionBar.setHomeButtonEnabled(true);
		actionBar.setDisplayHomeAsUpEnabled(true);
        /* open the database */
        StatsDatabase db = new StatsDatabase(this);

        /* container for stats */
        final LinearLayout container = (LinearLayout) findViewById(R.id.StatList);
        
        /* make the headings */
		LinearLayout headings = new LinearLayout(this);
		
		TextView heading_name = new TextView(this);
		heading_name.setTextColor(Color.BLACK);
		heading_name.setTextSize(20.0f);
		heading_name.setText("Name");
		heading_name.setWidth(200);
		headings.addView(heading_name);
		
		TextView heading_wins = new TextView(this);
		heading_wins.setTextColor(Color.BLACK);
		heading_wins.setTextSize(20.0f);
		heading_wins.setText("WIN ");
		heading_wins.setWidth(120);
		headings.addView(heading_wins);
		
		TextView heading_losses = new TextView(this);
		heading_losses.setTextColor(Color.BLACK);
		heading_losses.setTextSize(20.0f);
		heading_losses.setText("LOSE ");
		heading_losses.setWidth(120);
		headings.addView(heading_losses);
		
		TextView heading_ties = new TextView(this);
		heading_ties.setTextColor(Color.BLACK);
		heading_ties.setTextSize(20.0f);
		heading_ties.setText("TIE ");
		heading_ties.setWidth(120);
		headings.addView(heading_ties);
		
		TextView heading_pct = new TextView(this);
		heading_pct.setTextColor(Color.BLACK);
		heading_pct.setTextSize(20.0f);
		heading_pct.setText("%");
		heading_pct.setWidth(160);
		headings.addView(heading_pct);


		
		container.addView(headings);
        
        /* loop through the stats */
        db.open( );
        Cursor c = db.getAllStats( );
        if (c.moveToFirst( ))
        {
            do {
            		/* make a linear layout for this row */
            		LinearLayout row = new LinearLayout(this);
            		
            		/* make a textview for each column */
            		TextView name = new TextView(this);
            		name.setText(c.getString(1));
            		name.setTextColor(Color.DKGRAY);
            		name.setWidth(210);
            		row.addView(name);
            		
            		TextView wins = new TextView(this);
            		wins.setText(c.getString(2));
            		wins.setTextColor(Color.DKGRAY);
            		wins.setWidth(140);
            		row.addView(wins);
            		
            		TextView losses = new TextView(this);
            		losses.setText(c.getString(3));
            		losses.setTextColor(Color.DKGRAY);
            		losses.setWidth(100);
            		row.addView(losses);
            		
            		TextView ties = new TextView(this);
            		ties.setText(c.getString(4));
            		ties.setTextColor(Color.DKGRAY);
            		ties.setWidth(120);
            		row.addView(ties);
            		
            		TextView pct = new TextView(this);
            		double wins_num = (double) Integer.parseInt(c.getString(2));
            		double losses_num = (double) Integer.parseInt(c.getString(3));
            		double ties_num = (double) Integer.parseInt(c.getString(4));
            		double percent = (wins_num + (ties_num / 2.0)) / (wins_num + losses_num + ties_num);
            		NumberFormat nf = NumberFormat.getInstance( );
            		nf.setMaximumFractionDigits(3);
            		pct.setText(nf.format(percent));
            		pct.setTextColor(Color.DKGRAY);
            		pct.setWidth(160);
            		row.addView(pct);

            		/* put the row in the layout */
            		container.addView(row);
            } while (c.moveToNext( ));
        }
        db.close( );



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