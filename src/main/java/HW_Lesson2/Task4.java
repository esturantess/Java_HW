// 4) К калькулятору из предыдущего ДЗ добавить логирование.

package HW_Lesson2;

import java.util.Scanner;
import java.util.logging.*;

public class Task4 {

    public static void main(String[] args) {

        Logger NEWLOGGER = Logger.getLogger(Task4.class.getName());
        NEWLOGGER.info("Это простой калькулятор.");

        NEWLOGGER.info("Введите операцию: ");
        Scanner scanner = new Scanner(System.in);
        String operation = scanner.next();
        NEWLOGGER.info("Введите первое число: ");
        int number1 = scanner.nextInt();
        NEWLOGGER.info("Введите второе число: ");
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
        NEWLOGGER.info(number1 + " " + operation + " " + number2 + " = " + result);
        scanner.close();
    }
}


