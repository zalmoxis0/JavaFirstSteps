package com.company;

import java.math.BigDecimal;

public class DecimalComparator {
    public static void main(String[] args){
        System.out.println(areEqualByThreeDecimalPlaces(2.001, 2.001));
    }

    public static boolean areEqualByThreeDecimalPlaces(double dec1, double dec2){
        return (dec1 * 1000) == (dec2*1000);
    }
}
