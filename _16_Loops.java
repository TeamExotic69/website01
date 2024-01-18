package com.company;

public class _16_Loops {
    public static void main(String[] args) {

//-----------------------------------------------------------------WHILE_LOOP---------------------------------------------------------------------
        /*Types of Loops :
Primarily, there are three types of loops in Java:

1)While loop
2)do-while loop
3)for loop
Let's look into these, one by one.

While loops :
* The while loop in Java is used when we need to execute a block of code again and again based on a given boolean condition.
* Use a while loop if the exact number of iterations is not known.
* If the condition never becomes false, the while loop keeps getting executed. Such a loop is known as an infinite loop.*/


/*
            while (Boolean condition)

            {

            // Statements    -> This keeps executing as long as the condition is true.

            }
*/

//        int i=10;
//        while(i>0){
//            System.out.println(i);
//            i--;
//        }




//        System.out.println(1);
//        System.out.println(2);
//        System.out.println(3);
//
//        System.out.println("Using Loops:");
//        int i = 100;
//        while(i<=200){
//            System.out.println(i);
//            i++;
//        }
//        System.out.println("Finish Running While Loop!");

//        while(true){
//            System.out.println("I am an infinite while loop!");
//        }



//------------------------------------------------------------DO-WHILE_LOOP------------------------------------------------------------------------
/*
        Do-while loop:
        *   Do- while loop is similar to a while loop except for the fact that it is guaranteed to execute at least once.
        *   Use a do-while loop when the exact number of iterations is unknown, but you need to execute a code block at least once.
        *   After executing a part of a program for once, the rest of the code gets executed on the basis of a given boolean condition.
        Syntax :*/

        /*  do {

            //code

            } while (condition);            //Note this semicolon */

//        int i=1;
//        do{
//            System.out.println(i);
//            i++;
//        }
//        while(i<=10);


/*
        *   Difference Between while loop and do-while loop :
        *   while – checks the condition & executes the code.
        *   do-while – executes the code at least once and then checks the condition. Because of this reason, the code in the do-while loop executes at least once, even if the condition fails.*/
//        int a = 0;
//        while(a<5){
//            System.out.println(a);
//            a++;
//        }


//        int b = 10;
//        do {
//            System.out.println(b);
//            b++;
//        }while(b<5);
//
//        int c = 1;
//        do{
//            System.out.println(c);
//            c++;
//        }while(c<=45);



//-------------------------------------------------------------FOR_LOOP----------------------------------------------------------------------------
/*For loop:
1)  For loop in java is used to iterate a block of code multiple times.
2)  Use for loop only when the exact number of iterations needed is already known to you.
Syntax :*/
/* for (initialize; check_bool_expression; update){

            //code;

} */
/*
3)  Initializer: Initializes the value of a variable. This part is executed only once.
4)  check_bool_expression: The code inside the for loop is executed only when this condition returns true.
5)  update: Updates the value of the initial variable.
                Example :*/

//        for (i=7; i!=0; i--){
//            System.out.println(i);
//        }
//The above for loop initializes the value of i=7 and keeps printing as well as decrementing the value of i till i do not get equals to 0.


        //        for (int i=1; i<=10; i++){
//            System.out.println(i);
//        }
        // 2i = Even Numbers = 0, 2, 4, 6, 8
        // 2i+1 = Odd Numbers = 1, 3, 5, 7, 9
        //int n = 3;
        //for (int i =0; i<n; i++){
        //    System.out.println(2*i+1);
        //}

//        for(int i=5; i!=0; i--){
//            System.out.println(i);
//        }


    }
}
