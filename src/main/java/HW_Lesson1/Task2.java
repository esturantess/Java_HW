//2) Вывести все простые числа от 1 до 1000

package HW_Lesson1;

import java.util.ArrayList;

public class Task2 {
    public static void main(String[] args) {

        ArrayList<Integer> primeNumbers = new ArrayList<Integer>();

        for (int i = 1; i <= 1000; i++) {
            if (i == 2 || i == 3 || i == 5 || i == 7) primeNumbers.add(i);
            else {
                int size = primeNumbers.size();
                int count = 0;
                for (int j = 0; j < size; j++) {
                    if ((i % 2 != 0) && (i % 3 != 0) && (i % 5 != 0) && (i % 7 != 0) && (i % primeNumbers.get(j) != 0)) {
                        count += 1;
                    }
                    if (count == size) primeNumbers.add(i);
                }
            }

        }
        System.out.println("Все простые числа от 1 до 1000: " + primeNumbers);
        System.out.println("Количество чисел (для проверки): " + primeNumbers.size());
    }
}

