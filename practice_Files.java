import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class practice_Files {
    public static void main(String[] args) {
        
        try{
            
            File f = new File("C://Users//kgaur//OneDrive//Desktop//website");
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);

            System.out.println(br.readLine());
        

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
