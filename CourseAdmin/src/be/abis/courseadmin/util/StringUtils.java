package be.abis.courseadmin.util;

public class StringUtils {
    public StringUtils() {
    }

    public static String capitalize(String s) {
        return s.substring(0, 1).toUpperCase() + s.substring(1);

    }
}
