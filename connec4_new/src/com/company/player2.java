package com.company;

public class player2 {
    protected static char[][] input(int choice, char[][]arr1, int[]index ){
        switch (choice)
        {
            case 1:
                arr1[index[0]][0]='O';
                index[0]++;
                break;
            case 2:
                arr1[index[1]][1]='O';
                index[1]++;
                break;
            case 3:
                arr1[index[2]][2]='O';
                index[2]++;
                break;
            case 4:
                arr1[index[3]][3]='O';
                index[3]++;
                break;
            case 5:
                arr1[index[4]][4]='O';
                index[4]++;
                break;
            case 6:
                arr1[index[5]][5]='O';
                index[5]++;
                break;
            case 7:
                arr1[index[6]][6]='O';
                index[6]++;
                break;
        }
        return (arr1);


    }
}
