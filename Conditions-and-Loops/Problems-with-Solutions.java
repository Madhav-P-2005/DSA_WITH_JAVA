import  java.util.Scanner;


// Write a Java program to demonstrate the Biggest of three Numbers (My logic)
class Large
{
    public  static  void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value for num1 = ");
        int num1 =  sc.nextInt();

        System.out.println("Enter the value for num2 = ");
        int num2 = sc.nextInt();

        System.out.println("Enter the value for num3 = ");
        int num3 = sc.nextInt();


        if(num1>=num2 && num1>=num3)
        {
            System.out.println("The Biggest number is  = " + num1);
        }
        else if(num2>=num1 && num2>=num3)
        {
            System.out.println("The Biggest number is  = " + num2);
        }
        else if(num3>=num1 && num3>=num2)
        {
            System.out.println("The Biggest number is = "+num3);
        }
        else
        {
            System.out.println("They are equal or invalid");
        }

    }
}


// Write a Java program to demonstrate the Biggest of three Numbers ( My logic 2)
class Large2
{
    public  static  void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value for num1 = ");
        int num1 =  sc.nextInt();

        System.out.println("Enter the value for num2 = ");
        int num2 = sc.nextInt();

        System.out.println("Enter the value for num3 = ");
        int num3 = sc.nextInt();


        if(num1>=num2)
        {
            if(num1>=num3)
            {
                System.out.println(num1 + "is the biggest");
            }
            else
            {
                System.out.println(num2 + "is the biggest");
            }
        }
        else
        {
            if(num2>=num3)
            {
                System.out.print(num2+"is the Biggest");
            }
            else
            {
                System.out.println(num3 + "is the biggest");
            }

        }

    }
}



//Write a Java program to demonstrate the Biggest of three Numbers (Kunal 's  logic  1)
public class Large3
{
    public  static  void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value for num1 = ");
        int num1 = sc.nextInt();

        System.out.println("Enter the value for num2 = ");
        int num2 = sc.nextInt();

        System.out.println("Enter the value for num3 = ");
        int num3 = sc.nextInt();


        int max = num1;
        if(num2>max)
        {
            max=num2;
        }
        if(num3>max)
        {
            max=num3;
        }
        System.out.println(max + "is the biggest among them");

    }
}



//Write a Java program to demonstrate the Biggest of three Numbers (Kunal 's  logic 2 )
public class Large4
{
    public  static  void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value for num1 = ");
        int num1 = sc.nextInt();

        System.out.println("Enter the value for num2 = ");
        int num2 = sc.nextInt();

        System.out.println("Enter the value for num3 = ");
        int num3 = sc.nextInt();


       int max = 0;
      if(num1>num2)
      {
          max=num1;
      }
      else
      {
          max=num2;
      }
      if(num3>max)
      {
          max=num3;
      }
       System.out.println(max + "is the biggest among them");

    }
}


//Write a Java program to demonstrate the Biggest of three Numbers (Kunal 's logic 3)
public class Large5
{
    public  static  void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value for num1 = ");
        int num1 = sc.nextInt();

        System.out.println("Enter the value for num2 = ");
        int num2 = sc.nextInt();

        System.out.println("Enter the value for num3 = ");
        int num3 = sc.nextInt();

        int max = Math.max(num3 , (Math.max(num1 , num2)));

        System.out.println(max + "IS THE BIGGEST NUMBER");

    }
}



// Write a Java program to check wheather a character is Uppercase or Lowercase ( my logic)
class Char
{
    public  static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any single Character = ");
        char input = sc.next().charAt(0);

        if(input>='A' && input<='Z')
        {
            System.out.println(input + "is a Uppercase character");
        }
        else if(input>='a' && input<='z')
        {
            System.out.println(input + "is a lowercase character");
        }
        else if(input>='0' && input<='9')
        {
            System.out.println(input + "is a digit");
        }
        else
        {
            System.out.println("Its a special case character");
        }
    }
}


// Write a Java program to check wheather a character is Uppercase or Lowercase (kunal 's logic)
public class CaseCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char ch = in.next().trim().charAt(0);

        if (ch >= 'a' && ch <= 'z') {
            System.out.println("Lowercase");
        } else {
            System.out.println("Uppercase");
        }

    }
}


// Write a Java program to find the nth  fibonacci numbers (my logic)(Extra)
class fib
{
    public static void main(String args[])
    {
        int i,a=0,b=1,c=0,range;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your  nth fibonnaci number you need ");
        range = sc.nextInt();
        System.out.println("The fibonacci Numbers are = ");
        System.out.println(a);
        System.out.println(b);
        for(i=2;i<=range;i++)
        {
            c = a+b;
            System.out.println(c);
            if(c==range)
            {
                System.out.println(c + "the nth fibonnacci number");
            }
            a=b;
            b=c;
        }
    }
}

// Write a Java program to find the nth  fibonacci numbers (my logic)
class fib
{
    public static void main(String args[])
    {
        int i, a = 0, b = 1, c = 0, range;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your nth Fibonacci number you need: ");
        range = sc.nextInt();
        System.out.println("The Fibonacci Numbers are: ");

        if(range==a)
        {
            System.out.println(a+ "is the Fibonacci number ");
        } else if (range==b) {
            System.out.println(b + " is the Fibonacci number ");

        }
        for (i = 2; i <= range; i++)
        {

            c = a + b;
            System.out.println(c);
            if (range == i)
            {
                System.out.println(c + "is the nth number ");
            }
            a = b;
            b = c;
        }
    }
}



// Write a Java program to find the nth fibonacci number ( kunal's logic)
public class Fibo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = 0;
        int b = 1;
        int count = 2;

        while (count <= n) {
            int temp = b;
            b = b + a;
            a = temp;
            count++;
        }

        System.out.println(b);
    }
}

// Write a Java program to find the occurences of a digit (my way)
class Occurences
{
    public  static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int count = 0 , n ,remainder;
        System.out.println("Enter any number");
        n = sc.nextInt();

        System.out.println("Enter the digit you want to count the occurences");
        int i = sc.nextInt();
        while(n>0)
        {
            remainder = n % 10;
            if(remainder == i)
            {
                count++;
            }
            n = n/10;

        }
        System.out.println(count);
    }
}

// Write a Java program to find the occurences of a digit (kunal's way)
public class CountNums {
    public static void main(String[] args) {
        int n = 45535;

        int count = 0;
        while (n > 0) {
            int rem = n % 10;
            if (rem == 5) {
                count++;
            }
            n = n / 10; // n /= 10
        }

        System.out.println(count);
    }
}

// Write a java program to demonstrate the reverse of a Number
class Rev
{
    public  static  void main(String args[])
    {
        int remainder , result = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number = ");
        int n = sc.nextInt();

        while(n>0)
        {
            remainder = n%10;
            result = result * 10 + remainder;
            n=n/10;
        }
        System.out.println(result);
    }
}


// Write a java program to Demonstrate a infinite loop calculator program ?
class cal
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            int ans = 0;
            System.out.println("Enter your operator");
            char op = sc.next().trim().charAt(0);

            if(op=='+' || op == '-' || op == '*'||op == '/'|| op == '%')
            {
                System.out.println("Enter the first number ");
                int num1 = sc.nextInt();
                System.out.println("Enter the Second Number ");
                int num2 = sc.nextInt();

                if(op=='+')
                {
                    ans= num1 + num2;
                }
                if(op=='-')
                {
                    ans= num1 + num2;
                }
                if(op=='*')
                {
                    ans= num1 + num2;
                }
                if(op=='/')
                {
                    if(num2!=0)
                    {
                        ans = num1 + num2;
                    }
                }
                if(op=='%')
                {
                    if (num2 != 0)
                    {
                        ans = num1 + num2;
                    }
                }
            }
            else if (op == 'X' || op == 'x')
            {
                break;
            }
            else
            {
                System.out.println("Invalid Input");
            }
            System.out.println("Output = "+ans);
        }
    }
}
