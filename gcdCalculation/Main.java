package com.company;

public class Main {
    static  int calculation(int a, int b, int i){
        if(a % i == 0 && b % i == 0){
            return i;
        }
        return calculation(a,b,i-1);
    }
    static int gcdCalculation(int a, int b){
        int gcd;
        if(a > b) {
            gcd = calculation(a, b, b);
        }else {
            gcd = calculation(a, b, a);
        }
        return gcd;
    }
    public static void main(String[] args) {
        System.out.println(gcdCalculation(15,150));
    }
}
