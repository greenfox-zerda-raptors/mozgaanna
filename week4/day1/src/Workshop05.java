/**
 * Created by mozgaanna on 07/11/16.
 */

import java.util.*;

public class Workshop05{
    public static void main(String... args){
        ArrayList<Integer> numList = new ArrayList<Integer>(Arrays.asList(12, 1, 532, 23, 0, 7, 54, 32));
        // Copy every element of "numList" to an Array

        Integer[] numbrs = numList.toArray(new Integer[numList.size()]);

        System.out.println(Arrays.deepToString(numbrs));
    }
}

