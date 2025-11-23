package com.jianda.demo05;
//定义一个数组，储存1，2，3，4，5
//历遍数组，输出数组中所有元素之和

public class practice1 {
    public static void main(String[] args){
        int num[]={1,2,3,4,5};
        int sum=0;
        //for(int i=0;i<length(num);i++){
        for(int i=0;i<num.length;i++){
            sum+=num[i];
        }
        System.out.println(sum);
    }
}
