import java.io.*;

public class practice_read{
    public static void main(String[] args) {
        try{
        File f = new File("C://Users//kgaur//OneDrive//Desktop//website//A.txt");
        FileReader fr = new FileReader(f);
            for(int i=0;i<f.length();i++){
                System.out.print((char)fr.read());
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}