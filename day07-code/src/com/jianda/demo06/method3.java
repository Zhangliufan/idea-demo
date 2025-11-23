package com.jianda.demo06;

public class method3 {
    public static void main(String[] args){
          int arr[]={11,22,33,44,55};
          PrintArr(arr);
    }
    public static void PrintArr(int arr[]){
        System.out.print("[");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
            if(i==arr.length-1) {
                System.out.print("]");
            }
            else{
                System.out.print(", ");
            }

        }
    }
}
