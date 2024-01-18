package com.company;

public class _09_String_Methods {
    public static void main(String[] args) {
        String a = new String("This Is String ");
        String b = "this is another string ";

//        System.out.print(a);
//        int len = a.length();
//        System.out.print(len);
//
//        String up = a.toUpperCase();
//        System.out.print(up);
//
//        String lc = a.toLowerCase();
//        System.out.print(lc);
//
//        String trim = a.trim();/*this removes al the spaces at the begining and at the end of the string*/
//        System.out.print(trim);

//        System.out.println(a.substring(1));
//        System.out.println(a.substring(1,13));
        /*in this substring start index is included and end index is not included
        means it will start from 1 to 11*/
//        System.out.println(a.substring(-8,-2));/*thi is not working*/

//        System.out.println(a.replace(' ','*'));
//        System.out.println(a.replace(" ","*******"));

//        System.out.println(a.startsWith("Th"));/*this will always return value in boolean form*/
//        System.out.println(a.endsWith(" "));

//        System.out.println(a.charAt(12));
//        System.out.println(a.indexOf("Is"));
//        System.out.println(a.indexOf("s",4));
//        System.out.println(a.lastIndexOf("i"));
        /*this last index starts searching from the last of the string */
//        System.out.println(a.lastIndexOf("s",7));

//        System.out.println(a.equalsIgnoreCase("thIs is stRing "));
//        System.out.println(a.equals("This Is String "));

        /*----------------Escape Sequence Characters----------------------
        *                         \n, \t, \', \\, \b                    */
        System.out.println("Thsi is \na\bn \\example\\ \tof \"Escape_Sequence_Characters\"");

    }
}
