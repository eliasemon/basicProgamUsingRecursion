package com.company;

public class Main {
    static int factorial(int a){
        if(a == 1){
            return a;
        }
        return  a * factorial(a-1);
    }
    public static void main(String[] args) {
        System.out.println(factorial(7));
    }
}
