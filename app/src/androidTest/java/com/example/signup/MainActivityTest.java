package com.example.signup;

import static org.junit.Assert.*;

import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.action.ViewActions.typeTextIntoFocusedView;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isClickable;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

import android.view.View;

import androidx.annotation.ContentView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.test.espresso.Espresso;
import androidx.test.espresso.EspressoException;
import androidx.test.espresso.ViewAssertion;
import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.filters.LargeTest;
import androidx.test.rule.ActivityTestRule;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import  androidx.test.espresso.Espresso.*;
import androidx.test.espresso.assertion.ViewAssertions.*;
import androidx.test.espresso.matcher.ViewMatchers;

import com.google.android.material.progressindicator.DeterminateDrawable;

public class MainActivityTest {

    @Rule
    public  ActivityTestRule<MainActivity> mainActivityActivityTestRule = new ActivityTestRule<>(MainActivity.class);
    RegisterActivityTest registerActivityTest = new RegisterActivityTest();

    @Before
    public void setUp() throws Exception {
    }


    @Test
    public void check()
    {
        Espresso.onView(withId(R.id.inputEmail)).perform(typeText("peddintimanibabu9876@gmail.com"));
        Espresso.onView(withId(R.id.inputPassword)).perform(typeText("Manibabu@1234"));
        Espresso.onView(withId(R.id.btnLogin)).perform(click());
        if(ViewMatchers.withId(R.id.btnLogin).matches(isClickable())){
            Espresso.pressBackUnconditionally();
        }
        Espresso.onView(withId(R.id.textView6)).perform(click());
        Espresso.onView(withId(R.id.btnGoogle)).perform(click());
        Espresso.onView(withId(R.id.btnFacebook)).perform(click());
        Espresso.onView(withId(R.id.btnPhone)).perform(click());
    }



    @After
    public void tearDown() throws Exception {
    }
}