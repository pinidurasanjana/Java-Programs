import java.util.Scanner;

public class Student{

     String FirstName;
     String LastName;
     double Weight;
     double Height;
     double BMI;
    
    public static void main(String[]args){
        getFullName();
    }
    public static void getFullName(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your firstname: ");
        String FirstName = input.nextLine();
        System.out.println("Enter your lastname: ");
        String LastName = input.nextLine();
        String FullName = FirstName +" "+ LastName;
        System.out.println(FullName);
        getBMI();
        
    }
    public static void getBMI(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your weight: ");
        double Weight = input.nextDouble();
        System.out.println("Enter your height: ");
        double Height = input.nextDouble();
        double BMI = Weight/(Height*Weight);
        System.out.println(BMI);
    }
}