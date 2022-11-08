package com.company;

import java.util.Scanner;

public class Solution {
    public double average(int[] array) {
        double average=0;
        for(int i=0;i<array.length;i++)
        {
            average+=array[i];
        }
        average/=array.length;
        return (average);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sin = sc.nextLine().replaceAll("\\[|\\]", "");
        String[] s = sin.split(", ");
        int[] arr = new int[s.length];

        if (s.length == 1 && s[0].isEmpty())
            arr = new int[]{};

        else {
            for(int i = 0; i < s.length; ++i)
                arr[i] = Integer.parseInt(s[i]);
        }

    }
}
