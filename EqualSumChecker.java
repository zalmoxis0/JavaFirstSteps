package com.company;

public class EqualSumChecker {
    public static void main(String[]  args){
        System.out.println(hasEqualSun(1,1,2));
    }

    public static boolean hasEqualSun(int num1, int num2, int num3){
        if(num1 + num2 == num3){
            return true;
        }
        return false;
    }
}
