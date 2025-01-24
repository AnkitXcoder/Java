package Sorting;

import java.util.*;
import java.io.*;
import java.lang.reflect.Array;

public class insertionSort{
public static void insertionSort(int[] arr){
    for(int i=1;i<arr.length;i++){
        int j=i;
        while(j>0 && arr[j]<arr[j-1]){
            //swap the element btween arr(j) and arr(j-1)
            int temp = arr[j];
            arr[j]=arr[j-1];
            arr[j-1]=temp;

            j--;
        

        }
    }
}


    public static void main(String[] args) {
        int  arr[]={20,50,25,67,79,12,15,1};
        // finction call
        insertionSort(arr); //input is arr
        System.out.println("sorted array is: ");
        System.out.println(Arrays.toString(arr));  //w3 to show string good 
    }
}
