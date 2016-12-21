package ru.gburkov;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IpAddressRangeTest {
    public static void main(String[] args) throws IOException {
        IpAddressRange ipAddressRange = new IpAddressRange();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Please enter the first address: ");
        long startIp = ipAddressRange.ipToLong(reader.readLine());
        System.out.println("Please enter the second address: ");
        long endIp = ipAddressRange.ipToLong(reader.readLine());
        System.out.println("Your address range: ");

        for (long i = startIp + 1; i < endIp; i++) {
            System.out.println(ipAddressRange.longToIp(i));
        }
    }
}
