public class A {
    private int x =10;
    private void test(){
        System.out.println("from test");
    }
    public static void main(String[] args) {
        A a = new A();
        a.test();
        System.out.println(a.x);
    }
}