import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class Main {
    public static void main(String[] args){
        File file = new File("Exercise1.txt");
        try {
            boolean file_created =file.createNewFile();
        }
        catch (IOException ex) {
            System.out.println("ERROR: File could not be created.");
        }
    }
}