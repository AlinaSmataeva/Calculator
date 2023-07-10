package main.java.org.smataeva.calculator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите операцию, где 1 - сумма, 2 - вычитание, 3 - умножение, 4 - деление:  ");
        int operation = scanner.nextInt();
        double res = 0;

        System.out.println(res);

        System.out.println("Введите первое число: ");
        if(!scanner.hasNextInt()& !scanner.hasNextDouble()){
            System.out.println("Введен недопустимый тип данных");
        }
        double num1 = scanner.nextDouble();
        //double num1 = scanner.nextDouble();


        System.out.println("Введите второе число: ");
        if(!scanner.hasNextInt()& !scanner.hasNextDouble()){
            System.out.println("Введен недопустимый тип данных");
        }
            double num2 = scanner.nextDouble();
        switch (operation) {
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
        }

        System.out.print("Результат: " + res);






    }
}
