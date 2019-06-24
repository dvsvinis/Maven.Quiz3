package rocks.zipcode.io.quiz3.fundamentals;

/**
 * @author leon on 09/12/2018.
 */
public class VowelUtils {

    public static Boolean hasVowels(String word) {
        Boolean hasVowels = false;
        for (int i = 0; i < word.length(); i++) {
            if ((word.charAt(i) == 'a') ||
                    (word.charAt(i) == 'e') ||
                    (word.charAt(i) == 'i') ||
                    (word.charAt(i) == 'o') ||
                    (word.charAt(i) == 'u')) {
                hasVowels = true;
            }
        }
        return hasVowels;
    }


    public static Integer getIndexOfFirstVowel(String word) {
        String vowels = "aeiouAEIOU";
        for (int i = 0; i < word.length(); i++) {
            if (vowels.contains("" + word.charAt(i))) {
                return i;
            }
        }
        return -1;
     }


    public static Boolean startsWithVowel(String word) {
        return "eaiouEAIOU".indexOf(word.charAt(0)) >=0;
    }


    public static Boolean isVowel(Character character) {
        String vowels = "aeiouAEIOU";
        return(vowels.contains(character.toString()));
    }

}
