import java.util.Scanner;

public class Tutorial1{
    public static void main(String[] args){
        System.out.println("Pinidu 20");   
        
        int runningTotal;  
        runningTotal = 0;
        int[] numbers = {5,8,2,3};
        for (int num : numbers) {
            runningTotal += num;
            System.out.println("Variable value is: " + runningTotal);
        }

        int mark1 = 80;  
        int mark2 = 72;
        int mark3 = 59;
        double average = (mark1 + mark2 + mark3) / 3.0;
        System.out.println("The average mark is: " + average);

        Scanner input = new Scanner(System.in);
        System.out.println("Please insert your name:");
        String name = input.nextLine();
        System.out.println("Hello " + name); 

        String name1 = "John";
        String name2 = "Brown";
        System.out.println("Hello " + name1 +" " + name2 +" ");
    
        System.out.println("********");
		System.out.println("* MENU *");
		System.out.println("********");
	
        System.out.println("Enter the first name: ");
        String firstname = input.nextLine();
        System.out.println("Enter the sur name: ");
        String lastname = input.nextLine();
        System.out.println(firstname.substring(0,1)+lastname.substring(0,1));

        System.out.println("Input the number in meters: ");
        double num = input.nextInt();
        num = num * 100;
        System.out.println(num+" cm");

        double F;
        System.out.println("Enter the Centigrade temperature: ");
        double C = input.nextDouble();
        F = (9.0/5)*C + 32;
        System.out.println(F+" F");

        final int manual = 500;
        final int skilled = 700;
        final int management = 800;
        final double taxpercentage = 0.2;
        System.out.println("Enter the number of manual employees: ");
        int numManual = input.nextInt();
        System.out.println("Enter the number of skilled employees: ");
        int numSkilled = input.nextInt();
        System.out.println("Enter the number of management employees: ");
        int numManagement = input.nextInt();

        int wagebill = (manual * numManual) + (skilled * numSkilled) + (management * numManagement);
        System.out.println(wagebill);

        double tax_to_pay = wagebill * taxpercentage;
        System.out.println(tax_to_pay);
        
    }

    
}