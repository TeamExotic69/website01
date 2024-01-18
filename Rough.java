package com.company;
import javax.swing.*;
import java.util.Scanner;
import static java.lang.Math.pow;
import static java.lang.Math.scalb;

public class Rough {
    public static void main(String[] args) {
//         THIS IS TO FIND CIRCUMFARENCE AND AREA OF A CIRCLE
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter Radius of your circle: ");
//        float r = sc.nextFloat();
//        float cir = 2*3.141f*r;
//        float area = 3.141f*r*r;
//        System.out.print("This is Area: "+area+" Sq.UNIT and Circumference: "+cir+" UNIT of your circle ");


//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter your Basic Salary: ");
//        float bs = sc.nextFloat();
//        float ta =(12.0f*bs)/100;
//        float da =(10.0f*bs)/100;
//        float hra =(10.0f*bs)/100;
//        System.out.print("This is your Gross Salary: "+(bs+ta+da+hra));


//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter 5 digits number: ");
//        short n =sc.nextShort();
//        int sum=0;
//        for (int i=0;i<5;i++){
//            int m= (n%10);
//            sum = m + (sum*10);
//            n/=10;
//        }
//        System.out.println("This is sum of digits: "+sum);


//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter 5 digits number: ");
//        short n =sc.nextShort();
//        int sum=0;
//        for (int i=0;i<5;i++){
//            int m= (n%10);
//            sum = m + sum;
//            n/=10;
//        }
//        System.out.println("This is sum of digits: "+sum);

//  -----------------------ARMSTRONG NUMBER-------------------------
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter a number: ");
//        short n = sc.nextShort();
//        short q=n;
//        short p=n;
//        int dig = 0;
//        while (q>0){
//            int m = (q % 10);
//            dig +=1;
//            q /= 10;
//        }
//        int arm =0;
//        for (int i = 0; i < dig; i++) {
//            int m = (p % 10);
//            arm +=(pow(m,dig));
//            p/=10;
//        }
//        if(arm==n){
//            System.out.print("YES, this is an Armstrong number ");
//        }
//        else {
//            System.out.print("NO, this is not an Armstrong number ");
//        }


//        --------------INCOMPLETE----------------------------
//        ------------------TO FIND NTH ARMSTRONG NUMBER-------------------
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter a number: ");
//        short n = sc.nextShort();
//        int dig = 0;
//        int i;
//        for (int t =1;t<2147483647;t++){
//        for (i = 1; i <= n; i++) {
//            while (i > 0) {
//                int m = (i % 10);
//                dig += 1;
//                i /= 10;
//            }
//            int arm = 0;
//            int j;
//            for (j = 1; j < dig; j++) {
//                int m = (i % 10);
//                arm += (pow(m, dig));
//                j /= 10;
//            }
//        }
//        }


//        ------------PALINDROME-------------------
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter number: ");
//        int n =sc.nextShort();
//        int m=n;
//        int rev=0;
//        while (m>0){
//            int p = (m % 10);
//            rev = p+(rev*10);
//            m/=10;
//        }
//        if(rev==n){
//            System.out.print("This is a PALINDROME number ");
//        }
//        else
//            System.out.print("This is a PALINDROME number ");


//---------------------------FIBONACCI-----------------------------------
//        Scanner sc =new Scanner(System.in);
//        System.out.print("For FIBONACCI Series Enter n: ");
//        int n =sc.nextInt();
//        System.out.print("0 1 ");
//        long i =0l;
//        long j =1l;
//        int u=0;
//        while (u<=n){
//            long p=i+j;
//            System.out.print(p+" ");
//            i=j;
//            j=p;
//            u+=1;
//        }


//---------------------CHATGPT---------------------------------------
//        int n = 10; // Change this value to generate the Fibonacci series up to a different number
//
//        System.out.println("Fibonacci Series up to " + n + " terms:");
//
//        for (int i = 0; i < n; i++) {
//            System.out.print(fibonacci(i) + " ");
//        }
//    }
//
//    // Recursive method to calculate Fibonacci number at a given position
//    public static int fibonacci(int n) {
//        if (n <= 1) {
//            return n;
//        } else {
//            return fibonacci(n - 1) + fibonacci(n - 2);
//        }
//        ---------------------------------------------------------------------



        /*------------------Pattern
         *                       *
         *                       * *
         *                       * * *
         *                       * * * *---------------------------------------*/
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter n: ");
//        short n = sc.nextShort();
//        for(int i =0;i<n;i++){
//            for (int j=0;j<i;j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }








        /*------------------Pattern
         *                       1
         *                       1 2
         *                       1 2 3
         *                       1 2 3 4---------------------------------------*/
//        Scanner sc =new Scanner(System.in);
//        System.out.print("Enter n: ");
//        short n = sc.nextShort();
//        for (int i =1;i<=n;i++){
//        short p=1;
//            for (int j=1;j<=i;j++){
//                System.out.print(p+" ");
//                p+=1;
//            }
//            System.out.print("\n");
//        }









        /*------------------Pattern
         *                       * * * *
         *                       * * *
         *                       * *
         *                       *          ---------------------------------------*/
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter  n: ");
//        short n =sc.nextShort();
//        for (int i =n;i>=1;i--){
//            for (int j=1;j<=i;j++){
//                System.out.print("* ");
//            }
//            System.out.print("\n");
//        }


//-------------------------Vowel-------------------------
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter character: ");
//        char c = sc.next().charAt(0);
//        if (c=='a'||c=='A'||c=='e'||c=='E'||c=='i'||c=='I'||c=='o'||c=='O'||c=='u'||c=='U'){
//            System.out.print("This character is vowel! ");
//        }
//        else {
//            System.out.print("No not vowel ");
//        }


//---------------------CALCULATOR---------------------------------------
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter num1: ");
//        int num1 =sc.nextInt();
//        System.out.print("Enter Operation(+,-,/,*,%) : ");
//        char op=sc.next().charAt(0);
//        System.out.print("Enter num2: ");
//        int num2 =sc.nextInt();
//        int i;
//        switch (op){
//            case '+':
//                i=num1+num2;
//                System.out.print(i);
//                break;
//            case '-':
//                i=num1-num2;
//                System.out.print(i);
//                break;
//            case '/':
//                i=num1/num2;
//                System.out.print(i);
//                break;
//            case '*':
//                i=num1*num2;
//                System.out.print(i);
//                break;
//            case '%':
//                i=num1%num2;
//                System.out.print(i);
//                break;
//            default:
//                System.out.print("ERROR 404");
//        }


//--------------LARGEST AMONG 3-----------------------------------
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter num1: ");
//        int a = sc.nextInt();
//        System.out.print("Enter num2: ");
//        int b = sc.nextInt();
//        System.out.print("Enter num3: ");
//        int c = sc.nextInt();
//        if(a>b){
//            if (a>c){
//                System.out.print("num1: "+a+" is largest!");
//            }
//            else{
//                System.out.print("num3: "+c+" is largest!");
//            }
//        }
//        else {
//            System.out.print("num2: " + b + " is largest!");
//        }








        /*-------Print the given pattern
1 2 3 4
1 2 3
1 2
1 -----------------------------------------------------------------------------------------*/
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter n: ");
//        short n = sc.nextShort();
//        short m ;
//        for (int i=n;i>=1;i--){
//            m=1;
//            for (int j=1;j<=i;j++){
//                System.out.print(m+" ");
//                m+=1;
//            }
//            System.out.print("\n");
//        }







/*        Print the given pattern
        1
        1 3
        1 3 5
        1 3 5 7---------------------------------------------------------------------*/
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter n: ");
//        short n= sc.nextShort();
//        int m;
//        for (int i=1;i<=n;i++){
//            m=1;
//            for (int j =1;j<=i;j++){
//                System.out.print(m+" ");
//                m+=2;
//            }
//            System.out.print("\n");
//        }





        /*Print the given pattern
A B C D
A B C D
A B C D
A B C D----------------------------------------------*/
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter n: ");
//        short n =sc.nextShort();
//        for (int i=1;i<=n;i++){
//            char c ='A';
//            for (int j=1;j<=4;j++){
//                System.out.print(c+" ");
//                c+=1;
//            }
//            System.out.print("\n");
//        }








/*Print the given pattern
A
A B
A B C
A B C D----------------------------------------------------------------------------------*/
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter n: ");
//        short n =sc.nextShort();
//        for (int i=1;i<=n;i++){
//            char c ='A';
//            for (int j=1;j<=i;j++){
//                System.out.print(c+" ");
//                c+=1;
//            }
//            System.out.print("\n");
//        }







        /*Print the given pattern
1
A B
1 2 3
A B C D
1 2 3 4 5-----------------------------------------------------------------------------*/
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter n: ");
//        short n =sc.nextShort();
//        for (int i =1;i<=n;i++){
//            int y=1;
//            char c = 'A';
//            for (int j =1;j<=i;j++){
//                if(i%2==0) {
//                    System.out.print(c+" ");
//                    c+=1;
//                }
//                else {
//                    System.out.print(y+" ");
//                    y+=1;
//                }
//            }
//            System.out.print("\n");
//        }







        /*Print the given pattern
        - - * - -
        - - * - -
        * * * * *
        - - * - -
        - - * - -
         ----------------------------------------------------*/
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter n: ");
//        short n = sc.nextShort();
//
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= n; j++) {
//                if (i == (n+1) / 2 || j == (n+1) / 2) {
//                    System.out.print("* ");
//                }
//                else {
//                    System.out.print("- ");
//                }
//            }
//                System.out.print("\n");
//        }


/* Print the given pattern
            * * * *
            *     *
            * * * *
 */
//        Scanner sc  = new Scanner(System.in);
//        System.out.print("Enter r: ");
//        short r = sc.nextShort();
//        System.out.print("Enter c: ");
//        short c = sc.nextShort();
//        for(int i=1;i<=r;i++){
//            for(int j=1;j<=c;j++){
//                if (i==1||i==r||j==1|j==c){
//                    System.out.print("* ");
//                }
//                else {
//                    System.out.print("  ");
//                }
//            }
//            System.out.print("\n");
//        }













//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter n: ");
//        short n =sc.nextShort();
//        for (int i=1;i<=n;i++){
//            for (int j=1;j<=n;j++){
//                if(j==1||j==n){/*here first we have given that make every column * which is under this condition  */
//                    System.out.print("* ");
//                }
//                else if (i==1||i==n) {/*here first we have given that make every row - which is under this condition
//                since we already have given that element at (1,1)&(n,n)&(1,n)&(n,1) will be (*) so program can't re-write that element */
//                    System.out.print("- ");
//                }
//                else {
//                    System.out.print("  ");
//                }
//            }
//            System.out.print("\n");
//        }










        /*Print the given pattern
                    *               *
                        *       *
                            *
                        *       *
                    *               *
         */
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter n: ");
//        short n =sc.nextShort();
//        short x=0;
//        for(int i=1;i<=n;i++){
//            for (int j=1;j<=n;j++){
//                if(i==j||i==(1+x)&&j==(n-x)){
//                System.out.print("* ");
//                }
//                else {
//                    System.out.print("  ");
//                }
//            }
//            x++;
//            System.out.print("\n");
//        }


/*Print the given pattern
1
2 3
4 5 6
7 8 9 10------------------------------------------------------------------------*/
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter n: ");
//        short n = sc.nextShort();
//        int a =1;
//        for(int i =1;i<=n;i++){
//            for(int j =1;j<=i;j++){
//                System.out.print(a+" ");
//            a++;
//            }
//            System.out.print("\n");
//        }


//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter n: ");
//        short n = sc.nextShort();
//        int a =1;
//        for(int i =1;i<=n;i++){
//            for(int j =1;j<=i;j++){
//                System.out.print(a+" ");
//            a+=2;
//            }
//            System.out.print("\n");
//        }


/*Print the given pattern
1
0 1
1 0 1
0 1 0 1-------------------------------------------------------------------------*/
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter n: ");
//        short n=sc.nextShort();
//        int a = 0;
//        int b = 1;
//        for (int i =1;i<=n;i++){
//            for(int j =1;j<=i;j++){
//                    if ((j+i) % 2 != 0) System.out.print("0 ");
//                    else System.out.print("1 ");
//            }
//            System.out.print("\n");
//        }






/*: Print the given pattern
            *
          * *
        * * *
      * * * *
 --------------------------------------------------------------------------*/
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter n: ");
//        short n = sc.nextShort();
//        for(int i=1;i<=n;i++){
//            for (int j =n;j>=i;j--){
//                System.out.print("  ");
//            }
//            for (int k =1;k<=i;k++){
//                System.out.print("* ");
//            }
//            for (int j =n;j>=i;j--){
//                System.out.print("  ");
//            }
//            for (int k =1;k<=i;k++){
//                System.out.print("* ");
//            }
//            System.out.print("\n");
//        }


/*Print the given pattern
    ****
   ****
  ****
 ****
 ---------------------------------------------------------------------*/
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter n: ");
//        short n = sc.nextShort();
//        for (int i =1;i<=n;i++){
//            for (int j=n;j>=i;j--){
//                System.out.print("  ");
//            }
//            for (int k=1;k<=n;k++){
//                System.out.print("* ");
//            }
//            System.out.print("\n");
//        }




/*Print the given pattern
Alphabet Triangle
   A
  AB
 ABC
ABCD
----------------------------------------------------------------------------*/
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter n: ");
//        short n = sc.nextShort();
//        char c = 'A';
//        for (int i = 1;i<=n;i++){
//            for (int j =n;j>=i;j--){
//                System.out.print("  ");
//            }
//            c='A';
//            for (int k =1;k<=i;k++){
//                System.out.print(c+" ");
//                c++;
//            }
//            System.out.print("\n");
//        }



/*: Print the given pattern
     *
    * *
  * * * *
* * * * * *
 ------------------------------------------------------------------------------*/
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter n: ");
//        short n = sc.nextShort();
//        for (int i =1;i<=n;i++){
//            for (int j=n;j>=i;j--){
//                System.out.print("  ");
//            }
//            for (int k =1;k<=i;k++){
//                System.out.print("* ");
//            }
//            for (int l=2;l<=i;l++){
//                System.out.print("* ");
//            }
//            System.out.print("\n");
//        }


/*Print the given pattern
Number Pyramid
       1
     1 2 3
   1 2 3 4 5
 1 2 3 4 5 6 7-----------------------------------------------------------------*/
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter n: ");
//        short n = sc.nextShort();
//        int  m;
//        for (int i = 1;i<=n;i++){
//            m=1;
//            for (int j =n;j>=i;j--){
//                System.out.print("  ");
//            }
//            for(int k =1;k<=i;k++){
//                System.out.print(m+" ");
//                m++;
//            }
//            for (int l=2;l<=i;l++){
//                System.out.print(m+" ");
//                m++;
//            }
//        System.out.print("\n");
//        }



/*Print the given pattern
Alphabet Pyramid
      A
    A B C
  A B C D E
A B C D E F G----------------------------------------------------------------*/
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter n: ");
//        short n=sc.nextShort();
//        char c;
//        for (int i=1;i<=n;i++){
//            c='A';
//            for(int j=n;j>=i;j--){
//                System.out.print("  ");
//            }
//            for (int k=1;k<=i;k++){
//                System.out.print(c+" ");
//                c++;
//            }
//            for(int l=2;l<=i;l++){
//                System.out.print(c+" ");
//                c++;
//            }
//            System.out.print("\n");
//        }


/*Print the given pattern
Number Pyramid Mast
       1
     1 2 1
   1 2 3 2 1
 1 2 3 4 3 2 1------------------------------------------------------------------*/
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter n: ");
//        short n = sc.nextShort();
//        int q;
//        for(int i=1;i<=n;i++){
//            q=1;
//            for(int j =n;j>=i;j--){
//                System.out.print("  ");
//            }
//            for(int k=1;k<=i;k++){
//                System.out.print(q+" ");
//                q++;
//            }
//            q--;
//            for (int l =2;l<=i;l++){
//                q--;
//                System.out.print(q+" ");
//            }
//            System.out.print("\n");
//        }



/*Print the given pattern
    *
   ***
  *****
 *******
  *****
   ***
    *
 -----------------------------------------------------------------------------*/
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter n: ");
//        short a =sc.nextShort();
//        for(int i =1;i<=a;i++){
//            for(int j=a;j>i;j--){
//                System.out.print(" ");
//            }
//            for(int k=1;k<=i;k++){
//                System.out.print("*");
//            }
//            for(int l=2;l<=i;l++){
//                System.out.print("*");
//            }
//            System.out.print("\n");
//        }
//        for(int m =1;m<=a-1;m++){
//            System.out.print(" ");
//            for(int n=1;n<m;n++){
//                System.out.print(" ");
//            }
//            for(int o=a-1;o>=m;o--){
//                System.out.print("*");
//            }
//            for(int p=a-1;p>=m+1;p--){  //here we have taken(m+1) time because we have taken n loop least m times only
//                System.out.print("*");
//            }
//            System.out.print("\n");
//        }




//-----------logic is same---------ALTERNATE---------------------------------------------------------
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter n:");
//        short a= sc.nextShort();
//        for(int i=1;i<=a;i++){
//            for(int j=a;j>i;j--){
//                System.out.print(" ");
//            }
//            for(int k=1;k<=i;k++){
//                System.out.print("*");
//            }
//            for(int l=2;l<=i;l++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        for(int m=1;m<=a-1;m++){
//            for(int n=1;n<m+1;n++){
//                System.out.print(" ");
//            }
//            for(int o=a;o>m;o--){
//                System.out.print("*");
//            }
//            for(int p=a;p>=m+2;p--){ //here we have taken (m+2) means p will go least to m+2 times that is why we have taken n loop max to m+1 times
//                System.out.print("*");
//            }
//            System.out.println();
//        }



/*Print the given pattern
Number Pyramid Mast
*******
*** ***
**   **
*     *  ----------------------------------------------------------------------------*/
//-----------------------------CGPT---------------------------
//        int n = 9; // Change the value of 'n' to adjust the size of the pattern
//
//        for (int i = 0; i < n; i++) {
//            // Print asterisks
//            for (int j = 0; j < n - i; j++) {
//                System.out.print("*");
//            }
//
//            // Print spaces
//            for (int k = 0; k < 2 * i; k++) {
//                System.out.print(" ");
//            }
//
//            // Print asterisks
//            for (int l = 0; l < n - i; l++) {
//                System.out.print("*");
//            }
//
//            // Move to the next line
//            System.out.println();
//        }
//---------------------------------------------------------



//-----------------------------alternate--incorrect----------------
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter n: ");
//        short n =sc.nextShort();
//        for(int i =1;i<=n;i++){
//            for (int j=n;j>=i;j--){
//                System.out.print("* ");
//            }
//            for(int k=1;k<=i;k++){
//                System.out.print("  ");
//            }
//            for(int l=2;l<=i;l++){
//                System.out.print("  ");
//            }
//            for(int m=n;m>=i;m--){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

//----------------------------correct------------------------------
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter n:");
//        short a=sc.nextShort();
//        for(int t=1;t<=(2*a-1);t++){
//            System.out.print("*");
//        }
//        System.out.println();
//        for(int i =1;i<=a-1;i++){
//            for(int j=a-1;j>=i;j--){
//                System.out.print("*");
//            }
//            for(int k=1;k<=i;k++){
//                System.out.print(" ");
//            }
//            for(int m=2;m<=i;m++){
//                System.out.print(" ");
//            }
//            for(int l=a-1;l>=i;l--){
//                System.out.print("*");
//            }
//            System.out.println();
//        }


/*Print the given pattern
Number Pyramid Mast
1 2 3 4 5 6 7
1 2 3   5 6 7
1 2       6 7
1           7-----------------------------------------------------------------------------------------------------------------*/
//Scanner sc = new Scanner(System.in);
//System.out.print("Enter n:");
//short a=sc.nextShort();
//short n;
//for(int p =1;p<=(a*2-1);p++){
//    System.out.print(p);
////    n++;
//}
//        System.out.println();
//for(int i=1;i<=a;i++){
//    n=1;
//    for(int j=a-1;j>=i;j--){
//        System.out.print(n);
//        n++;
//    }
//    for(int k=1;k<=i;k++){
//        System.out.print(" ");
//        n++;
//    }
//    for(int l=2;l<=i;l++){
//        System.out.print(" ");
//        n++;
//    }
//    for(int m=a-1;m>=i;m--){
//        System.out.print(n);
//        n++;
//    }
//    System.out.println();
//}



/*Print the given pattern

        Number Pyramid Mast
        A B C D E F G
        A B C   E F G
        A B       F G
        A           G--------------------------------------------------------------------------------------------------------*/
//Scanner sc = new Scanner(System.in);
//System.out.print("Enter n:");
//short a=sc.nextShort();
//char c='A';
//for(int p=1;p<=(a*2-1);p++){
//    System.out.print(c);
//    c++;
//}
//System.out.println();
//for(int i =1;i<=a;i++){
//    c='A';
//    for(int j=a-1;j>=i;j--){
//    System.out.print(c);
//    c++;
//    }
//    for(int k=1;k<=i;k++){
//        System.out.print(" ");
//        c++;
//    }
//    for(int l=2;l<=i;l++){
//        System.out.print(" ");
//        c++;
//    }
//    for(int m=a-1;m>=i;m--){
//        System.out.print(c);
//        c++;
//    }
//    System.out.println();
//}

/*Print the given pattern

Number Pyramid Mast
1 2 3 4 3 2 1
1 2 3   3 2 1
1 2       2 1
1           1-----------------------------------------------------------------------------------------------------------------*/
Scanner sc = new Scanner(System.in);
System.out.print("Enter n:");
short a=sc.nextShort();
short n=0;
for(int p=1;p<=(a*2-1);p++){
    if(p<=a) {
        n++;
        System.out.print(n);
    }
    else{
        n--;
        System.out.print(n);
    }
}
System.out.println();
for(int i =1;i<=a-1;i++){
    n=1;
    for(int j=a-1;j>=i;j--){
        n++;
        System.out.print(n);
    }
    for(int k=1;k<=i;k++){
        System.out.print(" ");
    }
    for(int l=2;l<=i;l++){
        System.out.print(" ");
    }
    for(int m=a-1;m>=i;m--){
        n--;
        System.out.print(n);
    }
    System.out.println();
}



/*Print the given pattern

Number Pyramid Mast
4 4 4 4 4 4 4
4 3 3 3 3 3 4
4 3 2 2 2 3 4
4 3 2 1 2 3 4
4 3 2 2 2 3 4
4 3 3 3 3 3 4
4 4 4 4 4 4 4--------------------------------------------------------------------------------------------------------------*/
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter n:");
//        short a=sc.nextShort();
//        short x=0;
//        short b=a;
//        for(int i =1;i<=a;i++){
//            for(int j=1;j<=a;j++){
//                if(i==(1)||j==(1)||i==(a)||j==(a)){
//                    System.out.print(b);
//                } else if (i==1+x||j==1+x||i==a-x||j==a-x) {
//                    System.out.print(b);
//                } else System.out.print(".");
//                b--;
//                x++;
//            }
//            System.out.println();
//        }
    }
}