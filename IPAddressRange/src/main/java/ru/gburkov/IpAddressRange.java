package ru.gburkov;

class IpAddressRange {
    private static final long N0 = 256 * 256 * 256;
    private static final long N1 = 256 * 256;
    private static final long N2 = 256;

    long ipToLong(String ip) {
        String[] ipStr = ip.split("\\.");
        return (Long.valueOf(ipStr[0]) * N0 + (Long.valueOf(ipStr[1]) * N1) + (Long.valueOf(ipStr[2]) * N2) + (Long.valueOf(ipStr[3])));
    }

    String longToIp(long value) {
        return ((value >> 24) & 255) + "." + ((value >> 16) & 255) + "." + ((value >> 8) & 255) + "." + (value & 255);
    }
}
