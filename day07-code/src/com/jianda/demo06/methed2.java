package com.jianda.demo06;
//比较两个长方形面积
import java.util.Scanner;
public class methed2 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入第一个长方形的长：");
        int a=sc.nextInt();
        System.out.println("请输入第一个长方形的宽：");
        int b=sc.nextInt();
        int area1=Getarea(a,b);
        System.out.println("请输入第二个长方形的长：");
        int c=sc.nextInt();
        System.out.println("请输入第二个长方形的宽：");
        int d=sc.nextInt();
        int area2=Getarea(c,d);
        Comparearea(area1,area2);
        }

    //计算长宽分别为a,b的长方形的面积
    public static int Getarea(int a,int b){
        int area=a*b;
        return area;
    }
    //比较两个长方形面积
    public static void Comparearea(int area1,int area2){
        if(area1>area2){
            System.out.println("第一个长方形的面积大于第二个长方形的面积");
        }
        else if(area1<area2){
            System.out.println("第一个长方形的面积小于第二个长方形的面积");
        }
        else{
            System.out.println("两个长方形的面积相等");
        }
    }
}
