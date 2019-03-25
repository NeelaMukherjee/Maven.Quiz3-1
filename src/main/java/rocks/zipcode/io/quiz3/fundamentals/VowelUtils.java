package rocks.zipcode.io.quiz3.fundamentals;

/**
 * @author leon on 09/12/2018.
 */
public class VowelUtils {
    public static Boolean hasVowels(String word) {
        Boolean bool = false;

        for (int i = 0; i < word.length(); i++) {

            if (word.charAt(i) == 'a' ||
                    word.charAt(i) == 'e' ||
                    word.charAt(i) == 'i' ||
                    word.charAt(i) == 'o' ||
                    word.charAt(i) == 'u') {
                bool = true;
            }
        }
        return bool;
    }

    public static Integer getIndexOfFirstVowel(String word) {
        int a = -1;

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (isVowel(c))
                return word.indexOf(c);
        }
        return a;
    }


    public static Boolean startsWithVowel(String word) {

        return isVowel(word.charAt(0));
    }

    public static Boolean isVowel(Character character) {
        int a = -1;
        Boolean bool = false;

        if ("aeiouAEIOU".indexOf(character) >= 0) {
            bool = true;
        }

        return bool;
    }

    }

