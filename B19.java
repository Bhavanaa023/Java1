//package pkg1;
class MultiThreadingThree extends Thread {
    public void run() {
        for(int i=0;i<5;i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);       
            }
            catch (InterruptedException e) {
            }
        }
    }
}
public class B19 {
    public static void main(String[] args) {
        MultiThreadingThree mt1=new MultiThreadingThree();
        mt1.start();
        
    }
}

