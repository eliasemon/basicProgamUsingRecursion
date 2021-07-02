package com.company;

public class Main {
    static  int calculation(int a, int i,int count){
        if(a % i == 0){
            count++;
        }
        if(count == 3 || i > a){
            return count;
        }
        return calculation(a,i+1,count);
    }
    static boolean primeCalculation(int a){
        if (calculation(a,1,0) == 2){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        System.out.println(primeCalculation(7));
    }
}
