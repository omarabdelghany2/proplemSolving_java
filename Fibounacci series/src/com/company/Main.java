package com.company;
import java.util.Scanner;
public class Main {

	public static int fibonacci(int n) {
		int []arr =new int[40];
		arr[0]=0;
		arr[1]=1;
		if(n!=1||n!=2) {
			for (int i = 2; i < n; i++) {
				arr[i] = arr[i - 1] + arr[i - 2];
			}
		}
		return (arr[n-1]);
	}
    public static void main(String[] args) {
	    Scanner input=new Scanner(System.in);
	    int x= input.nextInt();
	    int []arr =new int[40];

	    x=fibonacci(x);
	    System.out.println(x);

    }
}
