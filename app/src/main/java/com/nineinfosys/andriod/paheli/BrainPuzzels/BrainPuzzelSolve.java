package com.nineinfosys.andriod.paheli.BrainPuzzels;

import android.content.res.Configuration;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.nineinfosys.andriod.paheli.R;


public class BrainPuzzelSolve extends AppCompatActivity {

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

        brainpuz = new String[]{"Meine 20 Ko kaat diya,\n" +
                "Fir bhi,\n" +
                "Na Kanoon toda, Na khoon kiya,\n" +
                "Aisa to meine kya kiya ?\n" +
                "Question mein hi Answer diya…\n" +
                "\n" +
                "\n" +
                "Answer : नाखून काटा",


                "Chiti ke do age Chiti,\n" +
                        "Chiti ke do piche Chiti,\n" +
                        "Bolo Kitni Chiti ?\n" +
                        "\n" +
                        "\n" +
                        "Answer :  3 Chiti",

                "1 Aadmi ne 1 Ungli se 6 logo ko 6 second mein\n" +
                        "upar pahucha diya…\n" +
                        ".\n" +
                        "kya wo..\n" +
                        "Superman tha ? : Nahi…\n" +
                        "Spiderman ? : Nahi…\n" +
                        "Rajinikanth ? : Nahi…\n" +
                        "Nahi…Nahi…Nahi…\n" +
                        ".\n" +
                        "Toh wo kaun tha ?\n" +
                        "\n" + "\n" +
                        "Answer : Lift Wala",

                "Ek table par plate mein do Apple hai.\n" +
                        "aur usey khane wale 3 aadmi…\n" +
                        "Kaise khayenge ?\n" +
                        "tino ke hisse mein 1-1 Apple aana hi chaiye…\n" +
                        "Lagao Dimag… Agar ho to\n" +
                        "\n" +
                        "\n" +
                        "Answer : प्रश्न में ही Answer है, ध्यान से पढ़ियें… यहाँ 1 टेबल पर है,\n" +
                        "            और 2 प्लेट में है\n" +
                        "            तो हो गये न तीन…\n" +
                        "            तीन Apple तीनों को मिलेगे न…",

                "3 Murgiyan 3 din me 3 ande deti hai,\n" +
                        " to 300 murgiyan 300 din me kitne ande degi ?\n" +
                        "\n" +
                        "\n" +
                        "Answer : 3hens gives  3 days =3 eggs\n" +
                        "300hens gives 300 day=?\n" +
                        "                     =300*300*3/3*3\n" +
                        "                     =30000",

                "एक पेंन 5 रु में बेचेगे तो 3 Rs. profit,\n" +
                        "वही पेन 10 Rs. में बेचोगे तो\n" +
                        "कितना profit होगा ?…. 1 minute मे answer दे दो…\n" +
                        "नहीं तो आज ही ट्यूशन रखवा लो…\n" +
                        "\n" +
                        "\n" +
                        "Answer : 8Rs\n" +
                        "        Solution : 5 रू. विक्रय मूल्य – 3 रू. लाभ = 2 रू. क्रय मूल्य\n" +
                        "            इसलिए, यदि विक्रय मूल्य 10 रू. हो तो,\n" +
                        "            लाभ = विक्रय मूल्य – क्रय मूल्य = 10 – 2 = 8 रू",

                "Toys ka bhav –\n" +
                        "1 Rs. ki 40 Machali,\n" +
                        "3 Rs. ka 1 Bandar,\n" +
                        "5 Rs. ka 1 Sher,\n" +
                        "100 Rs. me 100 Toys kaise kharidoge ?"+
                        "\n"+
                        "\n"+
                        "Answer :\n" +
                        "80 मछली  = 2 रू.\n" +
                        "1 बंदर         = 3 रू.\n"+
                        "19 शेर         = 95 रू.\n" +
                        "[80+1+19 = 100,\n" +
                        "2+3+95 = 100]",

                "Chagan aur Magan dono Dost hai,\n" +
                        "Chagan ki Murgi ne\n" +
                        "Magan ke Ghar Jakar Ande diye\n" +
                        "To Batao Ande kiske hue ?\n"+
                        "\n"+
                        "\n"+
                        "Answer : मुर्गी के ही हुए न भाई….",


                "एक औरत अपने पति का नाम बताती है –\n" +
                        " “Beautiful Red Underwear”\n" +
                        "मतलब क्या ?\n"+
                        "\n"+
                        "\n"+
                        "Answer : सिम्पल यार “सुंदर लाल चड्डा”",

                "(1) “Shahad” se jyada meetha ……… hai.\n" +
                        "(2) “Suraj” se jyada Garm ……… hai.\n" +
                        "(3) “Badshah” ko ……… chahiye.\n" +
                        "(4) “Fakir” ke paas ……… hai.\n" +
                        "(5) Jo ……… khayega wo mar jayega.\n" +
                        "Sabhi …….. mein ek hi Word aayega. Batao kya ?\n" +
                        "Test Your Brain…\n"+
                        "\n"+
                        "\n"+
                        "Answer : kuch nahi",

                "1 Aurat 1935 mein paida hui,\n" +
                        "Aur 1935 mein hi uski maut ho gayi,\n" +
                        "Jab wo mari tab uski Age 70 saal ki thi…\n" +
                        "Bataiye ye kaise mumkin hai ?\n" +
                        "Test Your Brain…\n"+
                        "\n" +
                        "\n"+
                        "Answer :\n" +
                        "1935 room ka number hai",

                "Bimar nahi hu mein,\n" +
                        "Fir bhi khati hu “Goli”\n" +
                        "bacche budhe sab dar jate hai,\n" +
                        "Sun kar meri “Boli”\n" +
                        "Test Your Brain…\n"+
                        "\n"+
                        "\n"+
                        "Answer : Gun",

                "1 kamre mein चार सो aadmi the..\n" +
                        "Ab usme se दूसरे कमरे में दो सो गये\n" +
                        "Ab batao kitne aadmi bache ?\n"+
                        "\n"+
                        "\n"+
                        "Answer :  400 (क्योंकि 2 लोग सो गये)",

                " Ladki ke paas aisi kon si cheez hoti hai\n" +
                        "Jo Shadi ke pahele bhi hoti hai\n" +
                        "Aur Shadi ke bad bhi hoti hai,\n" +
                        "Par Shadi ke din nahi hoti ?\n"+
                        "\n"+
                        "\n"+
                        "Answer : Surname",

                "Gay (Cow) Dudh deti hai,\n" +
                        "Aur…\n" +
                        "Murgi Anda deti hai.\n" +
                        "to batao…\n" +
                        "Aisa kon hai jo\n" +
                        "Dudh Aur Anda dono deta hai ?\n"+
                        "\n"+
                        "\n"+
                        "Answer : दुकानदार ",

                "Beshak na ho Hath mein Hath,\n" +
                        "Par Jeeta hai wo aapke sath,\n" +
                        "Batao wo hai kon si baat ?\n"+
                        "\n"+
                        "\n"+
                        "Answer : परछाई",

                " Char Driver Ek Savari\n" +
                        "Jiske Piche Duniya sari ?\n"+
                        "\n"+
                        "\n"+
                        "Answer : अर्थी ",

                "Bina Bulaye Doctor aaye,\n" +
                        "Sui lagakar bhag jaye ?\n"+
                        "\n"+
                        "\n"+
                        "Answer :  मच्छर",

                "Shadi se pahele Dulhan ka Baap\n" +
                        " Dulhe ko kya deta hai,\n" +
                        "Jo Shadi ke baad wapas le leta hai ?\n" +
                        "Batao… Challenge hai…\n"+
                        "\n"+
                        "\n"+
                        "Answer : सुख और चैन",

                "Kya aap is Swal ko Solve kar sakte ho.\n" +
                        "To Prove kijiye ki\n" +
                        "A + B + B + B + 80 + 90 = 100\n" +
                        "Hota hai.\n" +
                        "Try and Reply. What is ‘A’ and ‘B’ ?\n"+
                        "\n"+
                        "\n"+
                        "Answer : Akkad Bakkad Bambe Bo 80 90 Pure 100"
        };
// Locate the ViewPager in viewpager_main.xml
        viewPager = (ViewPager) findViewById(R.id.pager);
        // Pass results to ViewPagerAdapter Class
        adapter = new ViewPagerAdapter(BrainPuzzelSolve.this,brainpuz);
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
           // Toast.makeText(this, "landscape", Toast.LENGTH_SHORT).show();
        } else if (newConfig.orientation == Configuration.ORIENTATION_PORTRAIT){
            //Toast.makeText(this, "portrait", Toast.LENGTH_SHORT).show();
        }
    }
}
