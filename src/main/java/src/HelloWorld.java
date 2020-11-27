package src;

public class HelloWorld {
    public static void main(String[] args) throws InterruptedException{
        Thread mythread = new Thread(){
            public void run(){
                System.out.println("hello from new thread");
            }
        };

        mythread.start();
        Thread.yield();
        System.out.println("main thread");
        mythread.join();
    }
}
