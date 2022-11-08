package com.company;

import java.util.Scanner;

public class Solution {

    public static int[] sumEvenOdd(int[] array) {
    	/*

        */
        int SumEven=0;
        int SumOdd=0;
        for (int i=0;i<array.length;i++)
        {
            if(array[i]%2==0)
                SumEven+=array[i];
            else
                SumOdd+=array[i];
        }
        if(array.length>1)
        {
            array[0]=SumEven;
            array[1]=SumOdd;
        }
        else
        {
            array[0]=SumOdd;
        }

        return (array);
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
        if(s.length == 1 && s[0].isEmpty())
            System.out.println("[0, 0]");
        else if(arr.length>1) {
            arr = sumEvenOdd(arr);
            System.out.println("[" + arr[0] + ", " + arr[1] + "]");
        }
        else
            System.out.println("[0"+ ", " + arr[] + "]");
    }
}
