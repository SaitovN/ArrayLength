package academy.devonline.java.basic.section01_setup.section06_setup;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayLength {
    public static void main(String[] args) {
        int [] array = {1,2,67};
        System.out.println(Arrays.toString(array));
        System.out.println(Array.getLength(array));
        System.out.println(array[array.length -1]);
    }
}
