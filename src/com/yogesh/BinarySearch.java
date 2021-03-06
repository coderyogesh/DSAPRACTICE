package com.yogesh;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr ={-46,-12,2,3,4,6,86,421};
        int target = -10;

        int  ans= binarySearch(arr,target);
        System.out.println(ans);
    }

    // return the index
    static int binarySearch(int[] arr,int target){
        int start = 0;
        int end = arr.length -1;

        while(start <= end){
            //find the middle element
            // int mid = (start + end )/2;
            int mid = start + (end - start) / 2;

            if(target < arr[mid]) {
                end = mid-1;
            } else if(target>arr[mid]){
                start =mid+1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
