//1) Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

package HW_Lesson1;
import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        System.out.print("Введите n треугольного числа: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        // Вычисление треугольного числа
        int result = number * (number+1)/2;
        System.out.println(number + " по счету треугольное число: " + result);
        System.out.println();
        // Вычисление факториала
        System.out.print("Введите число для вычисления факториала: ");
        number = scanner.nextInt();
        int factorial = 1;
        for (int i = 1; i <= number ; i++) {
            factorial *= i;
        }
        System.out.println("Факториал числа " + number + " = " + factorial);
        scanner.close();
    }

}
