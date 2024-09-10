import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;


// Int[] arr = new int [5];
// int[] arr ---> happens in compile time. Arr is the ref variable here
// new int[5] ---> creates the object in heap memory → Runtime(dynamic memory allocation)
// Stack memory → has all the methods, calls, variables ... etc. (primitive is stored here)


// Heap memory → c and c++ have continuous memory allocation. Java has no concept of pointers. (non - primitives are stored here)

// // 1) All the objects are in heap. So the array object is in heap.
// // 2) Heap objects are not continuous.
// // 3) Dynamic memory Allocation.
// // Hence, array objects in java are not continuous. It depends on JVM.
// // New → It is used to create an object in the heap memory.
// // Null → It is a literal. You can assign to any non-primitive data.

// for(int num : arr) (// for every element in array, print the element )
// {
//    System.out.println(num + " "); // here num represents an element of the array
// }


// toString() --> It converts to a string



// Array of Primitives
class Primitive
{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        arr[0] = 23;
        arr[1] = 43;
        arr[2] = 63;
        arr[3] = 73;
        arr[4] = 213;

        System.out.println(arr[3]);

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + "   ");
        }


        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr));
        }
    }
}

// Directly get the item
for(int num : arr) // for every element in array, print the element
{
     System.out.println(num + " "); // here num represents an element of the array
}



// Array of Objects
class ArrayObj
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String[] str = new String[4];
        for(int i=0;i<str.length;i++)
        {
            str[i] = sc.next();
        }

        System.out.println(Arrays.toString(str));
    }
}




// Array Passing in Functions
class PassingFunctions
{
    public static void main(String args[])
    {
        int[] nums = {3,4,5,6,7};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));
    }


    static void change(int[] arr)
    {
        arr[0] = 99;
    }
}



// Multidimensional Array
class Multidimensional
{

//    {1,2,3}, // 0th index
//    {4,5} // 1st index
//    {6,7,8,9} // 2nd index

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int i,j;

        int[][] arr = new int[3][3];
        for(i=0;i<3;i++)
        {
         for(j=0;j<3;j++)
         {
            arr[i][j] = sc.nextInt();
         }
        }

        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                System.out.println(arr[i][j] + " ");
            }
            System.out.println(" ");
        }

    }
}


class Multidimensional {

    public static void main(String args[]) {
          Scanner sc = new Scanner(System.in);
          int i, j;

        /*
             1 2 3
             4 5 6
             7 8 9
        */



          int[][] arr = {
                  {1, 2, 3}, // 0th index
                  {4, 5}, // 1st index
                  {6, 7, 8, 9} // 2nd index -> arr[2] = {6, 7, 8, 9}
          };

          int[][] arr = new int[3][3];

          System.out.println(arr.length);
          for (int row = 0; row < arr.length; row++) {
              for (int col = 0; col < arr[row].length; col++) {
                  arr[row][col] = sc.nextInt();
              }
          }


 //  option 1 :-
          for (int row = 0; row < arr.length; row++) {
              for (int col = 0; col < arr[row].length; col++) {
                  System.out.print(arr[row][col] + " "); // Use print instead of println for continuous output
              }
               System.out.println(" ");
          }

 //  option 2 :-
          for (int row = 0; row < arr.length; row++) {
              System.out.println(Arrays.toString(arr[row]));
          }

 //  option 3 :- enhanced for loop
          for(int[] a : arr)
          {
              System.out.println(Arrays.toString(a));
          }


      }
  }


//  If no of columns is not fixed.

// Write a Java program to demonstrate the following :-
class ColnotFixed
{
    public static void main(String args[]) {
        int[][] arr = {
                {1,2,3,4},
                {5,6},
                {7,8,9}
        };

        for(int row = 0; row < arr.length; row++)
        {
            for(int col=0;col<arr[row].length;col++)
            {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
    }
}



//Dynamic Arrays

// Array List: - See arrays are of fixed size. What if you don't know how much size, so we use an array list .  Java please handle the size . Array list is the part of the collection framework .

// 1) Size is fixed internally
// 2) let's say the array list fills by some amount
//⇒ It will create a new array list of say, double the size. Old elements are copied in a new list.

//⇒ Old one is deleted.
// Array Functions

class ArrayListExample
{
    public static void main(String args[])
    {
        // Syntax
        ArrayList<Integer> list  = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        list.add(67);
        //  list.add(8897);
        //  list.add(897);
        //  list.add(7);
        //  list.add(97);

        // print the list items
        System.out.println(list);

         // to remove an element
//        System.out.println(list.remove(2));

//        System.out.println(list);

          // to check an element
         System.out.println(list.contains(67));

        // to take input from user
        for(int i=0; i<5; i++)
        {
            list.add(sc.nextInt());
        }

        // to get item at any index
        for(int i=0; i<5; i++)
        {
            System.out.println(list.get(i));
        }


        // print the items
        System.out.println(list);




//        // to change some item (update)
//        System.out.println(list.set(0,99));

       System.out.println(list);


    }
}



// Multidimensional Array List (kunal's logic)
public class MultiAL
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new java.util.ArrayList<>();

        // initializing a list
        for(int i=0;i<3;i++) {
                list.add(new ArrayList<>());
            }


       // To get input from the user
        for(int i=0;i<3;i++) {
            for (int j = 0; j < 3; j++) {
                list.get(i).add(sc.nextInt());
            }
        }

        System.out.println(list);
    }
}




