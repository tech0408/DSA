package dsa.Problems.StreamAPIs;

import java.util.Arrays;
import java.util.Comparator;

public class ArrayCustomReturn {

    public static void main(String[] args) {

        // Return a new array that has unique values that doesn't has value 'c' using java 8.
        String[][] stAr = new String[][]{{"a","b","c"},{"a","b","d"},{"d","a","b","e","f"},{"a","a","z"}};

        Arrays.stream(stAr).filter(st-> Arrays.stream(st).distinct().count() == st.length &&
                Arrays.stream(st).noneMatch("c"::equals)).forEach(st-> System.out.println(Arrays.toString(st)));


    }
}

