package mergesort;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {12,54,21,98,23,26,86,49,3,9,37,62,76,90,11,19,97};
        System.out.println("Initial Array: ");
        System.out.println(Arrays.toString(arr));
        mergeSort(arr,0,arr.length-1);
        System.out.println("Merge Sorted Array: ");
        System.out.println(Arrays.toString(arr));
    } 
    public static void mergeSort(int[] a, int s, int e){
        int n = a.length;
        if(s == e) {
            return;
        }else{
            int m = (s+e)/2;
            mergeSort(a, s, m);
            mergeSort(a, m+1, e);
            merge(a,s,m,e);
        }
    }
    public static void merge(int[] x, int f, int b, int l){
        int i = f;
        int j = b+1;
        int[] tempArr = new int[l-f+1];
        int k =0;
        while(i <= b && j <= l){
            if(x[i] < x[j]){
                tempArr[k++] = x[i++];                
            }else{
                tempArr[k++] = x[j++];
            }
        }
        if(i > b){
            while(j<=l){
                tempArr[k++] = x[j++];
            }
        }
        if(j > l){
            while(i<=b){
                tempArr[k++] = x[i++];     
            }
        }
        for(k=0;k<tempArr.length;++k){
            x[f++] = tempArr[k];
        }        
    }
}
