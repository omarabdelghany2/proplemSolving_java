package com.company;

import java.util.Scanner;

public class Solution {

    public int[] reverse(int[] array){
        int [] reversedArr;
        reversedArr=new int [array.length];
        for(int i=0;i<array.length;i++)
        {
            reversedArr[i]=array[array.length-i-1];

        }
        return (reversedArr);

    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String sin = sc.nextLine().replaceAll("\\[|\\]", "");
        String[] s = sin.split(", ");
        float[] arr = new int[s.length];

        if (s.length == 1 && s[0].isEmpty())
            arr = new int[]{};
        else {
            for(int i = 0; i < s.length; ++i)
                arr[i] = Integer.parseInt(s[i]);
        }

        int[] res = new Solution().reverse(arr);

        System.out.print("[");
        for(int i = 0; i < arr.length; ++i) {
            System.out.print(res[i]);
            if(i != s.length - 1)
                System.out.print(", ");
        }
        System.out.print("]");
    }
}
