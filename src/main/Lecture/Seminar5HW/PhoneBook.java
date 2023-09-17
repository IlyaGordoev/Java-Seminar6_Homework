package Seminar5HW;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {
    /*
    Реализуйте структуру телефонной книги с помощью HashMap.
    Программа также должна учитывать, что во входной структуре будут повторяющиеся имена
    с разными телефонами, их необходимо считать, как одного человека с разными телефонами.
    Вывод должен быть отсортирован по убыванию числа телефонов.
    */
    private Map<String, ArrayList<String>> map = new HashMap<>();

    void add(String name, String phoneNum) {

        if (map.containsKey(name)) {
            map.get(name).add(phoneNum);
        } else {
            List<String> arr = new ArrayList<>();
            arr.add(phoneNum);
            map.put(name, (ArrayList<String>) arr);
        }
    }
    String getByName(String name) {
        return name + ":" + map.get(name);
    }

    String getByNum(String phone) {
        StringBuilder stringBuilder = new StringBuilder();
        for (Map.Entry<String, ArrayList<String>> entry : map.entrySet()) {
            for (String value: entry.getValue()) {
                if (value.equals(phone)) {
                    stringBuilder.append(entry.getKey())
                            .append(" : ")
                            .append(entry.getValue())
                            .append("\n");
                }
            }
        }
        return stringBuilder.toString();
    }
    String getAll() {
        return map.toString();
    }

}

