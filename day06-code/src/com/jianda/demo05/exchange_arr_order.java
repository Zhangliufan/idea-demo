package com.jianda.demo05;

public class exchange_arr_order {
    public static void main(String[]args){
        int temp=0;
        int arr[]={1,2,3,4,5};
//        for(int i=0;i<=arr.length/2;i++){
//            //交换位置
//            temp=arr[i];
//            arr[i]=arr[arr.length-i-1];
//            arr[arr.length-i-1]=temp;
//        }
        for(int i=0,j=arr.length-i-1;i<j;i++,j--){
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
        for(int i=0;i<=arr.length;i++){
            System.out.print(arr[i]+" ");
        };
    }
}
