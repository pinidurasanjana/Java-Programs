import java.util.Arrays;
import java.util.Scanner;
import java.util.InputMismatchException;

public class w2053073_PlaneManagement {
    static int[][] seats = new int[5][];
    static Ticket[][] tickets = new Ticket[5][];
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        seats[0] = new int[14];
        seats[1] = new int[12];
        seats[2] = new int[0];
        seats[3] = new int[12];
        seats[4] = new int[14];
        
        tickets[0] = new Ticket[14];
        tickets[1] = new Ticket[12];
        tickets[2] = new Ticket[0];
        tickets[3] = new Ticket[12];
        tickets[4] = new Ticket[14];

        while (true){
            System.out.println("Welcome to the Plane Management application");
            String asterisks = "*".repeat(54);
            String space =  " ".repeat(20);
            System.out.println(asterisks);
            System.out.println("*"+space+"MENU OPTIONS"+space+"*");
            System.out.println(asterisks);
            System.out.println("      1)Buy a seat        ");
            System.out.println("      2)Cancel a seat     ");
            System.out.println("      3)Find first available seat");
            System.out.println("      4)Show seating plan ");
            System.out.println("      5)Print tickets information and total sales ");
            System.out.println("      6)Search ticket     ");
            System.out.println("      0)Quit              ");
            System.out.println(asterisks);

            System.out.print("Please select an option: ");
            try {
                int option = input.nextInt();
                switch (option) {
                    case 1:
                        buy_seat();
                        break;
                    case 2:
                        cancel_seat();
                        break;
                    case 3:
                        find_first_available();
                        break;
                    case 4:
                        show_seating_plan();
                        break;
                    case 5:
                        print_tickets_info();
                        break;
                    case 6:
                        search_ticket();
                        break;
                    case 0:
                        return;
                    default:
                        System.out.println("Please enter a valid option.");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid number for option.");
                input.nextLine();
                continue;
            }
        }
    }
    public static void buy_seat() {
        int row_int = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String name = input.next();
        System.out.print("Please enter your surname: ");
        String surname = input.next();
        System.out.print("Please enter your email: ");
        String email = input.next();
        System.out.print("Input the row letter: ");
        String rowforbuy = input.next().toUpperCase();
        System.out.print("Input the seat number: ");
        int numforbuy = input.nextInt();
        if (rowforbuy.equals("A")) {
            row_int = 0;
        } else if (rowforbuy.equals("B")) {
            row_int = 1;
        } else if (rowforbuy.equals("C")) {
            row_int = 3;
        } else if (rowforbuy.equals("D")) {
            row_int = 4;
        }
        if (!Arrays.asList("A", "B", "C", "D").contains(rowforbuy)) {
            System.out.println("Invalid row entered.");
            return;
        }
        if (seats[row_int][numforbuy - 1] != 1) {
            seats[row_int][numforbuy - 1] = 1;
            if (numforbuy <= 5) {
                Person newperson = new Person(name, surname, email);
                Ticket newticket = new Ticket(rowforbuy, numforbuy, 200, newperson);
                tickets[row_int][numforbuy - 1] = newticket;
                newticket.save();
            } else if (numforbuy >= 10) {
                Person newperson = new Person(name, surname, email);
                Ticket newticket = new Ticket(rowforbuy, numforbuy, 180, newperson);
                tickets[row_int][numforbuy - 1] = newticket;
                newticket.save();
            } else {
                Person newperson = new Person(name, surname, email);
                Ticket newticket = new Ticket(rowforbuy, numforbuy, 150, newperson);
                tickets[row_int][numforbuy - 1] = newticket;
                newticket.save();
            }
            System.out.println("Ticket purchased successfully!");
        } else {
            System.out.println("This seat is sold..");
        }
    }
    public static void cancel_seat(){
        Scanner input = new Scanner(System.in);
        System.out.print("Input the row letter: ");
        String rowforcancel = input.next().toUpperCase();
        System.out.print("Input the seat number: ");
        int numforcancel = input.nextInt();
        int row_int = 0;
        if (rowforcancel.equals("A")) {
            row_int = 0;
        } else if (rowforcancel.equals("B")) {
            row_int = 1;
        } else if (rowforcancel.equals("C")) {
            row_int = 3;
        } else if (rowforcancel.equals("D")) {
            row_int = 4;
        }
        if (!Arrays.asList("A", "B", "C", "D").contains(rowforcancel)) {
            System.out.println("Invalid row entered.");
            return;
        }
        if (seats[row_int][numforcancel - 1] == 1) {
            seats[row_int][numforcancel - 1] = 0;
            tickets[row_int][numforcancel - 1] = null;
        }else {
            System.out.println("That seat is not available already...");
        }
        System.out.println("Seat is canceled");
    }
    public static void find_first_available(){
        int row = 0;
        int col = 0;
        while (row < seats.length) {
            if (seats[row][col] == 0) {
                if (row == 0) {
                    System.out.println("Seat is still available: " + "A" + (col + 1));
                } else if (row == 1) {
                    System.out.println("Seat is still available: " + "B" + (col + 1));
                } else if (row == 2) {
                    System.out.println("Seat is still available: " + "C" + (col + 1));
                } else {
                    System.out.println("Seat is still available: " + "D" + (col + 1));
                }
                break;
            }
            col++;
            if (col >= seats[row].length) {
                row++;
                col = 0;
            }
        }
    }
    public static void show_seating_plan(){
        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats[i].length; j++) {
                if (seats[i][j] == 0) {
                    System.out.print("O ");
                } else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }
    public static void print_tickets_info(){
        System.out.println("********* Ticket Information *********");
        int total = 0;
        for (int i = 0; i < tickets.length; i++) {
            for (int j = 0;j <tickets[i].length;j++){
                Ticket ticket = tickets[i][j];
                if (ticket!=null) {
                    System.out.println("Row: "+ticket.getRow());
                    System.out.println("Seat Number: " + ticket.getSeat());
                    System.out.println("Price: " + ticket.getPrice());
                    System.out.println("Person Information:");
                    System.out.println("Name: " + ticket.getPerson().getName());
                    System.out.println("Surname: " + ticket.getPerson().getSurname());
                    System.out.println("Email: " + ticket.getPerson().getEmail());
                    System.out.println("------------------------------------------------------");
                    total += ticket.getPrice();
                }
            }
        }
        System.out.println("Total amount : £"+total);
    }

    public static void search_ticket() {
        Scanner input = new Scanner(System.in);
        System.out.print("Input the row letter: ");
        String rowforsearch = input.next();
        System.out.print("Input the seat number: ");
        int seatforsearch = input.nextInt();
        int row_int = 0;
        if (!Arrays.asList("A", "B", "C", "D").contains(rowforsearch)) {
            System.out.println("Invalid row entered.");
            return;
        }
        if (rowforsearch.equals("A")){
            row_int = 0;
        }else if (rowforsearch.equals("B")){
            row_int = 1;
        }else if (rowforsearch.equals("C")) {
            row_int = 3;
        }else if (rowforsearch.equals("D")) {
            row_int = 4;
        }
        Ticket ticket = tickets[row_int][seatforsearch-1];
        if (tickets[row_int][seatforsearch-1] != null){
            System.out.println("Row: " + ticket.getRow());
            System.out.println("Seat Number: " + ticket.getSeat());
            System.out.println("Price: " + ticket.getPrice());
            System.out.println("Person Information:");
            System.out.println("Name: " + ticket.getPerson().getName());
            System.out.println("Surname: " + ticket.getPerson().getSurname());
            System.out.println("Email: " + ticket.getPerson().getEmail());
        }else {
            System.out.println("This seat is available..");
        }
    }
}









