package com.nineinfosys.andriod.paheli.NumberPuzzel;

import android.content.res.Configuration;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.nineinfosys.andriod.paheli.BrainPuzzels.ViewPagerAdapter;
import com.nineinfosys.andriod.paheli.R;

public class NumberPuzzelsSolve extends AppCompatActivity {


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
                        "1. What is the next prime\n " +
                                "number after 7?\n"+
                "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "Ans: 11\n",






                        "2. The perimeter of a circle is \n" +
                                "also known as what?\n" +
                "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                                "Ans: The circumference\n",


                        "3. 65 – 43 = ?\n" +

                "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                                "Ans: 22",

                        "4. True or false? A convex\n" +
                                " shape curves outwards.\n" +

                "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                                "Ans: True\n",

                        "5. What does the square\n" +
                                " root of 144 equal?\n" +
                "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "Ans: 12\n",



                "6. True or false? Pi can\n" +
                                " be correctly written\n " +
                                "as a fraction.\n" +
                "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                                "Ans: False\n",
                        "7. What comes after a million,\n" +
                                " billion and trillion?\n" +
                "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                                "Ans:  A quadrillion\n",

                        "8. 52 divided by 4\n " +
                                "equals what?\n" +
                "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                                "Ans: 13\n",

                        "9. What is the bigger number,\n" +
                                " a googol or a billion?\n" +
                "\n" +
                        "\n" +
                        "\n" +
                        "\n" +

                                "Ans: A googol\n",

                        "10. True or false? Opposite \n" +
                                "angles of a parallelogram\n " +
                                "are equal.\n" +
                "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                                "Ans: True\n",

                        "11. 87 + 56 = ?\n" +
                "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                                "Ans: 143\n",
                        "12. How many sides does\n" +
                                " a nonagon have?\n" +
                "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                                "Ans: 9\n",

                        "13. True or false? \n" +
                                "-2 is an integer.\n" +
                "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                                "Ans: True\n",
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

                        "18. What does 3 squared equal?\n" +
                "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                                "Ans: 9\n",

                        "19. True or false? -4 is\n " +
                                "a natural number.\n" +
                "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                                "Ans: False\n",

                        "20. 5 to the power of 0\n" +
                                " equals what?\n"+
                "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                                "Ans: 1\n"
        };
// Locate the ViewPager in viewpager_main.xml
        viewPager = (ViewPager) findViewById(R.id.pager);
        // Pass results to ViewPagerAdapter Class
        adapter = new ViewPagerAdapter(NumberPuzzelsSolve.this,brainpuz);
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
          //  Toast.makeText(this, "portrait", Toast.LENGTH_SHORT).show();
        }
    }
}
