import java.io.File;
import java.io.IOException;
public class createfile {
    public static void main(String[] args){
        try{
            File file=new File("text.txt");
            boolean file_created = file.createNewFile();
            if (file_created){
                System.out.println("File successffully created:"+file.getName());
            }
            else if (file.exists()){
                System.out.println("There is another file with same file name");
            }
        }
        catch (IOException ex)
        {
            System.out.println(ex);
        }
    }
}
