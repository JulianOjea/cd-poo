package com.campusdual;

public class Exercise4 {
    //Suma de los 5 primeros números
    public static int sum5FirstNumber(){
      return 1 + 2 + 3 + 4 + 5;
    };

    //Suma de los 20 primeros números pares
    public static int sum20FirstPairNumber(){
        return 2 +4 +6+ 8+ 10 +12 +14 +16+ 18+ 20 +22 +24+
                26 +28+ 30 +32 +34 +36 +38 +40;
    };

    public static void main(String[] args) {
        System.out.println("Addition of first 5 numbers " + sum5FirstNumber());
        System.out.println("Addition of first 20 pair numbers " + sum20FirstPairNumber());
    }
}
