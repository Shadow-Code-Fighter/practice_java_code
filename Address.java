import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;

public class Address {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter website name: ");
        String site = br.readLine();

        try{
            InetAddress ip = InetAddress.getByName(site);
            System.out.println(ip);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}