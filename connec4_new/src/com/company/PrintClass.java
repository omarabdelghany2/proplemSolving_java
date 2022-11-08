package com.company;

public class PrintClass {

    private static int counter = 0;

    public PrintClass(){
        counter++;
    }

    protected static void printGame(char[][] boardArray) {
        for (int i = 6; i >= 0; i--)
        {
            System.out.printf("  %c  |  %c  |  %c  |  %c  |  %c  |  %c  |  %c  |",boardArray[i][0] ,boardArray[i][1],boardArray[i][2],boardArray[i][3],boardArray[i][4],boardArray[i][5],boardArray[i][6]);
            System.out.println("");

        }
    }

    public static int getCounter(){
        return counter;
    }


}
