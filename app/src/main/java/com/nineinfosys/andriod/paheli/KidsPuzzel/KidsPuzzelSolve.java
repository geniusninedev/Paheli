package com.nineinfosys.andriod.paheli.KidsPuzzel;

import android.content.res.Configuration;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.nineinfosys.andriod.paheli.BrainPuzzels.ViewPagerAdapter;
import com.nineinfosys.andriod.paheli.R;

public class KidsPuzzelSolve extends AppCompatActivity {


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

        brainpuz = new String[]{"1. Kali hai par Kaag Nhai\n" +
                "Lambi hai par Naag Nhai\n" +
                "Balkhati hai par Dor Nhai\n" +
                "Bandhte hai par Dor Nhai\n" +
                "Baato Kya?\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "Ans: Choti\n" +
                "\n" ,
                "2. Bujho Bhaiya Ek Paheli\n" +
                "Jab Kaato to Nai Naveli?\n" +
                "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                "Ans: Pencil\n" +
                "\n" ,
                "3. Aisa Kon si hai\n" +
                "Jiska aana bhi kharab aur jana bhi kharab\n" +
                "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                "Ans: Ankhe\n" +
                "\n" ,
                "4. Somvaar ka din tha 2 chor bank loot kar ek car mai bhaage\n" +
                "Police ne choro ka peecha kiya\n" +
                "Peecha karne par pata chala ki choro ki car ke peeche ki number plate ki lights kharaab thi\n" +
                "Aur Police ki Jeep ki head lights kharaab thi\n" +
                "Batao police ne un choro ko kaise pakda?\n" +
                "\n" +
                        "\n" +
                        "\n" +

                "Ans: Somvaar ka Din Tha. Din me Light ki jarurat nhi hoti.\n" +
                "\n" ,
                "5. Lal Ghoda Ruka rhe.\n" +
                "Kala Ghoda Bhagta Jaye\n" +
                "Btao Kon?\n" +
                "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                "Ans: Aag/Dhua\n" +
                "\n" ,
                "6. Kali Kali Maa\n" +
                "Laal Laal Bache\n" +
                "Jidar Jaye Maa\n" +
                "Udhar Jaye Bache\n" +
                "Bato Ky?\n" +
                "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                "Ans: Train\n" +
                "\n" ,
                "7. Mai Maru Mai Katu Tum kyo Rote ho\n" +
                "Btao Kya?\n" +
                "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                "Ans: Onion\n" +
                "\n" ,
                "8. Bimar nahi rehti mai\n" +
                "Fir bhi khati hu goli\n" +
                "Bache bude sab dar jate\n" +
                "Sun kar iski boli\n" +
                "Btao kya?\n" +
                "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                "Ans: Gun\n" +
                "\n" ,
                "9. Agar Naak pe chad jau\n" +
                "Kaan pakad kar tumhe padau\n" +
                "Btao kya?\n" +
                "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                "Ans: Chasma\n" +
                "\n" ,
                "10. Dunia bhar ki karta sair\n" +
                "Dharti pe na rakhta pair\n" +
                "Din me sota raat me jagta\n" +
                "Raat andheri meri bagair\n" +
                "Jaldi batao mai hu kaun?\n" +
                "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                "Ans: Moon(Chaand)\n" +
                "\n" ,
                "11. Kala Ghoda\n" +
                "Safed ki sawari\n" +
                "Ek utra to dusre ki bari?\n" +
                "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                "Ans: Tava and Roti\n" +
                "\n" ,
                "12. Aise kon se chej hai\n" +
                "Jise jitna khicho vo utni hi\n" +
                "Choti hoti hai?\n" +
                "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                "Ans: Bidi and Cigrate\n" +
                "\n" ,
                "13. Dhoop dekh mai aa jau\n" +
                "Chav dekh sharma Jau\n" +
                "Jab hawa kare muje sparsh\n" +
                "Mai usme sama jau\n" +
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
                "14. Ek din, Ek vakil aur uske \n" +
                        "bete ka accident ho gaya\n" +
                "Unhe hospital le jaya gaya\n" +
                "\n" +

                "Operation room me Doctor ne Enter kiya\n " +
                        "aur ladke ko dekh kar kaha ye to mera beta hai\n" +
                "To my frends bataiye doctor ne us ladke ko apna beta kyo kaha?\n" +
                "\n" +
                        "\n" +
                        "\n" +
                        "\n" +


                "Ans: Vo Lady Doctor Uski Maa Thi\n" +
                "\n" ,
                "15. Ladki ke paas wo konsi cheez hai jo uske paas\n" +
                "Shadi se pahle bhi hoti\n" +
                "Aur Shadi k baad bhi\n" +
                "Par Shadi wale Din Nhi hoti?\n" +
                "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                "Ans: Surname\n" +
                "\n" ,
                "16. Khridne Par Kala\n" +
                "Jalane par Laal\n" +
                "Fenkne par Safed\n" +
                "Btao kya hai?\n" +
                "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                "Ans: Koyla\n" +
                "\n" ,
                "17. Ek Raja ki anokhi Rani\n" +
                "Dum k sahre piti Pani\n" +
                "Btao Kya?\n" +
                "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                "Ans: Diya\n" +
                "\n" ,
                "18. Ek Phool hai Kale rang ka\n" +
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
                "Ans: Umbrella\n" +
                "\n" ,
                "19. Ek Pita ne apne bache ko gift dete hue kha\n" +
                "Isme aise chez hai ki jab tumhe pyaas lage to pee lena\n" +
                "Jab bukh lage to kha lena\n" +
                "Aur jab sardi lage to jala lena\n" +
                "Btao aise kon se chez hai jo hamare itne kaam ayegi?\n" +
                "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                "Ans: Nariyal\n" +
                "\n" ,
                "20. Dhup me aane par jalne lagti hai\n" +
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
                "\n" +
                "\n" ,
                "21. प्यार करूँ तो घर चमका दूँ वार करूँ तो ले लूँ जान\n" +
                "जंगल में मंगल कर दूँ कभी कर दूँ मैं शहर वीरान\n" +
                        "\n"+
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                "Answer- बिजली\n" +
                "\n" ,
                "22. कपड़े उतरवाएँ पंखा चलवाए कहती ठंडा पीने को\n" +
                "अभी-अभी तो नहा के आया फिर से कहती नहाने को\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                "उत्तर- गर्मी\n" +

                " \n" ,
                "23. जो जाकर न वापस आये जाता भी वह नजर न आये\n" +
                "सारे जग में उसकी चर्चा वह तो अति बलवान कहाये\n" +
                        "\n" + "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                "उत्तर- समय\n" +
                "\n" ,
                "24. गर्मी में जिससे घबराते जाड़े में हम उसको खाते\n" +
                "उससे है हर चीज चमकती दुनिया भी है खूब दमकती\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                "उत्तर- धुप\n" +
                "\n" ,
                "25. धूप लगे पैदा हो जाये छाँह लगे मर जाये\n" +
                "करे परिश्रम तो भी उपजे हवा लगे मर जाये\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                "उत्तर- पसीना\n" +
                "\n" +
                "\n" ,
                "26. Bikhari Nhi Par Bikh Mangataa Hai\n" +
                "Ladki Nhi Par Purse Isthemal Krta Hai\n" +
                "Pujaari Nhi Par Ghanti Bjaata Hai.\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                "Ans: Bus Conductor\n" +
                "\n" ,
                "27. Padhney Mein Likhney Mein\n" +
                "Dono Mein Hi Main Aata Kaam\n" +
                "Pen Nhi Kagaz Nhi\n" +
                "Btaao Kya Hei Mera Naam.\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                "Ans: Chasma\n" +
                "\n" ,
                "28. Hari Thi Man Bhari Thi\n" +
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
                "29. Chhota Sa Siphai\n" +
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
                "30. Do Kisan Ladten Jaaye\n" +
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
                "31. Aisi Kon Si Cheez Hei Jishey\n" +
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
                "\n" ,
                "32. Ek Thaal Motiyon Se Bhara\n" +
                "Sabkey Sir Par Ultaa Dhara\n" +
                "Chaaron Aur Phirey Vo Thaal\n" +
                "Moti Ushsey Ek Naa Girey.\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                "Ans: Tara ( Stars )\n" +
                "\n" ,
                "33. Do Sunder Ladkey\n" +
                "Dono Ek Rang Key\n" +
                "Ek Bichhad Jaaye\n" +
                "Toh Dusraa Kaam Naa Aaye.\n" +
                        "\n"+
                "Ans: Joota ( Shoes )"
        };
// Locate the ViewPager in viewpager_main.xml
        viewPager = (ViewPager) findViewById(R.id.pager);
        // Pass results to ViewPagerAdapter Class
        adapter = new ViewPagerAdapter(KidsPuzzelSolve.this,brainpuz);
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
