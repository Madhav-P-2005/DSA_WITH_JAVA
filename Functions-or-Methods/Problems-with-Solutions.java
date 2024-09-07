import  java.util.Scanner;

// Write a Java program to find the prime number (my logic)?
class Prime
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int count = 0, num,i;
        System.out.println("Enter any number ");
        num = sc.nextInt();
        for(i=1;i<=num;i++)
        {
            if(num%i==0)
            {
                count++;

            }
        }
        if(count == 2)
        {
            System.out.println(num + "Is a Prime number");
        }
        else
        {
            System.out.println(num + "Is not a prime number");
        }
    }
}



// Write a Java program to find the prime number using methods (my logic)?
class Prime
{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int  num;
        System.out.println("Enter any number ");
        num = sc.nextInt();
         prime(num);
    }

        static int prime(int a) {
            int count = 0, i;
            for (i = 1; i <= a; i++)
            {
                if(a%i==0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.println(a + " is a prime number");

            } else {
                System.out.println(a + " is not a prime number ");
            }
            return 0;
        }
}



// Write a Java program to find the prime number using boolean method (kunal's logic)?
class Prime
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean ans = isPrime(n);
        System.out.println(ans);
    }




    static  boolean isPrime(int n)
    {
        if(n<=1)
        {
            return false;
        }
        int c = 2;
        while(c * c <= n)
        {
            if(n%c==0)
            {
                return  false;
            }
            c++;
        }
        return c * c > n;

    }
}


// Write a java program to check whether a number is Armstrong or not (my logic)?
class Armstrong
{
    public static void main(String[] args) {
        int add=0 , num , remainder,temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Number ");
        num = sc.nextInt();

        temp = num;
        while(num > 0)
        {
            remainder = num % 10;
            add = (remainder*remainder*remainder)+add;
            num = num / 10;
        }
        if(add == temp)
            System.out.println("It is a Armstrong Number");
        else
            System.out.println("It is not a Armstrong Number");

    }
}



// Write a java program to check whether a number is Armstrong or not using Methods (my logic)?
class Armstrong
{
    public static void main(String[] args) {
        int  num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Number ");
        num = sc.nextInt();
        arms(num);
    }


    static int arms(int num)
        {
             int temp , remainder,add=0;
            temp = num;
            while(num > 0)
            {
                remainder = num % 10;
                add = (remainder*remainder*remainder)+ add;
                num = num / 10;
            }

            if(add==temp)
                System.out.println("It is a Armstrong Number");
            else
                System.out.println("It is not a Armstrong Number");

            return 0;
        }
}



// Write a java program to print all the 3 digits armstrong numbers using Methods (Kunal's logic)?
class Questions
{
    public static void main(String[] args)
    {
        int  num,i,n;
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
        for(i=100; i<=999;i++)
        {
            if(isArmstrong(i))
            {
                System.out.println(isArmstrong(i));
            }
        }
    }


    // print all the 3 digits armstrong numbers
    static boolean isArmstrong(int n)
    {
        int original = n;
        int sum = 0;

        while(n>0)
        {
            int rem = n%10;
            n = n/10;
            sum = sum + rem*rem*rem;
        }

        return sum==original;
    }
}