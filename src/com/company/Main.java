package com.company;

public class Main {

    public static void main(String[] args) {
        // Think Java - Exercise 2.3
        int hour = 14;
        int minute = 55;
        int second = 35;
        double secondDeci = 35;
        int aFullDay = 24;
        double dayPercentage = 24;

        System.out.print("The current time is: ");
        System.out.print(hour);
        System.out.print(":");
        System.out.print(minute);
        System.out.print(":");
        System.out.println(second);

        String ascii =
                ".'`~~~~~~~~~~~`'.\n" +
                "(  .'11 12 1'.  )\n" +
                "|  :10 \\    2:  |\n" +
                "|  :9   @-> 3:  |\n" +
                "|  :8       4;  |\n" +
                "'. '..7 6 5..' .'\n" +
                " ~-------------~ ";

        System.out.println(ascii);

        System.out.printf("Number of minutes since midnight: %.2f \n", (hour * 60) + minute + (secondDeci / 60));

        System.out.print("Number of seconds since midnight: ");
        System.out.println((hour * 3600) + (minute * 60) + second);

        System.out.print("Number of seconds remaining of the day: ");
        System.out.println((aFullDay * 3600) - ((hour * 3600) + (minute * 60) + second));

        System.out.printf("Percentage of the day that has passed: %.4f%%", ((hour * 3600) + (minute * 60) + second) / (dayPercentage * 3600) * 100);

    }
}
