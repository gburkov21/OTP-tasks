package ru.gburkov;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SearchPhoneNumbersTest {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        SearchPhoneNumbers searchPhoneNumbers = new SearchPhoneNumbers();
        while (true) {
            System.out.println("Please enter a name or enter 'exit' for close: ");
            String input = reader.readLine();
            if (input.equalsIgnoreCase("exit")){
                break;
            }
            searchPhoneNumbers.phoneSearch(input);
        }
    }
}
