package io.zipcoder.microlabs.mastering_loops;

public class TriangleUtilities {

    public static String getTriangle(int numberOfRows) {
        String x = "";
        for (int i = 1; i <= numberOfRows - 1; i++) {
            for (int j = 1; j <= i; j++) {
                x += "*";
                }
            x += "\n";
            }
        return x;
    }
        public static String getRow(int width){
        String x = "";
        for (int i = 0; i < width; i++) {
                x += "*";
            }
            return x;
        }

        public static String getSmallTriangle () {
            String x = "";
            for (int i = 1; i <= 4; i++) {
                for (int j = 1; j <= i; j++) {
                    x += "*";
                }
                x += "\n";
            }
            return x;
        }

        public static String getLargeTriangle () {
            String x = "";
            for (int i = 1; i <= 9; i++) {
                for (int j = 1; j <= i; j++) {
                    x += "*";
                }
                x += "\n";
            }
            return x;
        }
}
