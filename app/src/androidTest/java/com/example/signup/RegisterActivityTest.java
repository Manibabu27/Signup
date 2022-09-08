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

public class RegisterActivityTest {
    @Rule
    public ActivityTestRule<RegisterActivity> registerActivityActivityTestRule= new ActivityTestRule<>(RegisterActivity.class);

    @Test
    public void checkallRegister(){
        Espresso.onView(withId(R.id.inputEmail)).perform(typeText("okok@gmail.com"));
        Espresso.onView(withId(R.id.inputPassword)).perform(typeText("charry"));
        Espresso.onView(withId(R.id.inputPassword2)).perform(typeText("charry"));
        if(ViewMatchers.withId(R.id.inputPassword2).matches(withId(R.id.inputPassword))){
            Espresso.pressBackUnconditionally();
        }
    }

}