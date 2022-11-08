package com.company;

public class Main {
    public static int power(int base,int exp){
        if(exp==0){
            return 1;
        }
        int result=base*power(base,exp-1);

        return result;
    }
    public static void main(String[] args) {

        int x=power(10,3);
        System.out.println(x);
    }
}
