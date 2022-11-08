package com.company;

public class WinCheck2 {
    protected static boolean check(int choice, char[][] arr1, int[] index, boolean flag) {


        int score = 0;


        for (int i = 0; i < 7; i++) {
            if (arr1[index[choice - 1] - 1][i] == 'O') {
                score++;
            } else {
                score=0;

            }

            if (score > 3) {
                System.out.println("Player 2 win from right");
                score=0;
                flag = false;
                break;
            }
        }

        score = 0;
        //check 3 up and 3 down


        for (int i = 0; i < 7; i++) {
            if (arr1[i][choice - 1] == 'O') {
                score++;
            } else {
                score = 0;
            }

            if (score > 3) {
                System.out.println("Player 2 win from up");
                score=0;
                flag = false;
                break;
            }


        }

        //check diagonal to the right
        for (int i = 0; i < 7 - choice + (index[choice - 1]); i++) {
            try {
                if (i == 0) {
                    if (arr1[index[choice - 1] - 1][choice - 1] == 'O') {
                        score++;
                    } else {
                        score = 0;
                    }
                } else if ( i < index[choice - 1]) {
                    if (arr1[index[choice - 1] - 1 - i][choice - 1 - i] == 'O') {
                        score++;
                    } else {
                        score = 0;
                    }
                } else {
                    if (arr1[index[choice - 1] - 1 + i][choice - 1 + i] == 'O') {
                        score++;
                    } else {
                        score = 0;
                    }
                }
            } catch (Exception e) {

            }


            if (score > 3) {
                System.out.println("Player 2 win from diaginal");
                flag = false;
                break;
            }

        }


        return flag;
    }
}
