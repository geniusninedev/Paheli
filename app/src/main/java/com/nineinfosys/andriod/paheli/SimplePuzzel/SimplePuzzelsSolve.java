package com.nineinfosys.andriod.paheli.SimplePuzzel;

import android.content.res.Configuration;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.nineinfosys.andriod.paheli.BrainPuzzels.ViewPagerAdapter;
import com.nineinfosys.andriod.paheli.R;

public class SimplePuzzelsSolve extends AppCompatActivity {


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

        brainpuz = new String[]{"1. चलती हूँ पर पैर नहीं ,\n" +
                "कभी राह नहीं बदलती ,\n" +
                "चलती हूँ टिक टिक कर,\n" +
                "देख कर करते तुम सारे काम ,\n" +
                "तो बताओ मेरा नाम ?\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "Ans: घडी\n" +
                "\n" ,
                "2.मंदिर मे हूँ तो हर कोई शीश झुकाये ,\n" +
                        "पर रास्ते मे मिलूं तो हर कोई ठोकर मारता जाये ,\n" +
                        "पहेली समझ आई तो कोई मेरा नाम तो बता जाये !!\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "Ans: पत्थर\n" +
                        "\n" ,
                "3. दिन मे सोती ,\n" +
                        "रात को रोती,\n" +
                        "जितना रोती ,\n" +
                        "उतना खोती !!\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "Ans: मोमबती\n" +
                        "\n" ,
                "4. मेरी पीठ पर तुम बैठो,\n" +
                        "आसमान की सैर कराऊँ,\n" +
                        "जल्दी से तुमको मे मंजिल पर उतारूँ !!\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "Ans: हवाई जहाज.\n" +
                        "\n" ,
                "5. गिन नहीं सकता कोई ,\n" +
                        "हैं हजारों लाखों एक साथ,\n" +
                        "दिमाग को ढके रखते ,\n" +
                        "गर्मी सर्दी बरसात !!\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "Ans: बाल\n" +
                        "\n" ,
                "6.Aise kon se chej hai\n" +
                        "Jise jitna khicho vo utni hi\n" +
                        "Choti hoti hai?\n" +
                        "\n" +

                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "Ans: Bidi and Cigrate\n" +
                        "\n" ,
                "7.  Ek din, Ek vakil aur uske\n" +
                        " bete ka accident ho gaya\n" +
                        "Unhe hospital le jaya gaya\n" +
                        "\n" +
                        "Operation room me Doctor ne " +
                        "Enter kiya aur ladke ko dekh\n " +
                        "kar kaha ye to mera beta hai\n" +
                        "To my frends bataiye doctor ne\n" +
                        " us ladke ko apna beta kyo kaha?\n\n" +
                        "\n" +

                        "\n" +
                        "\n" +
                        "Ans: Vo Lady Doctor Uski Maa Thi\n" +
                        "\n" ,
                "8. Ek Phool hai Kale rang ka\n" +
                        "Sir par hamesha suhaye\n" +
                        "Tej Dhoop me khil khil jata\n" +
                        "Par chaya me murjaye?\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "Ans: Nariyal\n" +
                        "\n" ,
                "9. Dhup me aane par jalne lagti hai\n" +
                        "Chav me aane par murjha jati hai\n" +
                        "Hawa chalne par mar jati hai\n" +
                        "Btao Kya?\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "Ans: Pasina\n" +
                        "\n" ,
                "10.पीली पोखर पीले अंडे\n" +
                        "    बताओ जी बताओ\n" +
                        "    नहीं तो पड़ेंगे डंडे\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "Ans: कढी पकोड़ा\n" +
                        "\n" ,
                "11.  ऐसा शब्द लिखकर बनाये \n" +
                        "    फूल-फल मिल मिठाई बन जाये\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "Ans:  गुलाब-जामुन \n" +
                        "\n" ,
                "12. एक पहेली सदा नवेली |\n" +
                        "जो बूझो सो जिंदा ||\n" +
                        "जिंदा में से मुर्दा निकले |\n" +
                        "मुर्दा में से जिंदा ||\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "Ans: अंडा\n" +
                        "\n" ,
                "13. काली काली माँ |\n" +
                        "लाल लाल बच्चे ||\n" +
                        "जिधर जाए माँ |\n" +
                        "उधर भागे बच्चे ||\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "Ans: रेलगाड़ी\n" +
                        "\n" ,
                "14. छोटी सी छोकरी |\n" +
                        "लालबाई नाम है ||\n" +
                        "पहने है घाघरा |\n" +
                        "एक पैसा दाम है ||\n" +
                        " \n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "Ans:लाल मिर्च\n" +
                        "\n" ,
                "15.पानी है पर बाहर नहीं |\n" +
                        "पूंछ है पर बन्दर नहीं ||\n" +
                        "दाढ़ी है पर मूंछ नहीं |\n" +
                        "आंख है पर जीभ नहीं ||\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "Ans: नारियल\n" +
                        "\n" ,
                "16. आंखें हैं पर अंधी हूँ |\n" +
                        "पैर हैं पर लंगड़ी हूँ ||\n" +
                        "मुंह है पर मौन हूँ |\n" +
                        "बतलाओ मैं कौन हूँ ||\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "Ans: गुड़िया\n" +
                        "\n" ,
                "17. दो अक्षर का मेरा नाम |\n" +
                        "मेरे बिन न चलता काम ||\n" +
                        "रंगहीन हूँ स्वादहीन हूँ |\n" +
                        "हरदम आता हूँ मैं काम ||\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "Ans: पानी\n" +
                        "\n" ,
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

        };
// Locate the ViewPager in viewpager_main.xml
        viewPager = (ViewPager) findViewById(R.id.pager);
        // Pass results to ViewPagerAdapter Class
        adapter = new ViewPagerAdapter(SimplePuzzelsSolve.this,brainpuz);
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


