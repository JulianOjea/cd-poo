package com.campusdual;

public class Exercise5 {
    //comprobar si un numero es positivo o negativo
    public static boolean isPositive(int n){
     return n >= 0;
    }

    //comprobar si un numero es multiplo de otro
    public static boolean isMultiple(int n, int m){
        return m % n == 0;
    }

    //comprobar si un numero es menor que otro
    public static int returnBigger(int n, int m){
        return Math.max(m, n);
    }

    public static void main(String[] args) {
        System.out.println(isPositive(1));
        System.out.println(isPositive(-1));
        System.out.println(isPositive(0));

        System.out.println("Multiples");
        System.out.println(isMultiple(1, 2));
        System.out.println(isMultiple(2, 4));
        System.out.println(isMultiple(2, 3));
        System.out.println(isMultiple(3, 9));
        System.out.println(isMultiple(4, 10));

        System.out.println(returnBigger(1, 2));
        System.out.println(returnBigger(1, 1));
        System.out.println(returnBigger(3, 1));
    }
}
