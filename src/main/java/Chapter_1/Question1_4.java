package Chapter_1;

/*Palindrome perumtation: Given a string, write a function to check if It is a permutation
* of a palindrome. A palindrome is a word or phrase that is the same fowards and backwards. A
* permutation is a rearrangement of letters. The palindrome does not need to be limited to just
* dictionary words.
*
* Example
* Input: Tacto Coa
* Output: True (permutations: "taco cat", "atco cta, etc.) */

public class Question1_4 {
    public static boolean isPermutationOfPalindrome(String phrase){
        int[] charCounts = new int[26];
        int oddCount = 0;
        phrase = phrase.toLowerCase();
        for(char c : phrase.toCharArray()){
            if(c >= 'a' && c <= 'z'){
                int idx = c - 'a';
                charCounts[idx]++;
                if(charCounts[idx] % 2 == 1){
                    oddCount++;
                }else {
                   oddCount--;
                }
            }
        }
        return oddCount <=1;
    }

    public static void main(String[] args) {
        String input = "Tact Coa";
        boolean result = isPermutationOfPalindrome(input);
        System.out.println("Is permutation of palindrome: " + result);
    }
}
