package com.igorwojda.codingpuzzle;

import java.util.ArrayList;
import java.util.List;

public class JavaImp {

    public static int addUpTo(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum = sum + i;
        }
        return sum;
    }

    public static List<Integer> countUpAndDown(int n) {
        List<Integer> in = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            in.add(i, i);
        }
        for (int j = n; j >= 0; j--) {
            in.add(j);
        }

        return in;
    }


    public static String formatTrainRoute(List<String> some) {
        String a = null;
        if (some.isEmpty()) {
            a = "Error";
            return a;
        } else if (some.size() == 1) {
            a = "Train is calling at " + some.get(0);
            return a;
        } else if (some.size() == 2) {
            a = "Train is calling at " + some.get(0) + " and " + some.get(1);
            return a;
        } else {
            a = "Train is calling at ";
//            for (int i = 0; i < some.size() - 1; i++) {
//                a = a.concat( some.get(i) + ", ");
//            }
//            a = a.substring(0, a.length() - 2) + " and " + some.get(some.size() - 1);

            ////
            for (int i = 0; i < some.size(); i++) {
                if (i == 0) {
                    a = a.concat( some.get(i));
                }
                else if (i != some.size() - 1) {
                    a = a.concat(", " + some.get(i));
                } else {
                    // this is the last one
                    a = a + " and " + some.get(i);
                }
            }
            ////
        }
        return a;
    }

}
