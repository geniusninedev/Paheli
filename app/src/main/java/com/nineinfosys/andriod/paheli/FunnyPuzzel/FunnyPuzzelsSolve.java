package com.nineinfosys.andriod.paheli.FunnyPuzzel;

import android.content.res.Configuration;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.nineinfosys.andriod.paheli.BrainPuzzels.ViewPagerAdapter;
import com.nineinfosys.andriod.paheli.R;

public class FunnyPuzzelsSolve extends AppCompatActivity {

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

        brainpuz = new String[]{"1.When will a horse\n" +
                " have 6 legs? \n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "Ans: When someone rides\n" +
                " on the horse \n" +
                "\n" ,
                "2.When do you find a lot of\n" +
                        " cities without single house? \n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "Ans: In a map \n" +
                        "\n" ,
                "3. How can u double ur money? \n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "Ans: Show it in front\n" +
                        " of a mirror.\n" +
                        "\n" ,
                "4. Take the letters  ERGRO , \n" +
                        "put three letters in-front  \n" +
                        "of it and same three letters  \n" +
                        "behind to form a common English word\n" +
                        "What is that word?\n"+
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "Ans: UND ERGRO UND\n" +
                        "\n" ,
                "5. अगर दम है तो इस सवाल का जवाब देकर\n" +
                        "दिखाओ.\n" +
                        "एक कुतिया के दो पिल्ले थे, \n" +
                        "एक का नाम था सपुन और दूसरे का नाम\n" +
                        "था अपुन.\n" +
                        "एक दिन सपुन मर गया, अब कुतिया का दूध\n" +
                        "कौन पिएगा ???\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "Ans: :) :)\n" +
                        "\n" ,
                "6.Which is the most shocking city?\n" +
                        "\n" +

                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "Ans: Electri-city\n" +
                        "\n" ,
                "7.   Name two things u can \n" +
                        "never eat before breakfast?\n" +
                        "\n" +

                        "\n" +
                        "\n" +
                        "Ans: Dinner & Lunch\n" +
                        "\n" ,
                "8. How many great men were\n" +
                        " born in india?\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "Ans: None, only babies were born.\n" +
                        "\n" ,
                "9. If your clock strikes 13,\n " +
                        "what times it is?\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "Ans: Time to buy a new clock \n" +
                        "\n" ,
                "10. If you had three apples and \n" +
                        "four oranges in one hand and \n" +
                        "four apples and three oranges \n" +
                        " in the other hand, what would \n" +
                        "you have? \n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "Ans:  Very large hands. \n" +
                        "\n" ,
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
                        "\n" +
                        "\n" +
                        "Ans:  D'Cold.(chain ki saans = D'cold )\n" +
                        "\n" ,
                "14. chalo ab batao...\n" +
                        "\n" +
                        "Jackie Chan ki bahu\n" +
                        " ka naam kya hai?\n\n" +
                        " \n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "Ans: D'Cold again. kyunki saas\n " +
                        "bhi kabhi bahu thi ...\n" +
                        "\n" ,
                "15. Ek aur muaka de hi dete hain. .....\n" +
                        "\n" +
                        "kamal, vimal do bhai the, \n" +
                        "dono bus stop pe khade the..\n" +
                        "\n" +
                        "bus aai vimal chadh jaata hai\n" +
                        " per kamal nahin jaata hai.\n" +
                        "\n" +
                        "Kyon?\n\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +

                        "Ans:  Kyonki bus per likha \n" +
                        "tha ONLY VIMAL !!!!!\n" +
                        "\n" ,
                "16. Where was the first\n" +
                        " potato found?\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "Ans: In the ground.\n" +
                        "\n" ,
                "17. What comes down but \n" +
                        "never goes up?\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "Ans: Rain\n" +
                        "\n" ,
                "18.  Which is the hardest key to turn?\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "Ans: Donkey.\n" +
                        "\n" ,
                "19.Where do fish keep their money?\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "Ans: At the river bank.\n" +
                        "\n" ,
                "20. Why Pakistani cricket team given \n" +
                        "cigarette lighter?\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "Ans:  Because they lost all\n " +
                        "their matches. \n" +
                        "\n" +
                        "\n" ,

        };
// Locate the ViewPager in viewpager_main.xml
        viewPager = (ViewPager) findViewById(R.id.pager);
        // Pass results to ViewPagerAdapter Class
        adapter = new ViewPagerAdapter(FunnyPuzzelsSolve.this,brainpuz);
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
