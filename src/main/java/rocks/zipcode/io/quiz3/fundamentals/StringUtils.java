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
        return null;
    }

    public static String[] getAllSubStrings(String string) {
        return null;
    }

    public static Integer getNumberOfSubStrings(String input){
        return null;
    }
}
