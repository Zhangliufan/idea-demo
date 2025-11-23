package com.jianda.demo06;
import java.util.Scanner;
//判断数组中是否包含某个元素
public class method4 {
    public static void main(String[]args){
        int arr[]={11,22,33,44,55};
       Scanner sc=new Scanner(System.in);
       System.out.println("请输入想查找的值：");
       int num=sc.nextInt();
       System.out.println(LookingFor(num,arr));
    }
    //判断数组里是否有某值
    public static boolean LookingFor(int num,int arr[]){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==num){
                return true;
            }
        }
        return false;
    }
}
