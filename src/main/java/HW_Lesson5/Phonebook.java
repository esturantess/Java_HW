package HW_Lesson5;

import java.util.*;
import java.util.logging.Logger;

public class Phonebook {
    Map<String, ArrayList<String>> phonebook = new HashMap<>();
    Scanner scanner = new Scanner(System.in);
    Logger logger = Logger.getLogger(Phonebook.class.getName());
    String name = "";
    String nextPhoneNumber = "";
    int checker = 0;

    public Map<String, ArrayList<String>> fillThePhonebook() {
        while (checker == 0) {
            ArrayList<String> phoneNumber = new ArrayList<>();
            logger.info("When you're done entering the data, type done");
            logger.info("Enter the person's name:");
            name = scanner.next();
            if (phonebook.containsKey(name)){
                phoneNumber.add(phonebook.get(name).toString().replace("[", "").replace("]", ""));
            }
            if ((name).equalsIgnoreCase("done")) {
                checker = 1;
            } else {
                logger.info("Enter the person's phone number:");
                nextPhoneNumber = scanner.next();
                if ((nextPhoneNumber).equalsIgnoreCase("done")) {
                    checker = 1;
                    logger.info("You haven't entered a phone number, so the last entry won't be added.");
                } else {
                    phoneNumber.add(nextPhoneNumber);
                    phonebook.put(name, phoneNumber);
                }
            }
        }
        System.out.println(phonebook);
        return phonebook;
    }

    private void phonebookSorting(Map<String,ArrayList<String>>) {

    }
}