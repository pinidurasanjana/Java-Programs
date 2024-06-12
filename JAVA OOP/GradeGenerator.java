import java.util.Scanner;
public class GradeGenerator {
    static int X;
    static int Y;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter marks: ");
        double mark = input.nextDouble();
        if (mark<0 || mark >100) {
            System.out.println("Warning: Marks should be in the range of 0-100");
        }
        else{
            if (mark>=75) {
                System.out.println("A");
            }
            else if (mark>=65) {
                System.out.println("B");
            }
            else if (mark>=55) {
                System.out.println("C");
            }
            else{
                System.out.println("subject Fail");
            }
        }
        System.out.println("Enter a number for X: ");
        X = input.nextInt();
        System.out.println("Enter a number for Y: ");
        Y = input.nextInt();
        positiveNum();
    }
    public static void positiveNum(){
        if (X>0 && Y>0) {
            System.out.println("X and Y positive numbers");
            difference();
            range();
            digits();
            odd();
        }
        else{
            System.out.println("Please input positive numbers");
        }
    }
    public static void difference(){
        int difference = X - Y;
        if (difference>0) {
            System.out.println("Difference between X and Y ,is a positive Number");
        }
        else{
            System.out.println("Differnce is negative");
        }
    }
    public static void range(){
        if (Y>20 && Y<50) {
            System.out.println("Y is in range 20 -50");
        }
        else{
            System.out.println("Y is not in range 20 -50 ");
        }
    }
    public static void digits(){
        boolean isthreedigit = false;
        while (Y>=100 && Y<=999) {
            isthreedigit = true;
            break;
        }
        if (isthreedigit) {
            System.out.println("Y is a 3-digit number");
        }
        else{
            System.out.println("Y is not a 3-digit number");
        }
    }
    public static void odd(){
        if (X%2==0 && Y%2 ==0) {
           System.out.println("Both X and Y values are not odd numbers"); 
        }
        else{
            System.out.println("Both X and Y values are odd numbers");
        }
    }
    

}
