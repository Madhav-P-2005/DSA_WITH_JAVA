import java.util.Arrays;
import java.util.Scanner;

// Write a Java program to demonstrate swapping of arrays (my logic)
class  Swap
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i,j;
        int size;
        System.out.println("Enter the size of array");
        size = sc.nextInt();

        int[] arr1 = new int[size];
        int[] arr2 = new int[size];
        System.out.println("Enter the elements to array1");
        for(i=0;i<size;i++)
        {
            arr1[i] = sc.nextInt();
        }


        System.out.println();

        System.out.println("Elements of array1 before swapping ");
        for(i=0;i<size;i++)
        {
            System.out.print(arr1[i]+" ");
        }

        System.out.println();

        System.out.println("Enter the elements to array2");
        for(i=0;i<size;i++)
        {
            arr2[i] = sc.nextInt();
        }


        System.out.println("Elements of array2 before swapping ");
        for(i=0;i<size;i++)
        {
            System.out.print(arr2[i]+" ");
        }

        System.out.println();
        // logic
        for(i=0;i<size;i++)
        {
            int temp = arr1[i];
            arr1[i] = arr2[i];
            arr2[i] = temp;
        }

        // Elements of array1 after swapping
        System.out.println("Elements of array1 after swapping ");
        for(i=0;i<size;i++)
        {
            System.out.print(arr1[i]+" ");
        }

        System.out.println();
        // Elements of array2 after swapping
        System.out.println("Elements of array2 after swapping ");
        for(i=0;i<size;i++)
        {
            System.out.print(arr2[i]+" ");
        }

    }
}


// Swap the elements with the array (my logic)
class Swap
{
    public static void main(String[] args)
    {
        int size, i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size");
        size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter the array elements");
        for (i = 0; i < size; i++) {
            {
                arr[i] = sc.nextInt();
            }
        }

        System.out.println();

        System.out.println("Array elements before swapping");
        for (i = 0; i < size; i++) {
            {
                System.out.println(arr[i]);
            }
        }
        System.out.println();

        // logic
        for (i = 0; i < size-1; i++)
        {
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }


        System.out.println("Array elements after swapping");
        for (i = 0; i < size; i++)
        {
            {
                System.out.println(arr[i]);
            }
        }
    }
}



// Swapping the array elements in methods (kunal's way)
class Swap {
    public static void main(String agrs[])
    {
        int arr[] = {1,3,23,9,18};
        swap(arr,0,4);
        System.out.println(Arrays.toString(arr));
    }


    static void reverse(int[] arr)
    {
        int start = 0;
        int end = arr.length-1;

        while (start < end)
        {
            // swap
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    static void swap(int[] arr,int index1,int index2)
    {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}




// Maximum Value of an Array(my logic)
class Max
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int large = 0,size;
        System.out.println("Enter the size");
        size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter the array elements");
        for(int i=0;i<size;i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.println("The Array elements are : - ");
        for(int i=0;i<size;i++)
        {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        // logic
        for(int i=0;i<size;i++)
        {
            if(arr[i]>large)
            {
                large = arr[i];
            }
        }

        System.out.println("The Maximum element of the array is "+ large);
    }
}




//Find Maximum Array of an array using Methods (my logic)
 class Max
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size: ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter the array elements: ");

        for (int i = 0; i < size; i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.println(max(arr));

    }

    static int max(int[] arr)
    {
        int large = arr[0]; // Initialize large with the first element
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] > large) {
                large = arr[i];
            }
        }
        return large;
    }

}



// Write a java program to find the Maximum array element in an array (kunal's logic)
public class Max {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 9, 18};
        System.out.println(maxRange(arr, 1, 3));
    }

    // work on edge cases here, like array being null
    static int maxRange(int[] arr, int start, int end) {

        if (start > end) {
            return -1;
        }

        if (arr == null) {
            return -1;
        }

        int maxVal = arr[start];
        for (int i = start; i <= end; i++) {
            if (arr[i] > maxVal) {
                maxVal = arr[i];
            }
        }
        return maxVal;
    }

    static int max(int[] arr) {
        if (arr.length == 0) {
            return -1;
        }
        int maxVal = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxVal) {
                maxVal = arr[i];
            }
        }
        return maxVal;
    }
}



// Write a java program to reverse an array? (my logic)
class Rev
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int size,i;


        System.out.println("Enter the size of the array");
        size = sc.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter  the array elements");
        for(i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }

        System.out.println("Elements before array reverse");
        for(i=0;i<size;i++)
        {
            System.out.println(arr[i]);
        }


        // logic
        int start = 0;
        int end = size - 1;
        while(start<end)
        {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }


        for(i=0;i<size;i++)
        {
            System.out.println(arr[i]);
        }
    }
}


// Write a java program to reverse an array using methods? (kunal's logic)
class rev
{
    public static void main(String args[])
    {
        int[] arr = {1, 3, 23, 9, 18};

        reverse(arr);
        System.out.println(arr);

    }


    static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end)
        {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}