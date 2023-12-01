package Schoolwork;

import java.util.Arrays;

public class SortedArray {
    public static void main(String[] arg){
        int[] a={1,52,12,54,77,34,96,13,5,2};
        Arrays.sort(a);
        int i;
        for(i=0;i<a.length;i++){
            System.out.print(a[i] + " ");
        }
    }
}
