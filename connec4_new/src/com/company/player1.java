package com.company;

public class player1 {

    protected static char[][] input(int choice, char[][]arr1, int[]index ){
        switch (choice)
        {
            case 1:
                arr1[index[0]][0]='X';
                index[0]++;
                break;
            case 2:
                arr1[index[1]][1]='X';
                index[1]++;
                break;
            case 3:
                arr1[index[2]][2]='X';
                index[2]++;
                break;
            case 4:
                arr1[index[3]][3]='X';
                index[3]++;
                break;
            case 5:
                arr1[index[4]][4]='X';
                index[4]++;
                break;
            case 6:
                arr1[index[5]][5]='X';
                index[5]++;
                break;
            case 7:
                arr1[index[6]][6]='X';
                index[6]++;
                break;
        }
        return (arr1);


    }

}
