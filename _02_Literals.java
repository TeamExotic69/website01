package com.company;

public class _02_Literals {
    public static void main(String[] args) {
    byte age = 34;
//    here this 34 is a literal
        char ch='A';
//        always write character in single quotes
        float f1 = 5.567f;
//        also we can use f or F
//        here you always have to very specific about float to mark f after float is written
        double d1 = 0.987654;
//        same here d or D
//        here you don't have to specify everytime that it is a double if you want to write you can 0.9876d
        long number = 18765439876543l;
//        to declare long number you always have to write l at the end of the number otherwise it will take as a integer by default
        short num = 7654;
        boolean a = true;
        String str = "this is a string";
        System.out.print(age+" ");
        System.out.print(str);
    }
}
