import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class filewrite {
    public static void main(String [] args){
        try {
            FileWriter filewrite = new FileWriter("text.txt");
            filewrite.write("This is the data I want to store in text.txt file");
            filewrite.close();
        }
        catch (IOException ex){
            System.out.println(ex);
        }
    }
}
