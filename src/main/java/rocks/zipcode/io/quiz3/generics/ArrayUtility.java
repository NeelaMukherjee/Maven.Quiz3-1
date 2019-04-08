package rocks.zipcode.io.quiz3.generics;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author leon on 09/12/2018.
 */
public class ArrayUtility<SomeType> {
    private final SomeType[] array;

    public ArrayUtility(SomeType[] array) {
        this.array = array;
    }

    public SomeType findOddOccurringValue() {
        SomeType value = null;

        for (int i = 0; i < array.length; i++)

            if (getNumberOfOccurrences(array[i]) % 2 != 0) {

                value = array[i];
            }
        return value;
    }

    public SomeType findEvenOccurringValue() {
        SomeType value = null;

        for (int i = 0; i < array.length; i++)

            if (getNumberOfOccurrences(array[i]) % 2 == 0) {

                value = array[i];
            }
        return value;
    }

    public Integer getNumberOfOccurrences(SomeType valueToEvaluate) {

        Integer maxOccurredElement = Collections.frequency(Arrays.asList(array), valueToEvaluate);

        return maxOccurredElement;
    }

    public SomeType[] filter(Function<SomeType, Boolean> predicate) {

        List<SomeType> list = Arrays.stream(array).filter(val -> predicate.apply(val)).collect(Collectors.toList());
        return list.toArray((SomeType[])Array.newInstance(array.getClass().getComponentType(), list.size()));
    }
}
