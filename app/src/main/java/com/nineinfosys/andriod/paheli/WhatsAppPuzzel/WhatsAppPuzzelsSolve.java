package com.nineinfosys.andriod.paheli.WhatsAppPuzzel;

import android.content.res.Configuration;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.nineinfosys.andriod.paheli.BrainPuzzels.ViewPagerAdapter;
import com.nineinfosys.andriod.paheli.R;

public class WhatsAppPuzzelsSolve extends AppCompatActivity {

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

                        "1. Tell me any 1000 words that \n" +
                        "cannot contain the letter ‘A’…..\n" +
                        "In 5 seconds….. :)\n :\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "Ans: Count 0-100 (one, two, three, four,\n " +
                        "five, six, seven, eight,..........\n" +
                        " ninety-nine, hundered)\n ",

                        "2. A boy was driving a car, a girl took " +
                        "a lift from her. She asked his " +
                        "name after she get down.\n" +
                        "Boy said :- my name is hidden " +
                        "in my car’s number, find " +
                        "if you can.\n" +
                        "\n" +
                        "Car number was [ WV733N ]" +
                        " Can you guess the name now?\n\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "Ans:  Neelum\n",

                        "3. Bobby’s mother had three children.\n" +
                        "the first child was named April.\n" +
                        "the second child was named May.\n" +
                        "What was the third child name ?\n\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +

                        "Ans: Bobby",


                        "4. Which Is The Only Country \n" +
                        "Which Had A Flag With A Single Color?\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +

                        "Ans: Green – Libya",

                        "6. Answers to 4 cheezon ka naam hindi mein batao\n" +
                        "\n" +
                        "1. Ambulance  \n" +
                        "2. Mobile  \n" +
                        "3. Tube Light \n" +
                        "4. Sim \n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +

                        "Ans: Aapatkaal Vaahan\n"+
                            "Doorbhashak Yantra\n"+
                            "Doorbhashak Yantra\n"+
                            "Grahak Parichay Yantra\n",

                        "7.Guess The Name Of Movie?\n" +
                        " KYPH :\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "Ans: Kya Yahi pyar hai",


                        "8. Guess The Name Of Movie?\n" +
                        "PDHH :\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +

                        "Ans: Pyar deewana hota hai",

                        "9.Guess The Name Of Movie?\n" +
                        " HSSH :\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +

                        "Ans: Hum sath ssath hain",

                        "10.Guess The Name Of Movie?\n" +
                        " BTG :\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "Ans: Bombay to goa",


                        "11.   Prasad ne Kumble se Pepsi\n " +
                        "laane k kaha.\n" +
                        "Kumble Pepsi kee ek bottle\n " +
                        "leke aa gaya par seedha Sachin\n " +
                        "ke paas pahooncha.\n" +
                        "Bataao kyon?\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "Ans: Tendulkar is an opener. \n" +
                        "\n" ,
                "12. Ek Madrasi ne kaha, Main \n" +
                        "'heart is umbrella'\n" +
                        "movie dekh'na chaahta hoon.\n" +
                        " Vah kaun see movie dekh'na chaahta hai?\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "Ans: Dil Chhata Hai!" +
                        "\n" ,
                "13.Jackie Chan ki saas ka\n " +
                        "naam kya hai..\n" +
                        "\n" +
                        "nahi pata..\n" +
                        "\n" +
                        "\n" +

                        "\n" +
                        "\n" +
                        "\n" +
                        "Ans:  D'Cold.(chain ki saans = D'cold )\n" +
                        "\n" ,

                        "14.Guess The Name Of Movie?\n" +
                                " YPD : \n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +

                        "Ans: Yamala pagala deewana",
                "14. What is the next number in the \n" +
                        "Fibonacci sequence: \n" +
                        "0, 1, 1, 2, 3, 5, 8, 13, 21, 34, ?\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "Ans: 55\n",


                "15. 7 x 9 = ?\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "Ans: 63\n",


                "16. True or false? In an isosceles\n" +
                        " triangle all sides are unequal.\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "Ans: False (2 sides are equal)\n",


                "17. In statistics, the middle\n" +
                        " value of an ordered set of\n" +
                        " values is called what?\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "Ans: The median\n",
                "18. Andhe Ko Kya Dikhayi Deta Hai?\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "Ans: Andhera\n" +
                        "\n" ,
                "19. Jitna Jyada Hota Hai Utna\n" +
                        " Kam Dikhayi Deta Hai, \n" +
                        "Batao Wehe Kya Hai..?\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "Ans: Andhera (Darkness)\n" +
                        "\n" ,
                "20. Kahan Par Friday Thursday \n" +
                        "Se Pehle Aata Hai?\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "Ans: Dictionary Mein\n" +
                        "\n" +
                        "\n" ,
                "21. Hari Thi Man Bhari Thi\n" +
                        "No Laakh Motiyon Sey Jadi Thi\n" +
                        "Raja Ji Key Khet Mein\n" +
                        "Duata Odhey Khadi Thi.\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "Ans: Bhutta\n" +
                        "\n" ,
                "22. Chhota Sa Siphai\n" +
                        "Ushki Khinch Ke Nikar Uttari.\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "Ans : Banana\n" +
                        "\n" ,
                "23. Do Kisan Ladten Jaaye\n" +
                        "Unki Kheti Badhti Jaaye.\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "Ans: Sweater Ki Bunai\n" +
                        "\n" ,
                "24. Aisi Kon Si Cheez Hei Jishey\n" +
                        "Aagey Sey Toh Banayaa Hein Bhagwan Ney\n" +
                        "Aur Pichey Sey Insaan Ney.\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "Ans: Bel Gaadi\n" +
                        "\n"

        };
// Locate the ViewPager in viewpager_main.xml
        viewPager = (ViewPager) findViewById(R.id.pager);
        // Pass results to ViewPagerAdapter Class
        adapter = new ViewPagerAdapter(WhatsAppPuzzelsSolve.this,brainpuz);
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
         //   Toast.makeText(this, "landscape", Toast.LENGTH_SHORT).show();
        } else if (newConfig.orientation == Configuration.ORIENTATION_PORTRAIT){
           // Toast.makeText(this, "portrait", Toast.LENGTH_SHORT).show();
        }
    }
}
