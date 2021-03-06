package com.ma.traveldroid.free;

import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import com.ma.traveldroid.R;
import com.ma.traveldroid.ui.main.MainActivity;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
public class MainActivityTest {

    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule =
            new ActivityTestRule<>(MainActivity.class);


    @Test
    public void clickRecyclerViewItem_opensDetailActivity(){
        onView(ViewMatchers.withId(R.id.fab))
                .perform(click());

        onView(withId(R.id.country_name_label))
                .check(matches(withText("Country name")));
    }
}
