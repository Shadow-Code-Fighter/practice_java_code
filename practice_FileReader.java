import java.io.File;
import java.io.FileReader;

public class practice_FileReader {
    public static void main(String[] args) {
        try{
            File f = new File("C:\\Users\\kgaur\\OneDrive\\Desktop\\website\\A.txt");
            FileReader fr = new FileReader(f);
            char [] ch = new char[(int)f.length()];
            fr.read(ch);

            for(char c: ch){
                System.out.print(c);
            }

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
