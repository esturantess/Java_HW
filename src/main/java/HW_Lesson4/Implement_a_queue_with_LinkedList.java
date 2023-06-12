package HW_Lesson4;

import java.util.LinkedList;

//���������� ������� � ������� LinkedList �� ���������� ��������:
//        enqueue() - �������� ������� � ����� �������,
//        dequeue() - ���������� ������ ������� �� ������� � ������� ���,
//        first() - ���������� ������ ������� �� �������, �� ������.
//        ������ �����: ������ �� ���
public class Implement_a_queue_with_LinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> new_queue = new LinkedList<>();
        enqueue(new_queue, 5);
        enqueue(new_queue, 10);
        enqueue(new_queue, 30);
        System.out.println(new_queue);
        System.out.println(dequeue(new_queue));
        System.out.println(new_queue);
        System.out.println(dequeue(new_queue));
        System.out.println(new_queue);
        System.out.println(first(new_queue));
    }

    public static void enqueue(LinkedList<Integer> queue, int element) {
        queue.add(element);
    }

    public static int dequeue(LinkedList<Integer> queue) throws ArithmeticException {
        if (queue.size() == 0) throw new ArithmeticException("������: ������� �����!");
        else {
            int temp = queue.get(0);
            queue.remove(queue.get(0));
            return temp;
        }
    }

    public static int first(LinkedList<Integer> queue) {
        if (queue.size() == 0) throw new ArithmeticException("������: ������� �����!");
        else return queue.get(0);
    }

}
