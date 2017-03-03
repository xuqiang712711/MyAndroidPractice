package com.android.mypractice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.android.miiadnroidframework.mutils.MiiLogUtils;

import enum_practice.EnumPractice;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MiiLogUtils.init(this, true, false, "Practice");
        new EnumPractice().printColor(EnumPractice.ColorEnum.Black);
    }
}
