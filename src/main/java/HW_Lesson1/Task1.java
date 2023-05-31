//1) Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

package HW_Lesson1;
import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        System.out.println("Введите n треугольного числа: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int result = number * (number+1)/2;
        System.out.println(number + " по счету треугольное число: " + result);
        scanner.close();
    }

}
