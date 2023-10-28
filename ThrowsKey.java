import java.io.FileWriter;

public class ThrowsKey {
    public static void main(String[] args) throws Exception {
        ThrowsKey t = new ThrowsKey();
        t.test();
    }
    public void test() throws Exception{
        FileWriter fw  = new FileWriter("D://test.txt");
    }
}
