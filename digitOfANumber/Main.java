package com.company;

public class Main {
    static  int calculation(int a, int count){
        a /= 10;
        count++;
        if(a == 0){
            return count;
        }
        return calculation(a, count);
    }
    static int digitOfANumber(int a){
        return  calculation(a,0);
    }
    public static void main(String[] args) {
        System.out.println(digitOfANumber(1463));
    }
}
