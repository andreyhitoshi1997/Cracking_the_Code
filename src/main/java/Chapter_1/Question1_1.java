package Chapter_1;


/*Is Unique: iImplement an algorithm ot determine if a string has all unique character. What if you cannot use addionatl data structures?*/

import java.util.HashSet;
import java.util.Set;

public class Question1_1 {
    public static boolean isUniqueWithHashSet(String str){
        if(str.length() > 128) return false;

        Set<Character> charSet = new HashSet<>();
        for(int i=0; i<str.length(); i++){
            char c = str.charAt(i);
            if (charSet.contains(c)){
                return false;
            }
            charSet.add(c);
        }
        return true;
    }

    public static void main(String[] args) {
        // Strings para testar
        String[] testStrings = {
                "abcde",           // true - todos únicos
                "hello",           // false - 'l' repetido
                "programming",     // false - 'm' e 'r' repetidos
                "world",           // true - todos únicos
                "",                // true - string vazia
                "a",               // true - um caractere
                "aab",             // false - 'a' repetido
                "Python",          // true - todos únicos
                "Java"             // true - todos únicos
        };

        System.out.println("Testando strings com isUniqueWithHashSet:");
        System.out.println("=" .repeat(50));

        for (String str : testStrings) {
            boolean result = isUniqueWithHashSet(str);
            System.out.printf("'%s' -> %s%n", str, result);
        }
    }
}
