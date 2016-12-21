package ru.gburkov;

import java.util.ArrayList;
import java.util.HashMap;


class SearchPhoneNumbers {
    private HashMap<String, ArrayList> map;

    void phoneSearch(String value) {
        init();

        if (map.containsKey(value)) {
            int count = 1;
            for (int i = 0; i < map.get(value).size(); i++) {
                System.out.println(count++ + ". " + map.get(value).get(i));
            }
        } else {
            System.out.println("Name not found.");
        }
    }

    private void init() {
        ArrayList<String> ivanovNumbers = new ArrayList<>();
        ArrayList<String> petrovNumbers = new ArrayList<>();
        ArrayList<String> sidorovNumbers = new ArrayList<>();

        ivanovNumbers.add("+8 800 2000 500");
        ivanovNumbers.add("+8 800 2000 600");
        petrovNumbers.add("+8 800 2000 700");
        sidorovNumbers.add("+8 800 2000 800");
        sidorovNumbers.add("+8 800 2000 900");
        sidorovNumbers.add("+8 800 2000 000");

        map = new HashMap<>();
        map.put("Иванов И.И.", ivanovNumbers);
        map.put("Петров П.П.", petrovNumbers);
        map.put("Сидоров С.С.", sidorovNumbers);
    }
}
