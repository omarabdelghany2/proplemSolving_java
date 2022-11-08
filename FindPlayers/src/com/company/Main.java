package com.company;


import java.util.*;
import java.awt.Point ;

interface IfindPlayers {

    Point[] getTeams(String [] photo, int team , int threshold);
}

public class Main implements IfindPlayers {
static int teamSize;
static int [][] myPass;
static int minX=0;
static int maxX=0;
static int minY=0;
static int maxY=0;
static int arrayIndex=0;

    public Point[] getTeams(String[] photo, int team, int threshold) {
        Point[] teams = new Point[2500] ;

        char req = (char)(team+'0') ;

        for(int i = 0 ; i < photo.length ; i ++)
        {
            for(int j = 0 ; j < photo[0].length() ; j ++)
            {

                teamSize = 0 ; maxX = -1 ; maxY = -1 ;
                minX = 1000000 ; minY = 1000000 ;
                if(myPass[i][j] == 0)
                {
                    myPass[i][j] = 1 ;
                    if(photo[i].charAt(j) == req)
                    {
                        teamSize += 4 ;
                        minY = i-1 ;
                        maxY = i ;
                        minX = j-1 ;
                        maxX = j  ;
                        find(photo , i , j , req)  ;
                        if(teamSize >= threshold)
                        {
                            teams[arrayIndex] = new Point(minX+maxX+2 , minY+maxY+2) ;
                            arrayIndex ++ ;
                        }

                    }
                }
            }
        }
        return teams ;
    }

    public static void find(String[] photo , int i , int j , char req)
    {
        if(j+1 < photo[0].length() && myPass[i][j + 1] == 0)
        {
            myPass[i][j + 1] = 1 ;
            if(photo[i].charAt(j + 1) == req)
            {
                teamSize += 4 ;
                if(j < minX)
                    minX = j ;
                else if(j + 1 > maxX)
                    maxX = j + 1 ;
                find(photo , i , j+1 , req)  ;
            }
        }
        if(i+1 < photo.length && myPass[i + 1][j] == 0)
        {
            myPass[i + 1][j] = 1 ;
            if(photo[i+1].charAt(j) == req)
            {
                teamSize += 4 ;
                if(i < minY)
                    minY = i;
                else if(i+1 > maxY)
                    maxY = i+1 ;
                find(photo , i+1 , j , req)  ;
            }
        }
        if(i-1 > -1 &&myPass[i - 1][j] == 0)
        {
            myPass[i - 1][j] = 1 ;
            if(photo[i-1].charAt(j) == req)
            {
                teamSize += 4 ;
                if(i-2 < minY)
                    minY = i-2 ;
                else if(i-1 > maxY)
                    maxY = i-1 ;
                find(photo , i - 1 , j , req)  ;
            }
        }
        if(j-1 > -1 && myPass[i][j - 1] == 0)
        {
            myPass[i][j - 1] = 1 ;
            if(photo[i].charAt(j-1) == req)
            {
                teamSize += 4 ;
                if(j-2 < minX)
                    minX = j-2 ;
                else if(j -1 > maxX)
                    maxX = j -1 ;
                find(photo , i , j - 1 , req)  ;
            }
        }

        return ;

    }



    public static void main(String[] args)  {
        // lets take input
        Scanner input=new Scanner(System.in);
        String [] dim=input.nextLine().split(", ");
        int RowNum=Integer.parseInt(dim[0]);
        int ColNum=Integer.parseInt(dim[1]);
        String[] image =new String[RowNum];
        for(int i=0;i<RowNum;i++)
        {
            image[i]=input.nextLine();
        }
        int teamId=input.nextInt();
        int threshold=input.nextInt();
        //now we took all inputs lets try to process the image

        //1)first output if the input was 0 row and 0 column
        if(RowNum==0||ColNum==0)
        {
            System.out.println("[]");
            return;
        }
        //intialize mypass array to detect my steps in the image array
        myPass=new int [image.length][image[0].length()];

        //make and object from the main class to use its fuctions
        Main y=new Main();
        //intialize teams array to store in it the required teams location of its center
        Point []teams=y.getTeams(image,teamId,threshold);
        //lets sort the array about teams axis first then about y axis
        int temp ;
        for (int i=0;i<arrayIndex;i++)
        {
            for (int j=0;j<arrayIndex-1;j++)
            {
                if(teams[j].x>teams[j+1].x)
                {
                    temp=teams[j].x;
                    teams[j].x=teams[j+1].x;
                    teams[j+1].x=temp;
                    temp = teams[j].y ;
                    teams[j].y = teams[j+1].y ;
                    teams[j+1].y = temp ;
                }
                else if (teams[j].x == teams[j+1].x)
                {
                    if(teams[j].y > teams[j+1].y)
                    {
                        temp=teams[j].x;
                        teams[j].x=teams[j+1].x;
                        teams[j+1].x=temp;
                        temp = teams[j].y ;
                        teams[j].y = teams[j+1].y ;
                        teams[j+1].y = temp ;
                    }
                }

            }
        }
        System.out.print("[");
        for(int i = 0 ; i < arrayIndex ; i ++)
        {
            System.out.print("(" + teams[i].x +", " + teams[i].y  + ")");
            if(i != arrayIndex -1)
            {
                System.out.print(", ") ;
            }
        }
        System.out.println("]");


    }
}
