import java.util.Scanner;
 /*
            Syntax of for loops:

            for (initialisation; condition; increment/decrement) {
                // body
            }
        */


// Q1) Print numbers from 1 to 5 using for loop (my logic)
class ForLoop
{
      public static void main(String args[])
      {
          for (int num = 1; num <= 5; num++)
          {
              System.out.println(num);
          }
      }
}

// Q2) Print  Hello world  from 1 to n times (my logic)
class Forloop
{
    public  static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int num=1 ; num<= n; num++)
        {
            System.out.println("Hello World");
        }
    }
}


// while loops
        /*
            Syntax:
            while (condition) {
                // body
            }
         */



// Write a while loop program to demonstrate printing from 1 to 5(my logic)
class WhileLoop
{
    public  static  void  main(String args[])
    {
        int i = 1;
        while(i<=5)
        {
            System.out.println(i);
            i++;
        }
    }
}



// do while
/*

            do {
                // body
            } while (condition);

*/


// Kunal's logic
public class Loops {
    public static void main(String[] args) {



        // Q: Print numbers from 1 to 5
//        for (int num = 1; num <= 5; num += 2) {
//            System.out.println(num);
//        }

        // print numbers from 1 to n
        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();

//        for (int num = 1; num <= n; num++) {
////            System.out.print(num + " ");
//            System.out.println("Hello World");
//        }



//        for (int num = 1; num <= 5; num += 2) {
//            System.out.println(num);
//        }

        int num  = 1;
        while (num <= 5) {
//            System.out.println(num);
            num += 1;
        }


        int n = 1;
        do {
            System.out.println("Hello World");
        } while (n != 1);

    }
}


