package com.jianda.demo05;
import java.util.Random;
public class practice4 {
    //求和
    public static int add(int arr[]){
        int sum=0;
        for(int i=0;i<10;i++){
            sum+=arr[i];
        }
        return sum;
    }
    //求平均数
    public static int average(int arr[]){
        int num=add(arr)/10;
        return num;
    }

    public static void main(String[]args){
        Random r=new Random();
        int arr[]=new int[10];
        for(int i=0;i<10;i++){
            arr[i]=r.nextInt(100)+1;
        }
        add(arr);
        System.out.println(add(arr));
        System.out.println(average(arr));

    }
}




















