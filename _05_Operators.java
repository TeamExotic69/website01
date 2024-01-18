package com.company;

public class _05_Operators {
    public static void main(String[] args){
        // 1. Arithmetic Operators
        int a = 4;
        // int b = 6 % a; // Modulo Operator
        // 4.8%1.1 --> Returns Decimal Remainder

        // 2. Assignment Operators
        int b = 9;
        b *= 3;
        System.out.println(b);

        // 3. Comparison Operators
        // System.out.println(64<6);

        // 4. Logical Operators
        // System.out.println(64>5 && 64>98);
        System.out.println(64>5 || 64>98);

        // 5. Bitwise Operators
        System.out.println(2&3);
        //        10
        //        11
        //        ----
        //        10



        // Precedence & Associativity

        //int a = 6*5-34/2;
        /*
        Highest precedence goes to * and /. They are then evaluated on the basis
        of left to right associativity
            =30-34/2
            =30-17
            =13
         */
        //int b = 60/5-34*2;
        /*
            = 12-34*2
            =12-68
            =-56
         */

        //System.out.println(a);
        //System.out.println(b);

        // Quick Quiz
        int x =6;
        int y = 1;
        //  int k = x * y/2;

        int b1 = 0;
        int c1 = 0;
        int a1 = 10;
        int k = b*b - (4*a1*c1)/(2*a1);
        System.out.println(k);
    }
}
