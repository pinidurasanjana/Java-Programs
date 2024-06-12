import java.util.Scanner;
import java.util.Random;
import java.io.*;
public class Tutorial3{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("For loop");
        for (int i = 1; i < 6; i++) {
            System.out.println(i);
        }
        System.out.println("While loop");
        int i = 1;
        while (i <= 5) {
            System.out.println(i);
            i += 1;
        }
        System.out.println("For loop");
        for (int j = 0; j < 16; j += 2) {
            if (j == 6) {
                continue;
            }
            System.out.println(j);
        }
        System.out.println("While loop");
        int j = 0;
        while (j <= 14) {
            if (j != 6) {
                System.out.println(j);
            }
            j += 2;
        }
        System.out.println("Nested loop");
        for (int k = 1; k < 6; k++) {
            for (int l = 1; l <= k; l++) {
                System.out.print(k);
            }
            System.out.println();
        }
        System.out.println("-----------------------------------");
        for (int k = 2; k <= 8; k += 2) {
            for (int l = 1; l <= k; l++) {
                System.out.print(k);
            }
            System.out.println();
        }
        System.out.println("-----------------------------------");
        for (int k = 1; k <= 5; k++) {
            for (int l = 1; l <= 5 - k; l++) {
                System.out.print(" ");
            }
            for (int m = 1; m <= (2 * k - k); m++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
        System.out.println("-----------------------------------");
        System.out.print("Enter a number : ");
        int number = input.nextInt();
        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }
        System.out.print("Enter a letter : ");
        char letter = input.next().charAt(0);
        int count_1 = 0;
        while (count_1 < number) {
            System.out.print(letter);
            count_1++;
        }
        System.out.println("-----------------------------------");
        System.out.print("Enter a number : ");
        int num = input.nextInt();
        if (num < 0) {
            System.out.println("Please enter a positive number.");
        }         else {
            int factorial_total = 1;

            for (int h = 1; h <= num; h++) {
                factorial_total *= h;
                System.out.print(h);
                if (h < num) {
                    System.out.print(" x ");
                }
            }
            System.out.println(" = " + factorial_total);
        }
        System.out.println("---------------------------------------");
        int a = 1, b = 1, n = 10 , c;
        for (int x = 1; x <= n; x++) {
            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;
        }
        System.out.println("---------------------------------------");
        System.out.print("Enter the passcode : ");
        int passcode = input.nextInt();
        final int correctPassword = 486251;
        int count = 1;
        if(passcode == correctPassword){
            System.out.println("correct  password.....");
        }
        else{
            while (count<4){
                if(passcode != correctPassword){
                System.out.println("Enter passcode (attempts remaining: " + (4 - count) + "): ");
                passcode= input.nextInt();
                count++;
                }
                else {
                    System.out.println("correct password");
                    return;
                }
            }
            System.out.println("Attempts are finished");
        }
        System.out.println("---------------------------------------");
        Random random = new Random();
        int randomNumber = random.nextInt(20) + 1;
        System.out.println(randomNumber);
        int guess;
        do {
            System.out.print("Enter your guess number : ");
            guess = input.nextInt();

            if (guess==randomNumber) {
                System.out.println("You guessed the number");
            }else {
                System.out.println("Your guessed number incorrect ");
            }
        } while (guess != randomNumber);

        System.out.println("---------------------------------------");
        int number_1,power,count_2;
        int total = 0;
        System.out.println("Enter number : ");
        number_1 = input.nextInt();
        System.out.println("Enter power : ");
        power = input.nextInt();
        count_2 = 0;
        while (count_2<=power){
            total = number_1 * number_1;
            total = total*number_1;
            count_2++;
        }
        System.out.println("the answer is "+total);

    }
}












