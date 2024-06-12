import java.util.Scanner;
public class Tutorial5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Q1: ");
        hello();
        while (true) {
            System.out.println("Q2: ");
            System.out.println("**********");
            System.out.println("   MENU   ");
            System.out.println("**********");
            System.out.println("1.- Addition");
            System.out.println("2.- Substraction");
            System.out.println("0.- Quit");
            System.out.println("Please select an option: ");
            int option = input.nextInt();
            if (option == 1) {
                addition();
            } else if (option == 2) {
                substraction();
            } else if (option == 0) {
                break;
            }
        }
        System.out.println("Q3: ");
        printnumbers(1);

        System.out.println("Q4: ");
        System.out.println("Enter a number: ");
        int num = input.nextInt();
        System.out.println("Enter a exponent: ");
        int exponent = input.nextInt();
        int result = exponentcal(num, exponent);
        System.out.println(num + "^" + exponent + " = " + result);

        System.out.println("Q5: ");
        System.out.println(double_recursion(4));

        System.out.println("Q6: ");
        int aValue = 3;
        int result_mul = multiply(aValue, 2);
        System.out.println(result_mul);

        System.out.println("Q7: ");
        int number = 5;
        int poweroftwo = calculatepoweroftwo(number);
        System.out.println("The power of 2 of " + number + " is: " + poweroftwo);

        System.out.println("Q8" );
        int number_1 = 5;
        int factorial = calculatefactorial(number_1);
        System.out.println("The factorial of " + num + " is: " + factorial);
    }

    private static void hello() {
        System.out.println("Hello World");
    }

    private static void addition() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        double first_num = input.nextDouble();
        System.out.println("Enter the second number: ");
        double second_num = input.nextDouble();
        double total = first_num + second_num;
        System.out.println(total);
    }

    private static void substraction() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        double first_num = input.nextDouble();
        System.out.println("Enter the second number: ");
        double second_num = input.nextDouble();
        double total = first_num - second_num;
        System.out.println(total);
    }

    private static void printnumbers(int num) {
        if (num <= 100) {
            System.out.println(num);
            printnumbers(num + 1);
        }
    }

    private static int exponentcal(int num, int exponent) {
        if (exponent == 0) {
            return 1;
        } else {
            return num * exponentcal(num, exponent - 1);
        }
    }
    private static int double_recursion(int n){
        if (n==0){
            return 1;
        } else if (n==1) {
            return 3;
        }else {
            return double_recursion(n-2)+double_recursion(n-1);
        }
    }
    private static int multiply(int sum1, int sum2) {
        return sum1 * sum2;
    }
    public static int calculatepoweroftwo(int number) {
        return number * number;
    }
    public static int calculatefactorial(int number) {
        if (number == 0) {
            return 1;
        } else {
            return number * calculatefactorial(number - 1);
        }
    }
}
