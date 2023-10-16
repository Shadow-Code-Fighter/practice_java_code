
public class practice_code_Thread extends Thread {//run()  start()
    boolean stop = false;
    @Override
    public void run(){
        for(int i=0;i<10000;i++){
        System.out.println("Hello");
        // if(stop) return;
        }
    }
    public static void main(String[] args) {
        practice_code_Thread a1 = new practice_code_Thread();
        a1.start();
        // a1.stop=true;
        for(int i=0;i<10000;i++){
            System.out.println("main:");
        }
    }
}