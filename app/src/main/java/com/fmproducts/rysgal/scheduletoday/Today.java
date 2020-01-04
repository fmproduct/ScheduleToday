package com.fmproducts.rysgal.scheduletoday;

import java.util.ArrayList;

public class Today {
    private ArrayList<Lesson> lessons;

    public Today(ArrayList<Lesson> lessons) {
        this.lessons = lessons;
    }

    public Today() {

    }

    public ArrayList<Lesson> getLessons() {
        return lessons;
    }

    public void setLessons(ArrayList<Lesson> lessons) {
        this.lessons = lessons;
    }
}