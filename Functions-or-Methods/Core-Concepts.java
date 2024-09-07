//import java.util.Scanner;
//import java.util.Arrays;

// Write a java program to demonstrate sum of two numbers using  call function
class Sum {
    public static void main(String args[]) {
        sum();
    }


    static void sum() {
        Scanner sc = new Scanner(System.in);
        int num1, num2, result = 0;
        System.out.println("Enter the first number");
        num1 = sc.nextInt();
        System.out.println("Enter the second number");
        num2 = sc.nextInt();
        result = num1 + num2;
        System.out.println("Result = " + result);
    }
}



// Write a Java program to demonstrate greetings using no return value
class Greeting
{
    public static void main(String args[])
    {
            great();
    }

    static void great()
    {
        System.out.println("Hello World");
    }
}



// Write a Java program to demonstrate the integer value of sum of numbers using return statements
class Sum
{
    public  static  void main(String args[])
    {
        int result =sum();
        System.out.println(result);
    }


    static int sum()
    {
        Scanner sc = new Scanner(System.in);
        int num1, num2, result = 0;
        System.out.println("Enter the first number");
        num1 = sc.nextInt();
        System.out.println("Enter the second number");
        num2 = sc.nextInt();
        result = num1 + num2;
        return result;

    }
}




// Write a java program to demonstrate String return ?
//import java.util.Scanner;
class StringExample
{
    public static void main(String[] args) {
        String input =string();
        System.out.println(input);
    }

    static  String string()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the your name ");
        String input = sc.next();
        return input;
    }
}

// Write a java program to demonstrate parameter String Function ?
class Sum
{
    public static void main(String[] args) {
        int result =sum(10,20);
        System.out.println(result);
    }

    static  int sum(int a , int b)
    {

       int result = a + b;
       return result;
    }
}



// Write a java program to demonstrate parameter  String Function ?
class Greeting
{
    public static void main(String[] args) {

           String gg= myGreet("madhav");
        System.out.println(gg);    // Its not necessary that the gg should be messaged only .
    }

   static  String myGreet(String name)
   {
       String message = "Hello"+name;
       return message;
   }

}



// Write a Java Program to Swap two numbers (normal without return type)
class Swap
{
    public static void main(String[] args) {
        swap();

    }

        static void swap()
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the first number");
            int a = sc.nextInt();
            System.out.println("Enter the second number");
            int b = sc.nextInt();
            int temp = a;
            a = b;
            b = temp;
            System.out.println("a = " + a + "b  = " + b);

        }

    }



// In Java there is no Pass by Reference concept only pass by value is there .


// Write a Java Program to Swap two numbers (normal without return type)
class Swap
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = sc.nextInt();
        System.out.println("Enter the second number");
        int b = sc.nextInt();
        swap(a,b);

    }

        static void swap(int a,int b)
        {

            int temp = a;
            a = b;
            b = temp;
           System.out.println("a = " + a + " b = "+b);

        }

    }




// Primitives :- int , short ,char ,byte ..... :- just passing value
// Objects and stuff :- Passing value of the reference variable

// Write a Java Program to Swap two numbers (normal without return type)
class Swap
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = sc.nextInt();
        System.out.println("Enter the second number");
        int b = sc.nextInt();
        swap(a,b);

    }

    static void swap(int a,int b)
    {

        int temp = a;
        a = b;
        b = temp;
        System.out.println("a = " + a + " b = "+b);

    }

}



// Objects and stuff :- Passing value of the reference variable
// Change value example

class ChangeValue
{
    public static void main(String[] args) {
        // create an array
        int[] arr = {1, 3, 2, 45, 6};
        change(arr);
        System.out.println(Arrays.toString(arr));


    }
    static void change(int[] nums){
        nums[0] = 99; // if you make a change to the object via this ref variable .
    }
}



// Anything initialized outside the block can be used inside the block .
// But Anything initialized inside the block cannot be used outside.
// Similarly, anything initialized outside the block cannot be again initialized inside the block
// But anything initialized inside the block can be definitely initialized outside the block

//Scope
class Scope
{
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        {
            //int a = 78; // Already initialised outside the block in the same method ,  hence you cannot initialise again
            a = 100; // reassign the origin ref variable to some other value
            System.out.println(a);
            int c = 90;
            // Values initialised in this block, will remain in block
        }
        System.out.println(a);
      //  System.out.println(c); // cannot use outside the block

    }

    static void randowm(int marks)
    {
        int num = 67;
        System.out.println(num);
        System.out.println(marks);
    }
}


// Write a java program to demonstrate the concept of Shadowing
// Shadowing in Java :- It is a practice of using two variables with the same name within the Scope that overlaps
// Shadowing effect does not take place in Methods .


class Shadowing
{
    static  int x = 90;

    public static void main(String[] args)
    {
        System.out.println(x); // 90
        int x; // the class variable at line 4 is shadowed by this (declaring)
//        System.out.println(x); // Scope will begin when value is initialised
        x = 40; // initializing
        System.out.println(x); // 40
        fun();
    }


    static void fun()
    {
        System.out.println(x);
    }
}



// Write a java program to demonstrate the  Variable Arguments
class VarArgs
{
    public static void main(String[] args)
    {
        fun(2,3,4,5,6,6);
    }

    static void fun(int ...v)
    {
        System.out.println(Arrays.toString(v));
    }
}



class VarArgs2
{
    public static void main(String[] args)
    {
        fun(2,3,"kunal" , "madhav");
    }

    static void fun(int a,int b,String  ...v)
    {
        System.out.println(Arrays.toString(v));
        System.out.println(v);
    }
}




// Write a java Program to demonstrate Function Overloading
class VarArgs3
{
    public static void main(String[] args)
    {
        fun(2,3,"kunal" , "madhav");
       demo(); // no provided any data so error occurs .
    }

    static  void demo(int ...v)
    {
        System.out.println(Arrays.toString((v)));
    }

    static  void demo(String ...v)
    {
        System.out.println(Arrays.toString((v)));
    }

    static void fun(int a,int b,String  ...v)
    {
        System.out.println(Arrays.toString(v));
        System.out.println(v);
    }
}

// // Write a java Program to demonstrate Function Overloading (kunal's logic)
public class VarArgs3 {
    public static void main(String[] args) {

//        fun();
//        multiple(2, 3, "Kunal", "Rahul", "dvytsbhusc");
//        demo();
    }

    static void demo(int ...v) {
        System.out.println(Arrays.toString(v));
    }

    static void demo(String ...v) {
        System.out.println(Arrays.toString(v));
    }

    static void multiple(int a, int b, String ...v) {

    }

    static void fun(int ...v) {
        System.out.println(Arrays.toString(v));
    }
}
