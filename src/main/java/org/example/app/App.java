package com.example;

public class App {
    public static void main(String[] args) {

        System.out.println("Hello and welcome!");
        int x = 5;
        int y = 3;
        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }
        System.out.println("The sum of " + x +  " and " + y + " is " + add(x,y));
    }
    public static int add(int x, int y){
        return x + y;
    }
}
