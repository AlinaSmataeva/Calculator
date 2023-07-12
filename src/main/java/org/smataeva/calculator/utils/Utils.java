package main.java.org.smataeva.calculator.utils;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Utils {

    static Scanner scanner = new Scanner(System.in);

    public static boolean processInputOperation(String operation) {
        String regex = "^[1-4]$";
        if (Pattern.matches(regex, operation)) {
            return true;
        }
        return false;
    }

    public static double processInput() throws NumberFormatException {
        return scanner.nextDouble();
    }

    public static boolean isDivByZero (double num2, String operation){
        return num2 == 0 && operation.equals("4");
    }
}
