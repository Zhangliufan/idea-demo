package com.jianda.demo05;
public class practice2 {
    public static void main(String[] args) {
        int num[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 == 1) {
                num[i] *= 2;
                System.out.println(num[i]);
            } else {
                num[i] /= 2;
                System.out.println(num[i]);
            }
        }
    }
}
