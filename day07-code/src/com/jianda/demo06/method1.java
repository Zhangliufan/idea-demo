package com.jianda.demo06;
import java.util.Scanner;
public class method1 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入长方形的长：");
        int a=sc.nextInt();
        System.out.println("请输入长方形的宽：");
        int b=sc.nextInt();
        Getperimeter(a,b);
    }

    //求长宽分别为a,b的长方形的周长
    public static void Getperimeter(int a,int b){
        int perimeter=2*(a+b);
        System.out.println("正方形的周长为"+perimeter);
    }
}
