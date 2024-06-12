import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class Tutorial4 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] arr = new int[6];
        int total=0;
        int count=0;
        for (int i = 0; i < arr.length;i++) {
            System.out.println("Enter the mark " + i);
            arr[i] = input.nextInt();

            total += arr[i];

            if (arr[i] < 40) {
                count++;
            }
        }
        System.out.println("List of mark:");
            for (int mark:arr){
                System.out.println(mark+" ");
            }

        String temp;
        int i=2;
        int j=4;
        String[] array = {"Alex", "Max", "Charlie", "Bob", "Ada", "Jim"};
        temp = array[i];
        array[i]=array[j];
        array[j]=temp;

        for (String mark:array) {
            System.out.println(mark + " ");
        }



        double[] values = new double[10];
        for (int p = 0; p < values.length; p++) {
            values[p] = p * 1.5;
        }
        System.out.print("Enter index 1: ");
        int index1 = input.nextInt();
        System.out.print("Enter index 2: ");
        int index2 = input.nextInt();

        if (index1 >= 0 && index1 < values.length && index2 >= 0 && index2 < values.length) {
            double var = values[index1];
            values[index1] = values[index2];
            values[index2] = var;
        } else {
            System.out.println("Invalid indices!");
        }

        for (double value : values) {
            System.out.print(value + " ");
        }



        int[] myNamesArray = new int[10];
        System.out.print("Enter 10 integers:");
        for (int r = 0; r < 10; r++) {
            myNamesArray[r] = input.nextInt();
        }

        int[] myNamesArray2 = myNamesArray.clone();

        Arrays.sort(myNamesArray2);

        System.out.println("Sorted array:");
        for (int num : myNamesArray2) {
            System.out.print(num + " ");
        }



        int simulations = 1000000;
        int count_X4 = 0;
        int count_Y4 = 0;
        int count_both4 = 0;
        Random rand = new Random();
        for (int l = 0; l < simulations; l++) {
            int roll_1 = rand.nextInt(6) + 1;
            int roll_2 = rand.nextInt(6) + 1;
            if (roll_1 == 4) {
                count_X4++;
            }
            if (roll_2 == 4) {
                count_Y4++;
            }
            if (roll_1 == 4 && roll_2 == 4) {
                count_both4++;
            }
        }
        double probability_X4 = (double) count_X4 / simulations;
        double probability_Y4 = (double) count_Y4 / simulations;
        double probability_both4 = (double) count_both4 / simulations;
        System.out.println("Estimated probability that X = 4 : " + probability_X4);
        System.out.println("Estimated probability that Y = 4 : " + probability_Y4);
        System.out.println("Estimated probability both X = 4 , Y = 4 : " + probability_both4);



        double[] marks = new double[10];
        for (int t = 0;t< marks.length;t++){
            System.out.print("Enter the mark of student "+(t+1)+": ");
            marks[t] = input.nextDouble();
            marks[t] = marks[t] - (marks[t]*0.1);
        }
        System.out.println(Arrays.toString(marks));




        int[] list = {3, 7, 9, 2, 5, 5, 8, 5, 6, 3, 4, 7, 3, 1};
        removebadpairs(list);
        for (int num : list) {
            System.out.print(num + " ");
        }
    }
    public static void removebadpairs(int[] list) {
        if (list.length % 2 != 0) {
            int[] newList = new int[list.length - 1];
            System.arraycopy(list, 0, newList, 0, list.length - 1);
            list = newList;
        }

        int newSize = 0;
        for (int i = 0; i < list.length; i += 2) {
            if (list[i] <= list[i + 1]) {
                list[newSize++] = list[i];
                list[newSize++] = list[i + 1];
            }
        }
        int[] finalList = new int[newSize];
        System.arraycopy(list, 0, finalList, 0, newSize);
        System.arraycopy(finalList, 0, list, 0, newSize);
    }
}