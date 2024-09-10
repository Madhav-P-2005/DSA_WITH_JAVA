import java.util.Scanner;
import java.util.Arrays;


// Write a Java program to find the search element in an array (my logic)
class Linear
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int i, limit, search;


        System.out.println("Enter the limit :-  ");
        limit = sc.nextInt();

        int[] num = new int[limit];

        System.out.println("Enter the array elements :-  ");
        for (i = 0; i < limit; i++)
        {
            num[i] = sc.nextInt();
        }


        System.out.println("Enter your search element :-  ");
        search = sc.nextInt();

        for (i = 0; i < limit; i++)
        {
            if (search == num[i])
            {
                System.out.println(search + "is present in the array");
                break;
            }
        }
        if(i==limit)
            System.out.println(search + "is not present in the array");


    }

}



// Write a Java program to find the search element in an array using methods? (Kunal's logic)
class Linear
{
    public static void main(String args[])
    {


        int[] nums = {23, 45, 1, 2, 8, 19, -3, 16, -11, 28};
        int target = 19;

        int ans = linearSearch(nums, target);


        System.out.println(ans + "is present in the array");
    }


    static int linearSearch(int[] arr, int target)
    {
        int index;


        if(arr.length==0)
        {
            return -1;
        }


        for (index = 0; index < arr.length; index++)
        {
            int element = arr[index];
            if(element == target)
                return index;


        }
        return -1;
    }
}



// Write a Java program to find the search element in an array  by using Methods (my logic)
class Linear {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int search, limit;

        System.out.println("Enter the limit");
        limit = sc.nextInt();


        int[] num = new int[limit];
        System.out.println("Enter the array elements :-  ");
        for (int i = 0; i < limit; i++) {
            num[i] = sc.nextInt();
        }

        System.out.println("Enter your search element :-  ");
        search = sc.nextInt();


        LinearSearch(num, search);


    }

    static int LinearSearch(int[] num, int search) {
        int i;

        for (i = 0; i < num.length; i++) {
            if (search == num[i]) {
                System.out.println(search + "is present in the array");
                break;
            }
        }


        if (i == num.length) {

            System.out.println(search + "is not present in the array");
        }

        return search;

    }

}



class Linear {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int search;

        System.out.println("Enter your search element :-  ");
        search = sc.nextInt();

        int[] num = getArrayElements(search); // Call method to get array and limit

        LinearSearch(num, search);
    }

    static int[] getArrayElements(int search) {
        Scanner sc = new Scanner(System.in);
        int limit;

        System.out.println("Enter the limit");
        limit = sc.nextInt();

        int[] num = new int[limit];

        System.out.println("Enter the array elements :-  ");
        for (int i = 0; i < limit; i++) {
            num[i] = sc.nextInt();
        }

        return num; // Return the created array
    }

    static void LinearSearch(int[] num, int search) {
        for (int i = 0; i < num.length; i++) {
            if (search == num[i]) {
                System.out.println(search + " is present in the array");
                break;
            }
        }

        if (i == num.length) { // Check after the loop completes
            System.out.println(search + " is not present in the array");
        }
    }
}




//  Write a java program to Search a character in an Array String of elements using Methods (Kunal's logic)
class Demo
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int i;
        System.out.println("Enter the string :- ");
        String input = sc.nextLine();

        System.out.println("Enter the Character you want to search :- ");
        char ch = sc.next().charAt(0);



        for(i=0;i<input.length();i++)
        {
            if(ch==input.charAt(i))
            {
                System.out.println(ch+"is present in the string");
                break;
            }
        }


        if(i==input.length())
            System.out.println(ch+"is not present in the string");

    }

}



// Write a java program to  Search a character in an Array String of elements  using Methods ?(my logic)
class Demo {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int i;
        System.out.println("Enter the string :- ");
        String input = sc.nextLine();

        System.out.println("Enter the Character you want to search :- ");
        char ch = sc.next().charAt(0);

        linear(input,ch);
    }

    static String linear(String input, char ch)
    {
        int i;

        for (i = 0; i < input.length(); i++) {
            if (ch == input.charAt(i)) {
                System.out.println(ch + " is present in the string ");
                break;
            }
        }


        if (i == input.length())
            System.out.println(ch + " is not present in the string ");

        return input;

    }
}


// Write a java program to Search a character in an Array String of elements using Methods ?(Kunal's logic)
class Linear
{
    public static void main(String[] args)
    {
        String name = "Kunal";
        char target = 'u';
        System.out.println(search(name, target));
        //System.out.println(Arrays.toString(name.toCharArray()));
    }



//    static boolean search2(String str,char target)
//    {
//        if(str.length()==0)
//        {
//            return false;
//        }
//
          // for each
//        for(char ch : str.toCharArray())
//        {
//            if(ch==target)
//            {
//                return true;
//            }
//        }
//
//        return false;
//    }




    static boolean search(String str,char target)
    {
        if(str.length()==0)
        {
            return false;
        }

        for(int i=0;i<str.length();i++)
        {
            if(target==str.charAt(i))
            {
                return true;
            }
        }

        return false;
    }
}


// Write a java program to Search in Range of the array elements ?(my logic )
class Range
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int limit  ,i, search;

        System.out.println("Enter your range :-  ");
        limit = sc.nextInt();

        int[] arr = new int[limit];

        System.out.println("Enter your array elements :-  ");
        for(i=0;i<limit;i++)
        {
            arr[i]= sc.nextInt();
        }

        System.out.println("Enter your start location to search :-  ");
        int start = sc.nextInt();

        System.out.println("Enter your end location to search :-  ");
        int end = sc.nextInt();


        System.out.println("Enter the search element you want to find :-  ");
        search = sc.nextInt();



        // logic
        for(i=start;i<=end;i++)
        {
            if (i < 0 || i >= arr.length) {
                System.out.println(search + " is out of bounds");
                break;
            }
            if (arr[i] == search) {
                System.out.println(search + " is present in the array");
                break;
            }
            else
            if(i==end)
                System.out.println(search + "is not present in the array");

        }


    }
}


// Write a java program to Search in Range of the array elements using method ?(my logic)
class Range
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int limit, i,search;

        System.out.println("Enter your range :-  ");
        limit = sc.nextInt();

        int[] arr = new int[limit];

        System.out.println("Enter your array elements :-  ");
        for (i = 0; i < limit; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the search element you want to find :-  ");
        search = sc.nextInt();

        range(arr,search);

    }

        static int range(int[] arr,int search)
        {

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your start location to search :-  ");
            int start = sc.nextInt();

            System.out.println("Enter your end location to search :-  ");
            int end = sc.nextInt();





            // logic
            for (int i = start; i <= end; i++) {
                if (i < 0 || i >= arr.length) {
                    System.out.println(search + " is out of bounds");
                    break;
                }
                if (arr[i] == search) {
                    System.out.println(search + " is present in the array");
                    break;
                } else if (i == end)
                    System.out.println(search + "is not present in the array");

            }

            return search;
        }
}



//  Write a java program to  Search in a Range of array elements using Methods? (kunal 's logic)
class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {18, 12, -7, 3, 14, 28};
        int target = 12;
        System.out.println(linearSearch(arr, target, 1, 4));
    }

    static int linearSearch(int[] arr, int target, int start, int end) {
        if (arr.length == 0) {
            return -1;
        }

        // run a for loop
        for (int index = start; index <= end; index++) {
            // check for element at every index if it is = target
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }
        // this line will execute if none of the return statements above have executed
        // hence the target not found
        return -1;
    }
}


// Write a java program to find the minimum number in an array
class Min
{
    public static void main(String[] args) {
        int limit,i;

        Scanner sc =new Scanner(System.in);

        System.out.println("Enter the limit :- ");
        limit = sc.nextInt();

        int[] arr = new int[limit];
        System.out.println("Enter the array elements : - ");
        for(i=0;i<limit;i++)
        {
            arr[i] = sc.nextInt();
        }

        // logic
    int min = arr[0];
        for(i=0;i<limit;i++)
        {
            if(arr[i]<min)
            {
                min = arr[i];
            }

        }

        System.out.println(min + "is the minimum value in the array ");

    }
}



// Write a java program to find the minimum number in an array using methods (my logic)
class Min
{
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);
        int i,limit;


        System.out.println("Enter the limit :- ");
        limit = sc.nextInt();

        int[] arr = new int[limit];
        int min = arr[0];
        System.out.println("Enter the array elements : - ");
        for (i = 0; i < limit; i++)
        {
            arr[i] = sc.nextInt();
        }
            minimum(arr,min);


    }
        static int minimum(int[] arr,int mini)
        {
            int i;
            // logic
            mini = arr[0];
            for (i = 0; i < arr.length; i++)
            {
                if (arr[i] < mini) {
                    mini = arr[i];
                }

            }

            System.out.println(mini + "is the minimum value in the array ");

            return mini;
        }

}


// Write a java program to find the minimum number in an array using methods ? (kunal's logic)
class FindMin {
    public static void main(String[] args) {
        int[] arr = {18, 12, 7, 3, 14, 28};
        System.out.println(min(arr));
    }

    // assume arr.length != 0
    // return the minimum value in the array
    static int min(int[] arr) {
        int ans = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < ans) {
                ans = arr[i];
            }
        }
        return ans;
    }
}



// Write a java program of 2d array to search an item ?  (my logic)
class Searchin2Darray
{
    public static void main(String[] args) {
        int r,c,i,j = 0;

        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the row numbers :- ");
        r = sc.nextInt();

        System.out.println("Enter the column numbers :- ");
        c =sc.nextInt();

        int[][] arr = new int[r][c];
        System.out.println("Enter tha array elements :- ");

        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Displaying tha array elements :- ");

        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("Enter the search element :-  ");
        int search = sc.nextInt();

        //logic
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                if(arr[i][j]==search)
                {
                    System.out.println(search + "is found in the 2 D array");
                    return;
                }
            }
        }

            System.out.println(search + "is not found in the 2D Array");

    }

}



// Write a java program of 2d array to search an item using Methods (my logic)
class Searchin2Darray {
    public static void main(String[] args) {
        int r, c, i, j;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the row numbers :- ");
        r = sc.nextInt();

        System.out.println("Enter the column numbers :- ");
        c = sc.nextInt();

        int[][] arr = new int[r][c];
        System.out.println("Enter the array elements :- ");

        for (i = 0; i < r; i++) {
            for (j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the search element :-  ");
        int search = sc.nextInt();

        int found = search2d(arr, search);

        if (found == -1) {
            System.out.println(search + " is not found in the 2D array");
        } else {
            System.out.println(search + " is found in the 2D array");
        }
    }

    static int search2d(int[][] arr, int search) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == search) {
                    return 0; // Element found, return 0 (arbitrary value)
                }
            }
        }

        return -1; // Element not found, return -1
    }
}





// Write a java program of 2d array to search an item using Methods (kunal's logic)
class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {23, 4, 1},
                {18, 12, 3, 9},
                {78, 99, 34, 56},
                {18, 12}
        };
        int target = 56;
        int[] ans = search(arr,target); // format of return value {row, col}
        System.out.println(Arrays.toString(ans));

        System.out.println(max(arr));

        System.out.println(Integer.MIN_VALUE);
    }

    static int[] search(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1, -1};
    }

    //  to check the maximum of the array
    static int max(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for (int[] ints : arr) {
            for (int element : ints) {
                if (element > max) {
                    max = element;
                }
            }
        }
        return max;
    }
}






// Write a Java program to find Numbers with Even Numbers of Digits (kunal's logic)
class EvenDigits {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
//        System.out.println(findNumbers(nums));

        System.out.println(digits2(-345678));
    }
    static int findNumbers(int[] nums) {
        int count = 0;
        for(int num : nums) {
            if (even(num)) {
                count++;
            }
        }
        return count;
    }

    // function to check whether a number contains even digits or not
    static boolean even(int num) {
        int numberOfDigits = digits(num);
        /*
        if (numberOfDigits % 2 == 0) {
            return true;
        }
        return false;
         */
        return numberOfDigits % 2 == 0;
    }

    static int digits2(int num) {
        if (num < 0) {
            num = num * -1;
        }
        return (int)(Math.log10(num)) + 1;
    }

    // count number of digits in a number
    static int digits(int num) {

        if (num < 0) {
            num = num * -1;
        }

        if (num == 0) {
            return 1;
        }

        int count = 0;
        while (num > 0) {
            count++;
            num = num / 10; // num /= 10
        }

        return count;
    }
}



//Write a Java program to find Numbers with Even Numbers of Digits (my logic)
class EvenDigitNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the number of elements
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        // Declare an array to store the numbers
        int[] numbers = new int[n];

        // Get the numbers from the user
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        int evencounter = 0;
        System.out.println("Numbers with an even number of digits:");

        // Check each number for an even number of digits
        for (int i = 0; i < n; i++) {
            int num = numbers[i];
            int count = 0;

            // Count the digits
            while (num != 0) {
                num = num / 10; // Remove the last digit
                count++;// Increment the digit count
            }


            // Check if the count of digits is even
            if (count % 2 == 0) {
               evencounter++;
            }

        }
        System.out.println(evencounter);
        scanner.close();
    }
}






// Write a java program to demonstrate the no of even digit numbers in an array using Methods(my logic)
class EvenDigitNumbers {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

       int  evencounter = 0;

        // Ask the user for the number of elements
        System.out.print("Enter the number of elements limit: ");
        int limit = scanner.nextInt();

        // Declare an array to store the numbers
        int[] arr = new int[limit];

        // Get the numbers from the user
        System.out.println("Enter " + limit + " numbers:");
        for (int i = 0; i < limit; i++) {
            arr[i] = scanner.nextInt();
        }
        int ans =countevennos(arr,evencounter);
        System.out.println(ans);
    }

        static int countevennos(int[] arr,int evencounter)
        {

        System.out.println("Numbers with an even number of digits:");

        // Check each number for an even number of digits
        for (int i = 0; i < arr.length; i++)
        {
            int num = arr[i];
            int count = 0;

            // Count the digits
            while (num != 0) {
                num = num / 10; // Remove the last digit
                count++;// Increment the digit count
            }


            // Check if the count of digits is even
            if (count % 2 == 0) {
                evencounter++;
                System.out.println(arr[i]);
            }
        }
        return evencounter;
    }
}


// https://leetcode.com/problems/richest-customer-wealth/
public class MaxWealth {
    public static void main(String[] args) {

    }
    public int maximumWealth(int[][] accounts) {
        // person = rol
        // account = col
        int ans = Integer.MIN_VALUE;
        for (int[] ints : accounts) {
            // when you start a new row, take a new sum for that row
            int sum = 0;
            for (int anInt : ints) {
                sum += anInt;
            }
            // now we have sum of accounts of person
            // check with overall ans
            if (sum > ans) {
                ans = sum;
            }
        }
        return ans;
    }
}