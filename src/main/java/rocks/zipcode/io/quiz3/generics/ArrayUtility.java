package rocks.zipcode.io.quiz3.generics;

import java.util.Arrays;
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
        return null;
    }

    public SomeType findEvenOccurringValue() {
        return null;
    }

    public Integer getNumberOfOccurrences(SomeType valueToEvaluate) {
        return null;
    }

    public SomeType[] filter(Function<SomeType, Boolean> predicate) {

//       List<SomeType> list = Arrays.stream(array).filter(predicate).collect(Collectors.toList());
//       return list.toArray(new SomeType[0]);
        return null;
    }
}
