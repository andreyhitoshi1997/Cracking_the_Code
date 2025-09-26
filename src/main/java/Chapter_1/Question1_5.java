package Chapter_1;

/*One Away: There area three types of edits that can be performed on strings: insert a character,
* remove a character, or replace a character. Given two strings, write a funntion to check if
* they area one edit (or zero edits) away.
*
* Example:
* pale, ple -> true
* pales, pale -> true
* pale, bale -> true
* pale, bake -> false*/

public class Question1_5 {

    public static boolean isOneEditAway(String first,String second) {
        if (Math.abs(first.length() - second.length()) > 1) return false;

        String s1 = first.length() < second.length() ? first : second;
        String s2 = first.length() < second.length() ? second : first;

        int index1 = 0, index2 = 0;
        boolean foundDifference = false;
        while (index1 < s1.length() && index2 < s2.length()) {
            if(s1.charAt(index1) == s2.charAt(index2)) {
            if (foundDifference) return false;
            foundDifference = true;
            if (s1.length() == s2.length()) index1++;
        } else{
            index1++;
        }
        index2++;
    }
    return true;
    }


    public static void main(String[] args) {
        System.out.println(isOneEditAway("pale", "ple"));   // true
        System.out.println(isOneEditAway("pales", "pale")); // true
        System.out.println(isOneEditAway("pale", "bale"));  // true
        System.out.println(isOneEditAway("pale", "bake"));  // false
    }
}
