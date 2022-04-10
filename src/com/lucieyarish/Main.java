package com.lucieyarish;

public class Main {

    public static void main(String[] args) {
       printConversion(95.75);
    }

    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            return -1;
        }
        double convertToMiles = 1.5;
        double result = kilometersPerHour / convertToMiles;
        long roundedResult = Math.round(result);
        return roundedResult;
    }

    public static void printConversion(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        } else {
            long calculatedResult = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour + " km/h = " + calculatedResult + " mi/h");
        }
    }
}
