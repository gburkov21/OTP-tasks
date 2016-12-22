package ru.gburkov;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;


class SearchPhoneNumbers {
    private final HashMap<String, ArrayList> map = new HashMap<>();

    SearchPhoneNumbers() {
        ArrayList<String> ivanovNumbers = new ArrayList<>(Arrays.asList("+8 800 2000 500", "+8 800 2000 600"));
        ArrayList<String> petrovNumbers = new ArrayList<>(Arrays.asList("+8 800 2000 700"));
        ArrayList<String> sidorovNumbers = new ArrayList<>(Arrays.asList("+8 800 2000 800", "+8 800 2000 900", "+8 800 2000 000"));

        map.put("Иванов И.И.", ivanovNumbers);
        map.put("Петров П.П.", petrovNumbers);
        map.put("Сидоров С.С.", sidorovNumbers);
    }

    void phoneSearch(String value) {
        if (map.containsKey(value)) {
            int count = 1;
            for (int i = 0; i < map.get(value).size(); i++) {
                System.out.println(count++ + ". " + map.get(value).get(i));
            }
        } else {
            System.out.println("Name not found.");
        }
    }


}
