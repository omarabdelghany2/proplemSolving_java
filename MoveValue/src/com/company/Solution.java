package com.company;

import java.util.Scanner;

public class Solution {

    public static int[] moveValue(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                for (int j = i; j < array.length - 1; j++) {
                    array[j] = array[j + 1];
                }
                array[array.length - 1] = value;

            }

        }
        return (array);
    }
        public static void main (String[] args){
            Scanner sc = new Scanner(System.in);
            String sin = sc.nextLine().replaceAll("\\[|\\]", "");
            int x = sc.nextInt();
            String[] s = sin.split(", ");
            int[] arr = new int[s.length];

            if (s.length == 1 && s[0].isEmpty()) {
                arr = new int[]{};
                System.out.println("[]");
            }
            else {
                for (int i = 0; i < s.length; ++i) {
                    arr[i] = Integer.parseInt(s[i]);
                }

                arr = Solution.moveValue(arr, x);

                if(s.length == 1 && s[0].isEmpty())
                    System.out.println(x);
                else {
                    System.out.print("[");
                    for (int i = 0; i < arr.length; ++i) {
                        System.out.print(arr[i]);
                        if (i != arr.length - 1)
                            System.out.print(", ");
                    }
                    System.out.print("]");
                }
            }
        }

}
