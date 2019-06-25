package rocks.zipcode.io.quiz3.generics;

import java.util.Arrays;
import java.util.function.Function;

/**
 * @author leon on 09/12/2018.
 */
public class ArrayUtility<SomeType> {
    private final SomeType[] array;

    public ArrayUtility(SomeType[] array) {
        this.array = array;
    }

    public SomeType findOddOccurringValue() {

        for (SomeType t : array){
            if (getNumberOfOccurrences(t) % 2 != 0)
                return t;
        }
        return null;
    }

    public SomeType findEvenOccurringValue() {
        for(SomeType t : array){
            if(getNumberOfOccurrences(t) % 2 == 0){
                return t;
            }
        }
        return null;
    }

    public Integer getNumberOfOccurrences(SomeType valueToEvaluate) {
        Integer count = 0;
        if (valueToEvaluate == null) {
            for ( SomeType listItem : array )
                if (listItem == null)
                    count++;
        }
        else {
            for ( SomeType listItem : array )
                if (valueToEvaluate.equals(listItem))
                    count++;
        }
        return count;
    }


    public SomeType[] filter(Function<SomeType, Boolean> predicate) {

        return null;
    }
}
