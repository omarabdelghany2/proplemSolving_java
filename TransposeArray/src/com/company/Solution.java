package com.company;

import java.util.Scanner;
import java.lang.Math;

public class Solution {

    public static int[][] transpose(int[] array) {
        int [][]arr2;
        int dim1=(int) Math.sqrt(array.length);

        arr2=new int[dim1][dim1];
        for (int i=0;i<dim1;i++)
        {
            for (int j=0;j<dim1;j++)
                arr2[i][j] = array[i * dim1 + j];
        }
        int[][] arrTranspose = new int[dim1][dim1];
        for (int i=0;i<dim1;i++)
        {
            for (int j=0;j<dim1;j++)
            {

                arrTranspose[i][j]=arr2[j][i];

            }
        }

        for (int i=0;i<dim1;i++)
        {
            for (int j=0;j<dim1;j++)
            {

                array[i*dim1+j]= arrTranspose[i][j];
            }
        }
        return (arrTranspose);
    }
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        String sin = sc.nextLine().replaceAll("\\[|\\]", "");

        String[] s = sin.split(", ");
        int[] arr = new int[s.length];

        if (s.length == 1 && s[0].isEmpty()) {
            arr = new int[]{};
            System.out.println("[[]]");
        } else {
            for (int i = 0; i < s.length; ++i) {
                arr[i] = Integer.parseInt(s[i]);
            }
            int dim1=(int) Math.sqrt(arr.length);

            int [][]arrTranspose=new int[dim1][dim1];
            arrTranspose=transpose(arr);
            System.out.print("[");
            for (int i=0;i<dim1;i++)
            {
                System.out.print("[");
                for (int j=0;j<dim1;j++)
                {
                    if(j!=dim1-1)
                        System.out.print(arrTranspose[i][j]+", ");
                    else
                        System.out.print(arrTranspose[i][j]+"]");
                }
                if(i!=dim1-1)
                    System.out.print(", ");

            }
            System.out.print("]");


        }
    }
}
