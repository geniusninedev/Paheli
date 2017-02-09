package com.nineinfosys.andriod.paheli.FaltuPuzzel;

import android.content.res.Configuration;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.nineinfosys.andriod.paheli.BrainPuzzels.ViewPagerAdapter;
import com.nineinfosys.andriod.paheli.R;

public class FaltuPuzzelsSolve extends AppCompatActivity {

    ViewPager viewPager;
    PagerAdapter adapter;
    String[] brainpuz;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_brain_puzzel_solve);

        android.support.v7.app.ActionBar actionBar = getSupportActionBar();
        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);

        brainpuz = new String[]{
                "1. RAM SITA HAI … \n" +
                "TO RAM KAUN HAI ?? … \n" +
                "\n" +
                "\n" +
                "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                "Ans: TAILOR ( darzi )\n" ,

                "2.SITA RAM HAI TO SITA KAUN HAI\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "Ans: Sita MEMORY hai \n" +
                        "(RAM: Random Access Memory) \n" +
                        "\n" ,
                "3.  What will! u call a \n" +
                        "person who is leaving India ?? \n" +
                        "Socho…………… \n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "Ans:Hindustan Lever (Leaver).\n" +
                        "\n" ,
                "4. Kalidas ka ek bhai joote banata \n" +
                        "tha us ka naam kya tha?\n"+
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "Ans: Adidas\n" +
                        "\n" ,
                "5. Luv and Kush are going to a \n" +
                        "village & in between comes a well.\n" +
                        " Luv falls into the well. \n" +
                        "Why ?\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "Ans:Because Luv is blind!!!!!\n" +
                        "\n" ,
                "6.Now Kush also jumps inside. Why?\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "Ans: Luv ke liye saala kuch bhi karega!!!!\n" +
                        "\n" ,
                "7.   What do you call a \n" +
                        "Cow Dancing? . . . . . . . . . . . .\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "Ans: “Guidance..”!\n" +
                        "\n" ,
                "8. Murgi anda deti hai & cow doodh\n" +
                        "deti hai to aisa koun hai jo dono deta hai\n" +
                        "socho…\n" +
                        "…\n" +
                        "…\n" +
                        "…\n" +
                        "nahi pata?\n" +
                        ".\n" +
                        ".\n" +
                        ".\n" +
                        ".\n" +
                        ".\n" +
                        ".\n" +
                        "Ans – DUKANDAR\n",

                "9. एक हाथी तालाब के पानी में गया,\n" +
                        "वो अब कैसे बहार निकलेगा ?\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "Ans: गीला होकर…\n" ,
                "10. एक औरत अपने पति का नाम बताती है –\n" +
                        " “Beautiful Red Underwear”\n" +
                        "मतलब क्या ? \n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "Ans: सिम्पल यार “सुंदर लाल चड्डा” \n" ,
                "11.  I am made of 5 letters, \n" +
                        "If U remove the first letter, \n" +
                        "It is part of our body. \n" +
                        "\n" +
                        "If U remove the second letter, \n" +
                        "It is everywhere! \n" +
                        "\n" +
                        "Guess what ! \n" +
                        ".\n" +
                        ".\n" +
                        "HAIR \n" +
                        ".\n" +
                        ".\n" +
                        "AIR \n" +
                        "\n" +

                        "Ans: CHAIR. \n" +
                        "\n" ,
                "12.This is a smart test, try 2 solve it: \n" +
                        "\n" +
                        "R+CAT+SHOW-RAT+SUN-CHOSE+\n" +
                        "MOON+I-NOON+GOAL+T-GOAT-U+E \n" +
                        "\n" +
                        "Send answer if u r a genius. \n" +
                        "It’s only 1 word. \n" +
                        "Solve n reply! \n" +
                        "\n" +
                        "\n" +

                        "\n" +
                        "\n" +
                        "\n" +
                        "Ans: SMILE" +
                        "\n" ,
                "13.Tawe par pada popcorn kyun uchalta hai? \n" +
                        "- \n" +
                        "- \n" +
                        "- \n" +
                        "Bolo boloo?? \n" +
                        "- \n" +
                        "- \n" +
                        "- \n" +
                        "Kuch to bolo? \n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "Ans:  Tawe par beth ke dekho pata chal jayega!!!\n" +
                        "\n" ,
                "14. What is the opposite of 'Dominos' ?\n" +
                        "Think...\n" +
                        "Tired?\n" +
                        " \n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "Ans: Domi doesn't know\n" +
                        "\n" ,
                "15. What is the opposite of 'Pizza Hut' ?\n" +
                        "Tired again?\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "Ans:  Pizza hatna mat!\n" +
                        "\n" ,
                "16.What is the opposite of \n"+
                   "Subramanium Sawmi ?\n" +
                        "Gave up?" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "Ans: Subramanium didn't see me!\n" +
                        "\n"

        };
// Locate the ViewPager in viewpager_main.xml
        viewPager = (ViewPager) findViewById(R.id.pager);
        // Pass results to ViewPagerAdapter Class
        adapter = new ViewPagerAdapter(FaltuPuzzelsSolve.this,brainpuz);
        // Binds the Adapter to the ViewPager
        viewPager.setAdapter(adapter);

        int pos = getIntent().getIntExtra("key", 0);
        viewPager.setCurrentItem(pos);




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

    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);

        // Checks the orientation of the screen
        if (newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE) {
          //  Toast.makeText(this, "landscape", Toast.LENGTH_SHORT).show();
        } else if (newConfig.orientation == Configuration.ORIENTATION_PORTRAIT){
            //Toast.makeText(this, "portrait", Toast.LENGTH_SHORT).show();
        }
    }
}
