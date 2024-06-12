import java.util.Scanner;
public class Triangle {
    static int a;
    static int b;
    static int c;
    public static void main(String[]args){
        triangleChecker();
    }
    public static void triangleChecker(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter A: ");
        a = input.nextInt();
        System.out.println("Enter B: ");
        b = input.nextInt();
        System.out.println("Enter C: ");
        c = input.nextInt();
        if (a+b>c && b+c>a && c+a>b) {
            getPerimeter();
        }
        else{
            System.out.println("Invalid Triangle inputs.");
        }
    }
    public static void getPerimeter(){
        int perimeter = a + b +c;
        System.out.println(perimeter);
    }
}
