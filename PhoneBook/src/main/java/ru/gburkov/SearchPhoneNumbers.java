package ru.gburkov;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;


class SearchPhoneNumbers {
    private final HashMap<String, ArrayList<String>> map = new HashMap<>();

    SearchPhoneNumbers() {
        map.put("Иванов И.И.", new ArrayList<>(Arrays.asList("+8 800 2000 500", "+8 800 2000 600")));
        map.put("Петров П.П.", new ArrayList<>(Arrays.asList("+8 800 2000 700")));
        map.put("Сидоров С.С.", new ArrayList<>(Arrays.asList("+8 800 2000 800", "+8 800 2000 900", "+8 800 2000 000")));
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
