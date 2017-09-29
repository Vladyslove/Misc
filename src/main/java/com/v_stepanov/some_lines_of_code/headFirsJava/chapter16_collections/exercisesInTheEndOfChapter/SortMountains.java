package com.v_stepanov.some_lines_of_code.headFirsJava.chapter16_collections.exercisesInTheEndOfChapter;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class SortMountains {

    LinkedList<Mountain> mtn = new LinkedList<>();

    class NameCompare implements Comparator<Mountain> {

        @Override
        public int compare(Mountain o1, Mountain o2) {
            return o1.name.compareTo(o2.name);
        }
    }

    class HeightCompare implements Comparator<Mountain> {

        @Override
        public int compare(Mountain o1, Mountain o2) {
            return o2.height - o1.height;
        }
    }

    public static void main(String[] args) {
        new SortMountains().go();
    }

    private void go() {
        mtn.add(new Mountain("zbbra", 12342));
        mtn.add(new Mountain("kabbra", 142));
        mtn.add(new Mountain("shmabbra", 1342));
        mtn.add(new Mountain("mabbra", 112342));

        System.out.println("as entered: \n " + mtn);
        NameCompare nc = new NameCompare();
        Collections.sort(mtn,nc);

        System.out.println("by name: \n " + mtn);
        HeightCompare hc = new HeightCompare();
        Collections.sort(mtn, hc);
        System.out.println("by height: \n " + mtn);
    }
}

class Mountain {
    String name;

    @Override
    public String toString() {
        return "Mountain{" +
                "name='" + name + '\'' +
                ", height=" + height +
                '}';
    }

    public Mountain(String name, int height) {
        this.name = name;
        this.height = height;
    }

    int height;
}
