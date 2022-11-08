import jdk.internal.util.xml.impl.Input;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

         int [] arr1={5,4,3,53,13,4345};
         int min=arr1[0];
         int temp=0;

         for(int i=0;i<6;i++)
         {
         for(int j=0;j<6;j++)
         {
            if(j!=5)
            {
            if(arr1[j]>arr1[j+1])
             {   temp=arr1[j];
                 arr1[j]=arr1[j+1];
                 arr1[j+1]=temp;

            }
            }
         }
         }


         for(int i=0;i<6;i++)
         {
             System.out.println(arr1[i]);
         }
    }


}
