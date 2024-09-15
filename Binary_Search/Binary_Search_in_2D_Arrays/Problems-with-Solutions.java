import java.util.Scanner;
import java.util.Arrays;

// Write a java program to demonstrate the Row Col Sorted Matrix in binary search (my logic)
class MatrixSorted
{
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);
        int row , col , search,i,j;


        System.out.println("Enter your row  number :-  ");
        row = sc.nextInt();
        System.out.println("Enter your col number : -  ");
        col = sc.nextInt();

        int[][] arr = new int[row][col];
        System.out.println("Enter your array elements :-  ");
        for(i = 0;i<row;i++)
        {
            for(j=0;j<col;j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }


        System.out.println("Displaying the array elements :-  ");
        for( i = 0;i<row;i++)
        {
            for( j=0;j<col;j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }


        System.out.println("Enter the element you want to search :-  ");
        search = sc.nextInt();

        int found = 0;
        // logic in binary search in matrix where the rols and cols are sorted


        i =0;
        j = col-1;
        while(i<row && j>=0)
        {
            if(arr[i][j] == search)
            {
                found=1;
                break;
            }
            if(arr[i][j] < search)
            {
                i++;
            }
            else {
                j--;
            }
        }

        if(found == 1) {
            System.out.println(search + " item is found ");
        }
        else {
            System.out.println(search + " is not found ");
        }

    }
}


// Write a java program to demonstrate the Row Col Sorted Matrix in binary search using Methods (my logic)
class MatrixSorted
{
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);
        int row, col;



        System.out.println("Enter your row  number :-  ");
        int rows = sc.nextInt();
        System.out.println("Enter your col number : -  ");
       int  cols = sc.nextInt();

        int[][] arr = new int[rows][cols];
        System.out.println("Enter your array elements :-  ");
        for (row = 0; row < rows; row++) {
            for (col= 0; col <cols; col++) {
                arr[row][col] = sc.nextInt();
            }
        }


        System.out.println("Displaying the array elements :-  ");
        for (row = 0; row < rows; row++) {
            for (col = 0; col < cols; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }


        System.out.println("Enter the element you want to search :-  ");
        int search = sc.nextInt();


      int result  = matrixrowcol(arr,search);
      if(result==1)
      {
          System.out.println(search + " is found");
      }
      else
      {
          System.out.println(search + " not found ");
      }


    }


        static int matrixrowcol(int[][] arr,int search)
        {


           boolean found = false;
            // logic in binary search in matrix where the rols and cols are sorted

            int row = 0;
            int col = arr.length - 1;
            while (row < arr.length && col >= 0) {
                if (arr[row][col] == search) {
                    found = true;
                    break;
                }
                if (arr[row][col] < search) {
                    row++;
                } else {
                    col--;
                }
            }
            return found ? 1 : 0;
        }

    }


// Write a java program to demonstrate the Row Col Sorted Matrix in binary search using Methods (by Kunal)
class RowColMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {28, 29, 37, 49},
                {33, 34, 38, 50}
        };

        System.out.println(Arrays.toString(search(arr, 49)));
    }

    static int[] search(int[][] matrix, int target) {
        int r = 0;
        int c = matrix[0].length - 1;

        while (r < matrix.length && c >= 0) {
            if (matrix[r][c] == target) {
                return new int[]{r, c};
            }
            if (matrix[r][c] < target) {
                r++;
            } else {
                c--;
            }
        }
        return new int[]{-1, -1};





//Write a java program to demonstrate the Sorted Matrix in binary Search using Methods(kunal's logic )
class SortedMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println(Arrays.toString(search(arr, 9)));
    }

    // search in the row provided between the cols provided
    static int[] binarySearch(int[][] matrix, int row, int cStart, int cEnd, int target) {
        while (cStart <= cEnd) {
            int mid = cStart + (cEnd - cStart) / 2;
            if (matrix[row][mid] == target) {
                return new int[]{row, mid};
            }
            if (matrix[row][mid] < target) {
                cStart = mid + 1;
            } else {
                cEnd = mid - 1;
            }
        }
        return new int[]{-1, -1};
    }

    static int[] search(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length; // be cautious, matrix may be empty
        if (cols == 0){
            return new int[] {-1,-1};
        }
        if (rows == 1) {
            return binarySearch(matrix,0, 0, cols-1, target);
        }

        int rStart = 0;
        int rEnd = rows - 1;
        int cMid = cols / 2;

        // run the loop till 2 rows are remaining
        while (rStart < (rEnd - 1)) { // while this is true it will have more than 2 rows
            int mid = rStart + (rEnd - rStart) / 2;
            if (matrix[mid][cMid] == target) {
                return new int[]{mid, cMid};
            }
            if (matrix[mid][cMid] < target) {
                rStart = mid;
            } else {
                rEnd = mid;
            }
        }

        // now we have two rows
        // check whether the target is in the col of 2 rows
        if (matrix[rStart][cMid] == target) {
            return new int[]{rStart, cMid};
        }
        if (matrix[rStart + 1][cMid] == target) {
            return new int[]{rStart + 1, cMid};
        }

        // search in 1st half
        if (target <= matrix[rStart][cMid - 1]) {
            return binarySearch(matrix, rStart, 0, cMid-1, target);
        }
        // search in 2nd half
        if (target >= matrix[rStart][cMid + 1] && target <= matrix[rStart][cols - 1]) {
            return binarySearch(matrix, rStart, cMid + 1, cols - 1, target);
        }
        // search in 3rd half
        if (target <= matrix[rStart + 1][cMid - 1]) {
            return binarySearch(matrix, rStart + 1, 0, cMid-1, target);
        } else {
            return binarySearch(matrix, rStart + 1, cMid + 1, cols - 1, target);
        }
    }
}