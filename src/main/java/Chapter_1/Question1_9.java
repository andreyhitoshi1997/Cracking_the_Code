package Chapter_1;

/*Assume you ahve a method isSubstring which checks if one word
 * is a substring of another. Given two string, s1, and s2, write code to check if s2 is a
 * rotation of s1 using only one call to isSubstrin (e.g, "waterbottle" is a rotation of "erbottlewat").*/

public class Question1_9 {

    public static boolean isRotation(String s1, String s2) {
        if (s1 == null || s2 == null || s1.length() != s2.length()) {
            return false;
        }

        String s1s1 = s1 + s1;
        return isSubstring(s1s1, s2);
    }

    private static boolean isSubstring(String big, String small) {
        return big.contains(small);
    }

    public static void main(String[] args) {
        System.out.println(isRotation("waterbottle", "erbottlewat")); // true
        System.out.println(isRotation("abcde", "cdeab")); // true
        System.out.println(isRotation("abcde", "abced")); // false
    }
}