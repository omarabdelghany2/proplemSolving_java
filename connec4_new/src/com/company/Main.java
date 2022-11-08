package com.company;

import java.util.Scanner;




public class Main {
    //how many players
    //intialize the 2 dimesion array
    //print the empty connect4
    //take the inputs (no of columns )


    public static void main(String[] args)
    {

            char [] [] arr1=new char[7][7];
            for(int i=0;i<7;i++)
            {
             for(int j=0;j<7;j++)
             {
                 arr1[i][j]=' ';
             }
            }

            Scanner input=new Scanner(System.in);

            System.out.println("Connect 4 Starts");
            int mode_game;
            int choice;
            int [] index=new int[7];
            boolean flag=true;



	             System.out.println("one player press 1 //two players press 2");
                 mode_game=input.nextInt();
                PrintClass.printGame(arr1);

             while(flag)
             {
                 System.out.println("player 1 ur choice from 1->7");
                 choice=input.nextInt();
                 while(choice>7||choice<1)
                 {
                     System.out.println("Invalid");
                     System.out.println("player 1 ur choice from 1->7");
                     choice=input.nextInt();
                 }

                 arr1= player1.input(choice,arr1,index);
                 PrintClass.printGame(arr1);
                 flag = WinCheck2.check(choice,arr1,index,flag);
                 if(flag==false)
                 {
                     break;
                 }

                 System.out.println("player 2 ur choice from 1->7");
                 choice=input.nextInt();
                 while(choice>7||choice<1)
                 {
                     System.out.println("Invalid");
                     System.out.println("player 2 ur choice from 1->7");
                     choice=input.nextInt();
                 }


                     arr1= player2.input(choice,arr1,index);
                     PrintClass.printGame(arr1);

                flag= WinCheck2.check(choice,arr1,index,flag);

             }







    }



}
