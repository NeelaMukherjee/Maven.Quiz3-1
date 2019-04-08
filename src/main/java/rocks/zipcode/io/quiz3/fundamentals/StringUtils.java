package rocks.zipcode.io.quiz3.fundamentals;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author leon on 09/12/2018.
 */
public class StringUtils {
    public static String capitalizeNthCharacter(String str, Integer indexToCapitalize) {
        String str1 = str.substring(0, indexToCapitalize);
        String str2 = str.substring(indexToCapitalize + 1);
        String str3 = Character.toString(Character.toUpperCase(str.charAt(indexToCapitalize)));

        return str1 + str3 + str2;
    }

    public static Boolean isCharacterAtIndex(String baseString, Character characterToCheckFor, Integer indexOfString) {
        return (baseString.charAt(indexOfString) == characterToCheckFor);
    }

    public static String[] getAllSubStrings(String string) {

        //ArrayList<String> result = new ArrayList<>(); //take  set to get rid of the duplicates

        Set<String> resultSet = new HashSet<String>();

        for (int i = 0; i < string.length(); i++) {
            for (int j = i + 1; j <= string.length(); j++) {
                resultSet.add((string.substring(i, j)));
            }
        }
        return resultSet.toArray(new String[0]);
    }

    public static Integer getNumberOfSubStrings(String input) {
        Integer result = getAllSubStrings(input).length;
        return result+1;
    }

}

