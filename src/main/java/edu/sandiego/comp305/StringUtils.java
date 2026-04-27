package edu.sandiego.comp305;

public class StringUtils {

    private StringUtils() {
    }

    public static String reverseString(final String str) {

        return new StringBuilder(str).reverse().toString();
    }
}
