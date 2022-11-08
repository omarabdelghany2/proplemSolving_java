package com.company;

public class Tra {

    public static void main(String[] args) {
        System.out.println("counter = " + PrintClass.getCounter());

        PrintClass print1 = new PrintClass();

        System.out.println("counter = " + PrintClass.getCounter());

        PrintClass print2 = new PrintClass();

        System.out.println("counter = " + PrintClass.getCounter());
        System.out.println("counter = " + PrintClass.getCounter());

    }


}
