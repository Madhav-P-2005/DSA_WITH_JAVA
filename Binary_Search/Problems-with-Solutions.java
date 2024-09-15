//Write a Java program to demonstrate Binary Search (my logic)
class Binary {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int limit, i;

        System.out.println("Enter the limit :-  ");
        limit = sc.nextInt();

        int[] arr = new int[limit];

        System.out.println("Enter the SORTED array elements :-  "); // Emphasize sorted array
        for (i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the search element in the array :- ");
        int search = sc.nextInt();

        // Logic for binary search
        int start = 0;
        int end = arr.length - 1;
        int mid = 0; // Initialize mid outside the loop

        while (start <= end) { // Corrected condition: start <= end
            mid = start + (end - start) / 2;

            if (arr[mid] == search) {
                System.out.println(search + " is found in the array at index " + mid);
                break;
            } else if (arr[mid] < search) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        // Element not found handling
        if (start > end) { // Corrected condition: start > end (element not found)
            System.out.println(search + " is not found in the array");
        }
    }
}



// Write a Java program to demonstrate Binary Search using Methods(my logic)
class Binary
{

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int limit, i;

        System.out.println("Enter the limit :-  ");
        limit = sc.nextInt();

        int[] arr = new int[limit];

        System.out.println("Enter the SORTED array elements :-  "); // Emphasize sorted array
        for (i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the search element in the array :- ");
        int search = sc.nextInt();

         binary(arr,search);

    }
        static int binary(int[] arr,int search)
        {
            // Logic for binary search
            int start = 0;
            int end = arr.length - 1;
            int mid = 0; // Initialize mid outside the loop

            while (start <= end)
            { // Corrected condition: start <= end
                mid = start + (end - start) / 2;

                if (arr[mid] == search) {
                    System.out.println(search + " is found in the array at index " + mid);
                    break;
                } else if (arr[mid] < search) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }

            // Element not found handling
            if (start > end)
            { // Corrected condition: start > end (element not found)
                System.out.println(search + " is not found in the array");
            }
            return search;
        }
}


// Write a Java program to demonstrate Binary Search using Methods(Kunal's  logic)
class BinarySearch {

    public static void main(String[] args) {
        int[] arr = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89};
        int target = 22;
        int ans = binarySearch(arr, target);
        System.out.println(ans);
    }

    // return the index
    // return -1 if it does not exist
    static int binarySearch(int[] arr, int target)
    {

        int start = 0;
        int end = arr.length - 1;


        boolean isArc = arr[start] < arr[end];

        while(start <= end) {
            // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if(arr[mid] == target)

            if(isArc)
            {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    // ans found
                    start = mid + 1;
                }
            }
            else
            {
                if(target > arr[mid])
                {
                    end = mid - 1;
                }
                else
                {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}





// Write a Java program to demonstrate the OrderAgnostic binary search for agnostic arrays using methods (kunal's logic)
class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arr = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89};
      int[] arr = {99, 80, 75, 22, 11, 10, 5, 2, -3};
        int target = 22;
        int ans = orderAgnosticBS(arr, target);
        System.out.println(ans);
    }

    static int orderAgnosticBS(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        // find whether the array is sorted in ascending or descending
        boolean isAsc = arr[start] < arr[end];

        while(start <= end) {
            // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}



// Write a Java program to demonstrate order Agnostic Binary Search using Methods(my logic and kunal's)
class Binary {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int limit, i;

        System.out.println("Enter the limit :-  ");
        limit = sc.nextInt();

        int[] arr = new int[limit];

        System.out.println("Enter the SORTED array elements :-  "); // Emphasize sorted array
        for (i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the search element in the array :- ");
        int search = sc.nextInt();

        binary(arr, search);
    }

    static void binary(int[] arr, int search) {

        int start = 0;
        int end = arr.length - 1;
        int mid = 0; // Initialize mid outside the loop

        boolean ascending = arr[start] < arr[end]; // Check ascending or descending

        boolean found = false; // Flag to track element found

        while (start <= end) { // Corrected condition: start <= end
            mid = start + (end - start) / 2;

            if (arr[mid] == search) {
                found = true; // Element found
                System.out.println(search + " is found in the array at index " + mid);
                break;
            }

            if (ascending) {
                if (arr[mid] < search) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                if (arr[mid] > search) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }

        // Element not found handling
        if (!found) { // Use !found for brevity
            System.out.println(search + " is not found in the array");
        }
    }
}