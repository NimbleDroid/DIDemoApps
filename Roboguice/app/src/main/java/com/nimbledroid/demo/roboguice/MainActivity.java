package com.nimbledroid.demo.roboguice;

import android.os.Bundle;
import android.util.Log;

import com.demo.roboguice.R;
import com.nimbledroid.demo.roboguice.manager.*;
import com.nimbledroid.demo.roboguice.test.*;

import com.google.inject.Inject;

import roboguice.activity.RoboActivity;

public class MainActivity extends RoboActivity {

    @Inject Test1 mTest1;
    @Inject Test2 mTest2;
    @Inject Test3 mTest3;
    @Inject Test4 mTest4;
    @Inject Test5 mTest5;
    @Inject Test6 mTest6;
    @Inject Test7 mTest7;
    @Inject Test8 mTest8;
    @Inject Test9 mTest9;
    @Inject Test10 mTest10;
    @Inject Test11 mTest11;
    @Inject Test12 mTest12;
    @Inject Test13 mTest13;
    @Inject Test14 mTest14;
    @Inject Test15 mTest15;
    @Inject Test16 mTest16;
    @Inject Test17 mTest17;
    @Inject Test18 mTest18;
    @Inject Test19 mTest19;
    @Inject Test20 mTest20;
    @Inject Test21 mTest21;
    @Inject Test22 mTest22;
    @Inject Test23 mTest23;
    @Inject Test24 mTest24;
    @Inject Test25 mTest25;
    @Inject Test26 mTest26;
    @Inject Test27 mTest27;
    @Inject Test28 mTest28;
    @Inject Test29 mTest29;
    @Inject Test30 mTest30;
    @Inject Test31 mTest31;
    @Inject Test32 mTest32;
    @Inject Test33 mTest33;
    @Inject Test34 mTest34;
    @Inject Test35 mTest35;
    @Inject Test36 mTest36;
    @Inject Test37 mTest37;
    @Inject Test38 mTest38;
    @Inject Test39 mTest39;
    @Inject Test40 mTest40;

    @Inject TestManager mTestManager;
    @Inject TestManager2 mTestManager2;
    @Inject TestManager3 mTestManager3;
    @Inject TestManager4 mTestManager4;
    @Inject TestManager5 mTestManager5;
    @Inject TestManager6 mTestManager6;
    @Inject TestManager7 mTestManager7;
    @Inject TestManager8 mTestManager8;
    @Inject TestManager9 mTestManager9;
    @Inject TestManager10 mTestManager10;
    @Inject TestManager11 mTestManager11;
    @Inject TestManager12 mTestManager12;
    @Inject TestManager13 mTestManager13;
    @Inject TestManager14 mTestManager14;
    @Inject TestManager15 mTestManager15;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(MainActivity.class.getSimpleName(), "onCreate(): " + mTest1.toString());
        Log.d(MainActivity.class.getSimpleName(), "onCreate(): " + mTest2.toString());
        Log.d(MainActivity.class.getSimpleName(), "onCreate(): " + mTest3.toString());
        Log.d(MainActivity.class.getSimpleName(), "onCreate(): " + mTest4.toString());
        Log.d(MainActivity.class.getSimpleName(), "onCreate(): " + mTest5.toString());
        Log.d(MainActivity.class.getSimpleName(), "onCreate(): " + mTest6.toString());
        Log.d(MainActivity.class.getSimpleName(), "onCreate(): " + mTest7.toString());
        Log.d(MainActivity.class.getSimpleName(), "onCreate(): " + mTest8.toString());
        Log.d(MainActivity.class.getSimpleName(), "onCreate(): " + mTest9.toString());
        Log.d(MainActivity.class.getSimpleName(), "onCreate(): " + mTest10.toString());
        Log.d(MainActivity.class.getSimpleName(), "onCreate(): " + mTest11.toString());
        Log.d(MainActivity.class.getSimpleName(), "onCreate(): " + mTest12.toString());
        Log.d(MainActivity.class.getSimpleName(), "onCreate(): " + mTest13.toString());
        Log.d(MainActivity.class.getSimpleName(), "onCreate(): " + mTest14.toString());
        Log.d(MainActivity.class.getSimpleName(), "onCreate(): " + mTest15.toString());
        Log.d(MainActivity.class.getSimpleName(), "onCreate(): " + mTest16.toString());
        Log.d(MainActivity.class.getSimpleName(), "onCreate(): " + mTest17.toString());
        Log.d(MainActivity.class.getSimpleName(), "onCreate(): " + mTest18.toString());
        Log.d(MainActivity.class.getSimpleName(), "onCreate(): " + mTest19.toString());
        Log.d(MainActivity.class.getSimpleName(), "onCreate(): " + mTest20.toString());
        Log.d(MainActivity.class.getSimpleName(), "onCreate(): " + mTest21.toString());
        Log.d(MainActivity.class.getSimpleName(), "onCreate(): " + mTest22.toString());
        Log.d(MainActivity.class.getSimpleName(), "onCreate(): " + mTest23.toString());
        Log.d(MainActivity.class.getSimpleName(), "onCreate(): " + mTest24.toString());
        Log.d(MainActivity.class.getSimpleName(), "onCreate(): " + mTest25.toString());
        Log.d(MainActivity.class.getSimpleName(), "onCreate(): " + mTest26.toString());
        Log.d(MainActivity.class.getSimpleName(), "onCreate(): " + mTest27.toString());
        Log.d(MainActivity.class.getSimpleName(), "onCreate(): " + mTest28.toString());
        Log.d(MainActivity.class.getSimpleName(), "onCreate(): " + mTest29.toString());
        Log.d(MainActivity.class.getSimpleName(), "onCreate(): " + mTest30.toString());
        Log.d(MainActivity.class.getSimpleName(), "onCreate(): " + mTest31.toString());
        Log.d(MainActivity.class.getSimpleName(), "onCreate(): " + mTest32.toString());
        Log.d(MainActivity.class.getSimpleName(), "onCreate(): " + mTest33.toString());
        Log.d(MainActivity.class.getSimpleName(), "onCreate(): " + mTest34.toString());
        Log.d(MainActivity.class.getSimpleName(), "onCreate(): " + mTest35.toString());
        Log.d(MainActivity.class.getSimpleName(), "onCreate(): " + mTest36.toString());
        Log.d(MainActivity.class.getSimpleName(), "onCreate(): " + mTest37.toString());
        Log.d(MainActivity.class.getSimpleName(), "onCreate(): " + mTest38.toString());
        Log.d(MainActivity.class.getSimpleName(), "onCreate(): " + mTest39.toString());
        Log.d(MainActivity.class.getSimpleName(), "onCreate(): " + mTest40.toString());

        mTestManager.start();
        mTestManager2.start();
        mTestManager3.start();
        mTestManager4.start();
        mTestManager5.start();
        mTestManager6.start();
        mTestManager7.start();
        mTestManager8.start();
        mTestManager9.start();
        mTestManager10.start();
        mTestManager11.start();
        mTestManager12.start();
        mTestManager13.start();
        mTestManager14.start();
        mTestManager15.start();
    }

}
