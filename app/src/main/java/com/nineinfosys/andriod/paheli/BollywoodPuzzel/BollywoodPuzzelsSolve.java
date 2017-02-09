package com.nineinfosys.andriod.paheli.BollywoodPuzzel;

import android.content.res.Configuration;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.nineinfosys.andriod.paheli.BrainPuzzels.ViewPagerAdapter;
import com.nineinfosys.andriod.paheli.R;

public class BollywoodPuzzelsSolve extends AppCompatActivity {

    ViewPager viewPager;
    PagerAdapter adapter;
    String[] brainpuz;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_brain_puzzel_solve);



        brainpuz = new String[]{
                "1. HDDCS :\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "Ans: Hum dil de chuke sanam",


                        "2. BMB :\n" +
                        "\n" +
                        "\n" +
                        "\n" +

                                "Ans: Bhag milkha bhag",

                        "3. HADMRH :\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                                "Ans: Hum aapke dil mien rehte hain",


                        "4. MPK :\n" +
                        "\n" +
                        "\n" +
                        "\n" +


                                "Ans: Maine pyar kiya",

                        "6. JDMGRH :\n" +
                        "\n" +
                        "\n" +
                        "\n" +


                                "Ans: Jish desh mein ganga rehta hai",

                        "7. KYPH :\n" +
                        "\n" +
                        "\n" +
                        "\n" +

                                "Ans: Kya Yahi pyar hai",


                        "8. PDHH :\n" +
                        "\n" +
                        "\n" +
                        "\n" +


                                "Ans: Pyar deewana hota hai",

                        "9. HSSH :\n" +
                        "\n" +
                        "\n" +
                        "\n" +


                                "Ans: Hum sath ssath hain",

                        "10. BTG :\n" +
                        "\n" +
                        "\n" +
                        "\n" +

                                "Ans: Bombay to goa",

                        "11. TBT :\n" +
                        "\n" +
                        "\n" +
                        "\n" +

                                "Ans: The burning train",


                        "12. PBDHH :\n" +
                        "\n" +
                        "\n" +
                        "\n" +

                                "Ans: Phir bhi dil hai Hindustani",

                        "13. JPKHH :\n" +
                        "\n" +
                        "\n" +
                        "\n" +

                                "Ans: Jab pyar kisi se hota hai",


                        "14. YPD : \n" +
                        "\n" +
                        "\n" +
                        "\n" +


                                "Ans: Yamala pagala deewana",

                        "15. KKKG :\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                                "Ans: Kabhi khushi kbhi gum",

                        "16. DAAPP :\n" +
                        "\n" +
                        "\n" +
                        "\n" +

                                "Ans: Dil apna aur preet parayi",


                        "17. APKGK :\n" +
                        "\n" +
                        "\n" +
                        "\n" +

                                "Ans: Ajab prem ki gajab kahani",

                        "18. YJHD :\n" +
                        "\n" +
                        "\n" +
                        "\n" +

                                "Ans:  Yeh jawani hai deewani",


                        "19. PPNH :\n" +
                        "\n" +
                        "\n" +
                        "\n" +

                                "Ans: Phata Poster nikla Hero",


                        "20. ZNMD :\n" +
                        "\n" +
                        "\n" +
                        "\n" +

                                "Ans: Zindagi na milegi dobara",


                        "21. SOS :\n" +

                        "\n" +
                        "\n" +
                        "\n" +

                                "Ans: Son of sardar",


                        "22. DCH :\n" +
                        "\n" +
                        "\n" +
                        "\n" +

                                "Ans: Dil chahta hai deewana",


                        "23. BAH :\n" +
                        "\n" +
                        "\n" +
                        "\n" +

                                "Ans:  Bachna Ae Haseeno",

                        "24. BMCM :\n" +
                        "\n" +
                        "\n" +
                        "\n" +

                                "Ans: Bade Miyan Chhote Miyan",


                        "25. MPKDH :\n" +
                        "\n" +
                        "\n" +
                        "\n" +

                                "Ans: Mein prem ki dewani hoon",


                        "26. RKAB :\n" +
                        "\n" +
                        "\n" +
                        "\n" +

                "Ans: Raja ki aayegi baraat"

        };



        android.support.v7.app.ActionBar actionBar = getSupportActionBar();
        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);


// Locate the ViewPager in viewpager_main.xml
        viewPager = (ViewPager) findViewById(R.id.pager);
        // Pass results to ViewPagerAdapter Class
        adapter = new ViewPagerAdapter(BollywoodPuzzelsSolve.this,brainpuz);
        // Binds the Adapter to the ViewPager
        viewPager.setAdapter(adapter);

        final int pos = getIntent().getIntExtra("key", 0);
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
           // Toast.makeText(this, "portrait", Toast.LENGTH_SHORT).show();
        }
    }
}
