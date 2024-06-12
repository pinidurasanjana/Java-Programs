import java.util.Random;
import java.util.Scanner;
public class Tutorial2{
	public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the 1st number: ");
        double num1 = input.nextDouble();
        System.out.println("Enter the 2nd number: ");
        double num2 = input.nextDouble();
        double sum = num1 + num2;
        System.out.println(sum);

        
        System.out.println("Enter the number:");
        int num = input.nextInt();
        if (num >= 18){
            System.out.println("Over 18");
        }
        else if (num < 0) {
            System.out.println("The age entered is incorrect");
        }
        else{
            System.out.println("Under 18");
        }
        

        System.out.println("Enter ICT marks:");
	    double ict = input.nextDouble();
        System.out.println("Enter CW marks:");
        double cw = input.nextDouble();
        double Sum = ict + cw;
        double average = Sum / 2;
        if (ict >= 30 && cw >= 30){
            if (average >= 40){
                System.out.println("Pass");
                System.out.println(average);
            }
        }


        System.out.println("Enter the grade: ");
        int grade = input.nextInt();
        if (grade < 0 || grade > 100) {
            System.out.println("Invalid value");
        } else if (grade >= 70) {
            System.out.println("1st Class Honours (1)");
        } else if (grade >= 60) {
            System.out.println("2nd Class Honours Upper Division (2:i)");
        } else if (grade >= 50) {
            System.out.println("2nd Class Honours Lower Division (2:ii)");
        } else if (grade >= 40) {
            System.out.println("3rd Class Honours (3)");
        } else {
            System.out.println("Invalid value");
        }
    

        double result;
        System.out.println("Enter the 1st number: ");
        double Num1 = input.nextDouble();
        System.out.println("Choose the operator(+,-,/,*): ");
        char operator = input.next().charAt(0);
        System.out.println("Enter the 2nd number: ");
        double Num2 = input.nextDouble();
        switch (operator) {
            case '+':
                result = Num1 + Num2;
                System.out.println(result);
                break;
            case '-':
                result = Num1 - Num2;
                System.out.println(result);
                break;
            case '/':
                if (Num2 != 0){
                    result = Num1 / Num2;
                }
                else{
                    System.out.println("Error: Division by zero");
                    return;
                }
                System.out.println(result);
                break;
            case '*':
                result = Num1 + Num2;
                System.out.println(result);
                break;
        }
        

        System.out.println("Number of classes held: ");
        double heldclass = input.nextDouble();
        System.out.println("Number of classes attended: ");
        double attendedclass = input.nextDouble();
        double percentage = (attendedclass/heldclass)*100;
        System.out.println(percentage+" %");
        System.out.println("Do you have a medical cause? (y/n):");
        char medicalcause = input.next().charAt(0);
        if (percentage >= 75 || medicalcause =='y'){
            System.out.println("allowed to sit in exam");
        }
        else{
            System.out.println("not allowed to sit in exam");
        }
    
    
        System.out.println("Enter your account balance: ");
        double accountBalance = input.nextDouble();
        while (true) {
                System.out.println("d=deposit, w=withdrawal, f=fraud check, q=quit):");
                char type = input.next().charAt(0);

                switch (type) {
                    case 'd':
                        System.out.println("Enter the deposit amount:");
                        double depositAmount = input.nextDouble();
                        accountBalance += depositAmount;
                        System.out.println("Deposit of $" + depositAmount + " successful.");
                        break;
                    case 'w':
                        System.out.println("Enter the withdrawal amount:");
                        double withdrawalAmount = input.nextDouble();
                        if (withdrawalAmount > accountBalance) {
                            System.out.println("Error: Withdrawal amount exceeds account balance. Your current balance is $" + accountBalance);
                        } else {
                            accountBalance -= withdrawalAmount;
                            System.out.println("Withdrawal of $" + withdrawalAmount + " successful.");
                            if (accountBalance < 0) {
                                System.out.println("Warning: Your account is overdrawn. Current balance: $" + accountBalance);
                            }
                        }
                        break;
                    case 'f':
                        if (accountBalance < 100) {
                            System.out.println("Warning: Your account balance is below $100.");
                        } else {
                            System.out.println("Your account balance is above $100. No fraud detected.");
                        }
                        break;
                    case 'q':
                        System.out.println("Exiting program. Final account balance: $" + accountBalance);
                        return;
                    default:
                        System.out.println("Error: Invalid transaction type. Please enter d, w, f, or q.");
                }
                    break;
            } 
        System.out.println("choice (0 = Rock, 1 = Paper or 2 = Scissors): ");
        int user_choice = input.nextInt();
        int random_number = new Random().nextInt(3);
        if (user_choice == 0 && random_number == 2){
            System.out.println("user choose Rock and computer choose Scissors");
            System.out.println("The winner is the user");
        }
        else if (user_choice ==2 && random_number == 0){
            System.out.println("user choose Scissors and computer choose Rock");
            System.out.println("The winner is the computer");
        }
        else if (user_choice ==2 && random_number ==1 ){
            System.out.println("user choose Scissors and computer choose Paper");
            System.out.println("The winner is the user");
        }
        else if (user_choice ==1 && random_number == 2){
            System.out.println("user choose Paper and computer choose Scissors");
            System.out.println("The winner is the computer");
        }
        else if (user_choice ==1 && random_number == 0){
            System.out.println("user choose Paper and computer choose Rock");
            System.out.println("The winner is the user");
        }
        else if (user_choice ==0 && random_number == 1){
            System.out.println("user choose Rock and computer choose Paper");
            System.out.println("The winner is the computer");
        }
        else if (user_choice ==1 && random_number == 1){
            System.out.println("user choose Paper and computer choose Paper");
            System.out.println("The game is tie");
        }
        else if (user_choice ==2 && random_number == 2){
            System.out.println("user choose Scissors and computer choose Scissors");
            System.out.println("The game is tie");
        }
        else if (user_choice ==0 && random_number == 0){
            System.out.println("user choose Rock and computer choose Rock");
            System.out.println("The game is tie");
        }
        

        int i = 1;i += ++i + i++ + ++i;
        int j = 1; j += ++j +j++ + ++j;
        int k = 1; k += k++ + k++ + ++k;
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("k = " + k);

    }

}


    

