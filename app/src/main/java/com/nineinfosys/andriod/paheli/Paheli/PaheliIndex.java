package com.nineinfosys.andriod.paheli.Paheli;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.view.KeyEvent;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

import com.nineinfosys.andriod.paheli.BollywoodPuzzel.BollywoodPuzzelsIndex;
import com.nineinfosys.andriod.paheli.BrainPuzzels.BrainPuzzelIndex;
import com.nineinfosys.andriod.paheli.FaltuPuzzel.FaltuPuzzelsIndex;
import com.nineinfosys.andriod.paheli.FunnyPuzzel.FunnyPuzzelsIndex;
import com.nineinfosys.andriod.paheli.Game.TicTacToe;
import com.nineinfosys.andriod.paheli.KidsPuzzel.KidsPuzzelsIndex;
import com.nineinfosys.andriod.paheli.NumberPuzzel.NumberPuzzelsIndex;
import com.nineinfosys.andriod.paheli.R;
import com.nineinfosys.andriod.paheli.SimplePuzzel.SimplePuzzelsIndex;
import com.nineinfosys.andriod.paheli.WhatsAppPuzzel.WhatsAppPuzzelsIndex;

public class PaheliIndex extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {


    Button brain,kids,simple,funny,fault,number,bollywood,whatsapp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paheli_index);

        brain=(Button)findViewById(R.id.brainpuzzel);
        kids=(Button)findViewById(R.id.kidspuzzel);
        simple=(Button)findViewById(R.id.simplepuzzel);

        number=(Button)findViewById(R.id.numberpuzzel);
        bollywood=(Button)findViewById(R.id.bollywood);
        whatsapp=(Button)findViewById(R.id.whatsapp);

        brain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(PaheliIndex.this,BrainPuzzelIndex.class);
                startActivity(intent);
            }
        });

        kids.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(PaheliIndex.this,KidsPuzzelsIndex.class);
                startActivity(intent);
            }
        });
        simple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(PaheliIndex.this,SimplePuzzelsIndex.class);
                startActivity(intent);
            }
        });

       number.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(PaheliIndex.this,NumberPuzzelsIndex.class);
                startActivity(intent);
            }
        });
        bollywood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(PaheliIndex.this,BollywoodPuzzelsIndex.class);
                startActivity(intent);
            }
        });
        whatsapp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(PaheliIndex.this,WhatsAppPuzzelsIndex.class);
                startActivity(intent);
            }
        });

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.paheli_index, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();



        return super.onOptionsItemSelected(item);
    }

    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);

        // Checks the orientation of the screen
        if (newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE) {
            Toast.makeText(this, "landscape", Toast.LENGTH_SHORT).show();
        } else if (newConfig.orientation == Configuration.ORIENTATION_PORTRAIT){
            Toast.makeText(this, "portrait", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        switch(keyCode){
            case KeyEvent.KEYCODE_BACK:

                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
                alertDialogBuilder.setMessage("Are you sure you want to close App?");
                alertDialogBuilder.setPositiveButton("Yes",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface arg0, int arg1) {

                                finish();
                            }
                        });

                alertDialogBuilder.setNegativeButton("No",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface arg0, int arg1) {

                            }
                        });

                //Showing the alert dialog
                AlertDialog alertDialog = alertDialogBuilder.create();
                alertDialog.show();

                return true;
        }
        return super.onKeyDown(keyCode, event);
    }


    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camera) {
            Intent intent=new Intent(PaheliIndex.this,PaheliIndex.class);
            finish();
            startActivity(intent);
            // Handle the camera action
        }
        else if (id == R.id.nav_faltu) {
            Intent intent=new Intent(PaheliIndex.this,FaltuPuzzelsIndex.class);
            startActivity(intent);
        }
        else if (id == R.id.nav_funny) {
            Intent intent=new Intent(PaheliIndex.this,FunnyPuzzelsIndex.class);
            startActivity(intent);
        }
        else if (id == R.id.nav_game) {
            Intent intent=new Intent(PaheliIndex.this,TicTacToe.class);
            startActivity(intent);
        }
        else if (id == R.id.nav_share) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
