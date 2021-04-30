package com.intigral.array.merge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MergeArray {

    public static void main(String[] args) {
        int array1[] = new int[]{1, 3, 5, 7, 8};
        int array2[] = new int[]{2, 4, 6, 9, 10};

        //To Print [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
        System.out.print(Arrays.asList(Arrays.stream(new MergeArray().merge(Arrays.stream(array1).boxed().toArray(Integer[]::new), Arrays.stream(array2).boxed().toArray(Integer[]::new))).boxed().toArray(Integer[]::new)));

        //Uncomment below line to print 12345678910
        //IntStream.of(new MergeArray().merge(Arrays.stream(array1).boxed().toArray(Integer[]::new), Arrays.stream(array2).boxed().toArray(Integer[]::new))).forEach(System.out::print);
    }

    public int[] merge(Integer[] arr1, Integer[] arr2) {
        List<Integer> tempList = new ArrayList<>();

        //Converting to List
        tempList.addAll(Arrays.asList(arr1));
        tempList.addAll(Arrays.asList(arr2));

        //Sorting
        Collections.sort(tempList);

        //converting to array and returning the same
        tempList.toArray(new Integer[tempList.size()]);
        return tempList.stream().mapToInt(Integer::intValue).toArray();
    }
}
