// 1) Дана строка sql-запроса "select * from students where ". Сформируйте часть WHERE этого запроса,
// используя StringBuilder. Данные для фильтрации приведены ниже в виде json-строки.
// Если значение null, то параметр не должен попадать в запрос.
// Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}

package HW_Lesson2;

public class Task1 {
    public static void main(String[] args) {
        requestForming();
    }

    public static String[] splitJson() {
        String source_data = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"null\", \"city\":\"Moscow\", \"age\":\"null\"}";
        String string1 = source_data.replace("{", "").replace("}", "");
        return string1.split(",");
        }
    public static void requestForming() {
        StringBuilder str = new StringBuilder("select * from students where ");
        String[] newString = splitJson();
        for (int i = 0; i < newString.length; i++) {
            String[] request = newString[i].split(":");
            if (!request[1].equals("\"null\"")) {
                if (i > 0) str.append(" and");
                str.append(request[0].replace("\"", ""));
                str.append(" = ");
                str.append(request[1]);
            }
        }
        System.out.println(str);
    }
}