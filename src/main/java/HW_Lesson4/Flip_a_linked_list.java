package HW_Lesson4;

import java.util.LinkedList;

//Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
public class Flip_a_linked_list {

    public static void main(String[] args) {
        System.out.println("Исходный список: " + createNewLinkedList());
        flipTheList(createNewLinkedList());
    }
    public static LinkedList<String> createNewLinkedList() {
        LinkedList<String> myList = new LinkedList<>();
        myList.add("First smth");
        myList.add("Second smth");
        myList.add("Third smth");
        return myList;
    }

    public static void flipTheList(LinkedList<String> userList) {
        int size = userList.size();
        LinkedList<String> invertedList = new LinkedList<>();
        for (int i = size - 1; i >= 0; i--) {
            invertedList.add(userList.get(i));
        }
        System.out.println("Перевернутый список: " + invertedList);
    }
}
