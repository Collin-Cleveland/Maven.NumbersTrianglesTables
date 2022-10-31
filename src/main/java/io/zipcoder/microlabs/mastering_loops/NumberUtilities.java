package io.zipcoder.microlabs.mastering_loops;


public class NumberUtilities {
    public static String getEvenNumbers(int start, int stop) {
        String str = "";
        for (int i = start; i < stop; i++) {
            if ( i % 2 != 0) {
                str = str + Integer.toString(i);
                }
        }
        return str;
    }

    public static String getOddNumbers(int start, int stop) {
        String str = "";
        for (int i = start; i < stop; i++) {
            if ( i % 2 == 0) {
                str = str + Integer.toString(i);
            }
        }
        return str;
    }


    public static String getSquareNumbers(int start, int stop, int step) {
        int i = 0;
        String sqr = "";
        for (i = start; i < stop; i += step) {
            int x = i * i;
            sqr = sqr + x;
        }
        return sqr;
    }

    public static String getRange(int stop) {
        String str = "";
        for (int i = 0; i < stop; i++){
            str = str + i;
        }
        return str;
    }

    public static String getRange(int start, int stop) {
        return null;
    }


    public static String getRange(int start, int stop, int step) {
        return null;
    }


    public static String getExponentiations(int start, int stop, int step, int exponent) {
        int i = 0;
        String exp = "";
        for (i = start; i < stop; i += step) {
            int x = (int) Math.pow(i, exponent);
            exp = exp + x;
        }
        return exp;
    }

}
