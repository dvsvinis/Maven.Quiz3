package rocks.zipcode.io.quiz3.fundamentals;

import com.sun.xml.internal.fastinfoset.util.CharArray;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 09/12/2018.
 */
public class StringUtils {

    public static String capitalizeNthCharacter(String str, Integer indexToCapitalize) {

        String result = str.substring(0,indexToCapitalize) + str.substring(indexToCapitalize,indexToCapitalize+1).toUpperCase()
                + str.substring(indexToCapitalize+1);
        return result;
    }


    public static Boolean isCharacterAtIndex(String baseString, Character characterToCheckFor, Integer indexOfString) {

         return  baseString.charAt(indexOfString) == characterToCheckFor;
    }

    public static String[] getAllSubStrings(String string) {
        List<String> result = new ArrayList<>();
        for (int i = 0; i < string.length(); i++) {
            for (int j = i + 1; j <= string.length(); j++) {
                // Get each substring
                result.add(string.substring(i, j));
            }
        }
        String[] allSubStrings = result.toArray(new String[0]);
        return allSubStrings;
    }


    public static Integer getNumberOfSubStrings(String input){
        return getAllSubStrings(input).length-1;
    }
}
