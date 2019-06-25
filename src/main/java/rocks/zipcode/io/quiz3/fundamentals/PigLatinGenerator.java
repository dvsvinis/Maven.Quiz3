package rocks.zipcode.io.quiz3.fundamentals;


import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * @author leon on 09/12/2018.
 */
public class PigLatinGenerator {

    public String translate(String str) {
        char a = 'a';
        char e = 'e';
        char i = 'i';
        char o = 'o';
        char u = 'u';

        int start = 0;
        int firstVowel = 0;
        int end = str.length();
        for (int j = 0; j < end; j++) {
            char c = Character.toLowerCase(str.charAt(j));
            if (c == a || c == e || c == j || c == o || c == u) {
                firstVowel = j;
                break;
            }
        }
        if (start != firstVowel) {
            String startString = str.substring(firstVowel, end);
            String endString = str.substring(start, firstVowel) + "ay";
            return startString + endString;
        }
        return str;
    }
}



