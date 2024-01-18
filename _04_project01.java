package com.company;
import java.util.Scanner;
public class _04_project01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks in each subject: ");
        System.out.print("Subject1: ");
        float a =sc.nextInt();
        System.out.print("Subject2: ");
        float b =sc.nextInt();
        System.out.print("Subject3: ");
        float c =sc.nextInt();
        System.out.print("Subject4: ");
        float d =sc.nextInt();
        System.out.print("Subject5: ");
        float e =sc.nextInt();
        float avg =(a+b+c+d+e)/5.0f;
        System.out.println("this is your Score "+avg+"% ");
    }
}
