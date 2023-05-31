//3) Реализовать простой калькулятор

package HW_Lesson1;
import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        System.out.println("Введите операцию: ");
        Scanner scanner = new Scanner(System.in);
        String operation = scanner.next();
        System.out.println("Введите первое число: ");
        int number1 = scanner.nextInt();
        System.out.println("Введите второе число: ");
        int number2 = scanner.nextInt();
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
        System.out.println(number1 + " " + operation + " " + number2 + " = "+ result);
        scanner.close();
    }
}
