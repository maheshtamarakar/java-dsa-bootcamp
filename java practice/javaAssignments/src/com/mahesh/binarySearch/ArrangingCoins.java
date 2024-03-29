package com.mahesh.binarySearch;

public class ArrangingCoins {
    public static void main(String[] args) {
        int n = 1804289383;

        System.out.println(arrangeCoins(n));
    }

    static long arrangeCoins(int n) {
        long start=0, mid, end=n;
        while(start<=end){
            mid=start+(end-start)/2;
            if((mid*(mid+1))/2 > n){
                end=mid-1;
            }else if((mid*(mid+1))/2 < n){
                start=mid+1;
            }else{
                return mid;
            }
        }
        return end;
    }
}
