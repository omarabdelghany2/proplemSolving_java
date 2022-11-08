package com.company;

import com.sun.prism.shader.Solid_ImagePattern_Loader;

public class Main {

    public static int fibonacci(int index){
        if(index==1){
            return (1);
        }
        if(index==0){
            return 0;
        }

        int a=fibonacci(index-1);
        int b=fibonacci((index-2));
        return(a+b);
    }


    public static void main(String[] args) {

        int x=fibonacci(6);
        System.out.println(x);

    }
}
