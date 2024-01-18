package com.company;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class _14_PracticeSet {
    public static void main(String[] args) {


        //Question01: find the mistake without uncommenting this program
//        int a =10;
//        if(a=11)
//            System.out.println("I am 11");
//        else
//            System.out.println("I am not 11");


        //Question02:
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter marks in subject1: ");
//        byte m1=sc.nextByte();
//        System.out.print("Enter marks in subject2: ");
//        byte m2=sc.nextByte();
//        System.out.print("Enter marks in subject3: ");
//        byte m3=sc.nextByte();
//        if((m1>=33&&m2>=33&&m3>=33)&&((m1+m2+m3)/3>=40)){
//            System.out.print("PASS!");
//        }
//        else System.out.print("FAILED:(");


        //Question03
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter salary in L (*.*L): ");
//        float sal = sc.nextFloat();
//        float tax =0.0f;
//        if(sal<2.5f){
//            tax= tax+0.0f;/*this is when salary is below 2.5L (NO TAX ADDED)*/
//        }
//        if(sal>=2.5 && sal<5){
//            tax = tax+0.05f*(sal - 2.5f);/*this is when salary is above 2.5L (TAX HAVE TO ADD ONLY ON MONEY WHICH IS ABOVE 2.5L AND BELOW SALARY OF THE CLIENT)*/
//        }
//        else if (sal>=5.0f && sal<10.0f) {
//            tax = tax +0.05f*(5-2.5f);/*this is when salary is above 2.5L (TAX HAVE TO ADD ONLY ON MONEY WHICH IS ABOVE 2.5L AND BELOW 5L)*/
//            tax = tax +0.2f*(sal-5f);/*this is when salary is above 2.5L (TAX HAVE TO ADD ONLY ON MONEY WHICH IS ABOVE 5L AND BELOW SALARY OF CLIENT)*/
//        } else if (sal>=10) {
//            tax = tax + 0.05f*(5-2.5f);/*this is when salary is above 2.5L (TAX HAVE TO ADD ONLY ON MONEY WHICH IS ABOVE 2.5L AND LESS THAN 5L )*/
//            tax = tax + 0.2f*(10-5);/*this is when salary is above 2.5L (TAX HAVE TO ADD ONLY ON MONEY WHICH IS ABOVE 2.5L AND LESS THAN 10L)*/
//            tax=tax+0.3f*(sal-10);/*this is when salary is above 2.5L (TAX HAVE TO ADD ONLY ON MONEY WHICH IS ABOVE 2.5L AND LESS THAN SALARY OF THE CLIENT)*/
//        }
//        System.out.print("This is your PAYABLE Tax: "+tax+"L");




        //Question04:
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter number (1-7) to find day: ");
//        short day = sc.nextShort();
//        switch (day){
//            case 1 -> System.out.print("MONDAY");
//            case 2 -> System.out.print("TUESDAY");
//            case 3 -> System.out.print("WEDNESDAY");
//            case 4 -> System.out.print("THURSDAY");
//            case 5 -> System.out.print("FRIDAY");
//            case 6 -> System.out.print("SATURDAY");
//            case 7 -> System.out.print("SUNDAY");
//            default -> System.out.print("ERROR 404");
//        }


        //Question05--------------LEAP-YEAR--------------
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter year: ");
//        int year = sc.nextInt();
//        if(year%4==0 && year%100!=0 || year%400==0){
//            System.out.print("This is a LEAP YEAR");
//        }
//        else {
//            System.out.print("This is not a leap year");
//        }


        //Question05:
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter URL: ");
//        String url = sc.next();
//        if(url.endsWith(".org")){
//            System.out.print("This is an ORGANISATION website!");
//        }
//        else if (url.endsWith(".in")) {
//            System.out.print("This is an INDIAN website!");
//        }
//        else if (url.endsWith(".com")) {
//            System.out.print("This is an COMMERCIAL website!");
//        }
//        else {
//            System.out.print("NOT FOUND!");
//        }
    }
}