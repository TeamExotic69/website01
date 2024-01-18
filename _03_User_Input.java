package com.company;
import java.util.Scanner;
public class _03_User_Input {
    public static void main(String[] args) {
        System.out.println("Taking input from the user");
        Scanner sc  =new Scanner(System.in);
//        System.out.print("Enter number1: ");
//        int a = sc.nextInt();
//        System.out.print("Enter number2: ");
//        int b = sc.nextInt();
//        int sum =a +b;
//        System.out.print("This is a sum of these numbers: "+sum );
//        boolean b =sc.hasNextInt();
////        this will only check for int which is given by the user
//        System.out.println(b);
//        String str = sc.next();
//        this sc.next() will only read first word which is given by the user
        String str = sc.nextLine();
//        this will take the whole line entered by the user
        System.out.print(str);
    }
}
