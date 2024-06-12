import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class fileread {
    public static void main(String[] args){
        try {
            File file=new File("text.txt");
            Scanner rf = new Scanner(file);
            String fileline;
            int linecounnt=1;
            while (rf.hasNext()){
                fileline = rf.nextLine();
                System.out.println(linecounnt +" "+ fileline);
                linecounnt++;
            }
            rf.close();
        }
        catch (IOException ex){
            System.out.println(ex);
        }
    }
}
