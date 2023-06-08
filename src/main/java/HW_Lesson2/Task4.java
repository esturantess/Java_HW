// 4) К калькулятору из предыдущего ДЗ добавить логирование.

package HW_Lesson2;

import java.util.Scanner;
import java.util.logging.*;

public class Task4 {

    public static void main(String[] args) {

        Logger NEWLOGGER = Logger.getLogger(Task4.class.getName());
        NEWLOGGER.log(Level.INFO, "Это простой калькулятор.");

        System.out.println("Введите операцию: ");
        Scanner scanner = new Scanner(System.in);
        String operation = scanner.next();
        System.out.println("Введите первое число: ");
        int number1 = scanner.nextInt();
        System.out.println("Введите второе число: ");
        int number2 = scanner.nextInt();
        if (number2 == 0) throw new ArithmeticException("Ошибка: Попытка деления на 0!");
        int result = 0;
        switch (operation) {
            case "+":
                result = number1 + number2;
                break;
            case "-":
                result = number1 - number2;
                break;
            case "*":
                result = number1 * number2;
                break;
            case "/":
                result = number1 / number2;
                break;
            case "%":
                result = number1 % number2;
                break;
            default:
                System.out.println("Ошибка: неверная операция");
                break;
        }
        System.out.println(number1 + " " + operation + " " + number2 + " = " + result);
        scanner.close();
    }
}


