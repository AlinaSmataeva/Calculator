package main.java.org.smataeva.calculator;

import main.java.org.smataeva.calculator.utils.Calculator;
import main.java.org.smataeva.calculator.utils.Utils;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите операцию, где 1 - сумма, 2 - вычитание, 3 - умножение, 4 - деление:  ");
        String operation = scanner.next();
        Utils.processInputOperation(operation);
            if(!Utils.processInputOperation(operation)){
                System.out.println("Операция должна быть числом от 1 до 4");
                return;
           }
        double res = 0;
        double num1 = 0;
        double num2 = 0;

        System.out.println("Введите первое число: ");
        try {
            num1 = Utils.processInput();
        } catch (Exception e) {
            System.out.println("Вы ввели некорретктное число.");
            return;
        }

        System.out.println("Введите второе число: ");
        try {
            num2 = Utils.processInput();
        } catch (Exception e) {
            System.out.println("Вы ввели некорретктное число.");
            return;
        }

        switch (Integer.parseInt(operation)) {
            case 1:
                res = calculator.sum(num1, num2);
                break;
            case 2:
                res = calculator.subtract(num1, num2);
                break;
            case 3:
                res = calculator.multiply(num1, num2);
                break;
            case 4:
                res = calculator.div(num1, num2);
                break;
            default:
                System.out.println("Неверно введена операция");
                return;
        }

        System.out.print("Результат: " + res);
    }
}
