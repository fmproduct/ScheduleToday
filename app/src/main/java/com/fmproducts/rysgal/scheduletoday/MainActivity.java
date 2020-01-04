package com.fmproducts.rysgal.scheduletoday;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private static ArrayList<Lesson> getStaticData(){
        ArrayList<Lesson> result = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            result.add(new Lesson("Lesson " + i));
        }

        return result;
    }
}
