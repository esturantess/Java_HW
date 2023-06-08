package HW_Lesson3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Collections;

public class Working_with_the_list {

    static List<Integer> numbers = new ArrayList<>();

    public static void main(String[] args) {
        List<Integer> numbers = fillTheList();
        List<Integer> temp = new ArrayList<>(numbers);
        // Задание 1: Удалить четные числа из списка
        removeEvenNumbers(temp);
        // Задание 2: Найти минимальное значение в списке
        System.out.println("Минимальное значение в списке: " + Collections.min(numbers));
        // Задание 3: Найти максимальное значение в списке
        System.out.println("Максимальное значение в списке: " + Collections.max(numbers));
        // Задание 4: Найти среднее значение в списке
        arithmeticMean(numbers);
    }

    public static List<Integer> fillTheList() {
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            numbers.add(random.nextInt(21));
        }
        System.out.println("Исходный список: " + numbers);
        return numbers;
    }

    public static void removeEvenNumbers(List<Integer> userList) {
        for (int i = 0; i < userList.size(); i++) {
            if (userList.get(i) % 2 == 0) {
                userList.remove(userList.get(i));
                i -= 1;
            }
        }
        System.out.println("Список без четных чисел: " + userList);
    }

    public static void arithmeticMean(List<Integer> userList){
        try {
            int sum = 0;
            for (Integer integer : userList) {
                sum += integer;
            }
            int arithmetic_mean = sum / userList.size();
            System.out.println("Среднее значение: " + arithmetic_mean);
        }
        catch (Exception DivisionByZero){
            System.out.println("Среднего значения нет, так как список пуст.");
        }
    }
}
