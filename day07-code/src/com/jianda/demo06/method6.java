package com.jianda.demo06;
import java.util.Scanner;
public class method6 {
    public static void main(String[] args) {
        //定义一个方法copyOfRange(int[]arr,int from,int to)
        //功能：将数组arr中从索引from开始到索引to结束的元素复制到一个新数组中
        //返回值：新数组
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入起点下标:");
        int from = sc.nextInt();
        System.out.print("请输入终点下标:");
        int to = sc.nextInt();

        copyOfRange(arr, from, to);
    }

    //将数组arr中从索引from开始到索引to结束的元素复制到一个新数组中
    public static void copyOfRange(int[] arr, int from, int to) {
        int newArr[] = new int[to - from];
        for (int i = from; i < to; i++) {
            newArr[i - from] = arr[i];
            System.out.print(newArr[i - from] + " ");
        }
//        //调用方法拷贝数组
//        int copyArr[] = copyOfRange(arr, from, to);
//
//        //打印新数组
//        for (int i = 0; i < to - from; i++) {
//            System.out.print(copyArr[i] + " ");
//        }
    }
}
//    public static int[] copyOfRange(int arr[],int from,int to){
//        int newArr[]=new int[to-from];
//        int index=0;
//        for(int i=from;i<to;i++){
//            newArr[index]=arr[i];
//            index++;
//        }
//        return newArr;
//    }
//}