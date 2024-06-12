import java.util.Scanner;
public class StudentGrades {
        static int pass=0;
        static int fail=0;
        static int total=0;
        static int totalmarks =0;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Enter marks: ");
            int subject = input.nextInt();
            if (subject==1) {
                break;
            }
            else{
                if (subject>=50) {
                    pass++;
                }
                else{
                    fail++;
                }
            }
            total++;
            totalmarks += subject;
        }
        System.out.println("Total Number Of Subjects: "+total);
        System.out.println("Total Number Of Pass Subjects :"+pass);
        System.out.println("Total Number Of Fail Subjects: "+fail);
        System.out.println("Average Marks for Subjects: "+totalmarks/total);
    }
}
