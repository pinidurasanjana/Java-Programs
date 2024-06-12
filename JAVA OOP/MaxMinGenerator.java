import java.util.Scanner;

public class MaxMinGenerator {
   public static void main(String[] args) {
    int[] num = new int[10];
    Scanner input = new Scanner(System.in);
    for(int i=9;i>=0;i--){
        System.out.print("Please input a numbers: ");
        num[i] = input.nextInt();
    }
    int min = Integer.MAX_VALUE;
    int max = Integer.MIN_VALUE;

    for(int numbers : num){
        if (numbers<min) {
            min = numbers;
        }
        if (numbers>max) {
            max = numbers;
        }
    }
    System.out.println("Min:"+min);
    System.out.println("Max:"+max);
   } 
}
