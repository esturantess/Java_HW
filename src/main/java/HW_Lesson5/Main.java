package HW_Lesson5;

public class Main {

    static Phonebook newPhonebook = new Phonebook();

    public static void main(String[] args) throws Exception {
        newPhonebook.fillThePhonebook();
        newPhonebook.phonebookSorting();
    }
}
