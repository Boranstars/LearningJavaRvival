package com.boranstars.genericity.testwildcards;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<BYD> byds = new ArrayList<>();
        byds.add(new BYD());
        byds.add(new BYD());
        byds.add(new BYD());

        ArrayList<Su7> su7s = new ArrayList<>();
        su7s.add(new Su7());
        su7s.add(new Su7());
        su7s.add(new Su7());

        go(byds);
        go(su7s);
    }

    /**
     *
     * @param cars
     */
    public static void go(ArrayList<? extends Car> cars) {
        // ？为通配符，extends表示上限，也就是必须为Car的子类或者Car
    }
}
