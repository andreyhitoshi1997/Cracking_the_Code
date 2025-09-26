package Chapter_1;

/*Check permutation: given two strings, write a method to decide if one is a permutation fo the other*/

import java.util.Arrays;

public class Question1_2 {
    public static boolean isPermutation(String s1, String s2) {
        if(s1.length() != s2.length()) return false;
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
    }

    public static void main(String[] args) {
        String a = "listen";
        String b = "Silent";
        boolean result = isPermutation(a,b);
        System.out.println("\"" + a + "\" and \"" + b + "\" are permutations? " + result);
    }
}
