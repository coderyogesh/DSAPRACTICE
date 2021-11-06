package com.yogesh;

public class OrderAgnosticBS {
    public static void main(String[] args) {

    }

    static int binarySearch(int[] arr,int target){
        int start = 0;
        int end = arr.length -1;

        //find whether the array is sorted in ascending or descending
        
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
