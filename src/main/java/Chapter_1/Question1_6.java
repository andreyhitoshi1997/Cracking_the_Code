package Chapter_1;

/*Implement a method to perform basic strin cmopression using the counts of repeated character. For example,
* the string aabcccccaaa would become a2b1c5a3. If the "compressed" string would not become smaller than the original string, your method
should return the original string. You can assume the string has only uppercase and lower case letters (a-z)*/

public class Question1_6 {
    public static String compressString(String str) {
        if(str == null || str.length() <=2) {
            return  str;
        }

        StringBuilder compressed  = new StringBuilder();
        int count = 1;
        for(int i = 1; i < str.length(); i++) {
            if(str.charAt(i) == str.charAt(i-1)){
                count ++;
            }else {
                compressed.append(str.charAt(i-1)).append(count);
                count = 1;
            }
        }
        compressed.append(str.charAt(str.length()-1)).append(count);
        return compressed.length() < str.length() ? compressed.toString() : "";
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println("Original: aabcccccaaa -> Compressed: " + compressString("aabcccccaaa"));
        System.out.println("Original: abc -> Compressed: " + compressString("abc"));
        System.out.println("Original: aabbcc -> Compressed: " + compressString("aabbcc"));
        System.out.println("Original: aaaa -> Compressed: " + compressString("aaaa"));
        System.out.println("Original: null -> Compressed: " + compressString(null));
        System.out.println("Original: '' -> Compressed: " + compressString(""));
    }
}
