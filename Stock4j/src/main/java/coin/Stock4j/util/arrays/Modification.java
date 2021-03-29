package coin.Stock4j.util.arrays;

import java.util.Arrays;

public class Modification {

    public static <T> T[] appendElement(T[] array, T value) {
        T[] result = Arrays.copyOf(array, array.length + 1);
        result[result.length - 1] = value;
        return result;
    }
    public static <T> T[] removeElement(T[] array, T value) {
        if (array == null) {
            return array;
        }
        T[] anotherArray = (T[]) new Object[array.length - 1];
        for (int i = 0, k = 0; i < array.length; i++) {
            if (array[i].equals(value)) {
                continue;
            }
            anotherArray[k++] = array[i];
        }
        return anotherArray;
    }
}
