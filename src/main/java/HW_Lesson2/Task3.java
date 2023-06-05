//3) Дана json-строка (можно сохранить в файл и читать из файла)
//        [{"фамилия":"Иванов","оценка":"5","предмет":"Математика"},{"фамилия":"Петрова","оценка":"4","предмет":"Информатика"},
//        {"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]
//        Написать метод(ы), который распарсит json и, используя StringBuilder, создаст строки вида:
//        Студент [фамилия] получил [оценка] по предмету [предмет].
//        Пример вывода:
//        Студент Иванов получил 5 по предмету Математика.
//        Студент Петрова получил 4 по предмету Информатика.
//        Студент Краснов получил 5 по предмету Физика.

package HW_Lesson2;

public class Task3 {

    public static void main(String[] args) {
        splitJson();
    }

    public static void splitJson() {
        String jsonString = "[{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"},{\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"},{\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}]";
        int studentsNumber = jsonString.replace("[", "").replace("]", "").split("}").length;
        String[] string1 = jsonString.replace("[", "").replace("]", "").replace("\"", "").replace("{", "").split("},");
        String[] studentInfo = string1[0].split(",");
        int studentInfoLength = studentInfo.length;
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < studentsNumber; i++) {
            for (int j = 0; j < studentInfoLength; j++) {
                String newString = (string1[i].split(","))[j].split(":")[1].replace("}", "");
                if (j == 0) {
                    str.setLength(0);
                    str.append("Студент ");
                }
                if (j == 1)
                    str.append(" получил ");
                if (j == 2)
                    str.append(" по предмету ");
                str.append(newString);
            }
            System.out.println(str + ".");
        }
    }
}
