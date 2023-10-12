import java.io.File;
import java.io.IOException;

public class practice_code_3{
    public static void main(String[] args) {
        File f = new File("C:\\Users\\kgaur\\OneDrive\\Desktop\\website\\p2");
        boolean var=f.exists();
        System.out.println(var);
        var= f.delete();
    try{
        var=f.createNewFile();
        System.out.println(var);
        
    }catch(IOException e){
        e.printStackTrace();
    }
    var=f.mkdir();
    }

}
