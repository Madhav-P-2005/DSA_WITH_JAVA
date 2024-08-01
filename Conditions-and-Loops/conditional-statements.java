//Simple IF Statement
class If {
    public static void main(String[] args) {
        int a = 10;
        int b = 40;
        if (a != 35) {
            System.out.println("Hello World!");
        }
    }
}


//Multiple If-Else-IF Statements
class IfElse {
    public static void main(String[] args) {
        int salary = 25000;
        if (salary > 10000) {
            salary = salary + 2000;
        } else {
            salary = salary + 1000;
        }
        System.out.println(salary);
    }
}


//Switch Statement (Example 1)
//import java.util.Scanner;

class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Given Fruit Names are: Mango, Apple, Orange, Grapes");
        System.out.println("Enter any Given Fruit Name=");
        String fruit = sc.next();

        switch (fruit) {
            case "Mango" -> System.out.println("King of Fruits");
            case "Apple" -> System.out.println("A sweet red Fruit");
            case "Orange" -> System.out.println("Round Fruit");
            case "Grapes" -> System.out.println("Small Fruits");
            default -> System.out.println("Invalid Input");
        }
    }
}


//Display Day Names Between 1 and 7 (Example 2)
//import java.util.Scanner;
class Switch2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Day number between 1 to 7");
        int day = sc.nextInt();
        switch (day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Invalid Input");
        }
    }
}


//Display Weekdays and Weekends
//import java.util.Scanner;
class Switch3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number for Weekdays and Weekend");
        int day = sc.nextInt();
        switch (day) {
            case 1, 2, 3, 4, 5 -> System.out.println("Weekday");
            case 6, 7 -> System.out.println("Weekend");
            default -> System.out.println("Enter a valid number");
        }
    }
}


//Display Weekdays and Weekends (Enhanced)
//import java.util.Scanner;

class Switch4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number for Weekday and Weekend");
        int day = sc.nextInt();
        switch (day) {
            case 1, 2, 3, 4, 5 -> System.out.println("Weekday");
            case 6, 7 -> System.out.println("Weekend");
            default -> System.out.println("Enter a valid number");
        }
    }
}

//Demonstrate Nested Switch Case
//import java.util.Scanner;
class NestedSwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Employee Id=");
        int id = sc.nextInt();
        System.out.println("Enter the Department Name=");
        String name = sc.next();
        switch (id) {
            case 1 -> System.out.println("Madhav");
            case 2 -> System.out.println("Kunal Kushwaha");
            case 3 -> {
                System.out.println("Employee Number 3");
                switch (name) {
                    case "IT" -> System.out.println("IT Department");
                    case "Management" -> System.out.println("Management Department");
                    default -> System.out.println("No Department");
                }
            }
            default -> System.out.println("Invalid Id");
        }
    }
}





