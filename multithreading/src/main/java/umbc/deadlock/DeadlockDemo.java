package umbc.deadlock;

public class DeadlockDemo {
  public static Object resource1 = new Object();
  public static Object resource2 = new Object();

  public static void main(String[] args) {
    
    Thread thread1 = new Thread(() -> {

      // syncronizied block , just like synchronized method in Counter class. Use synronized keyword and give resource you want to lock on
      // gives ability to lock on specific resource so nothing else can access it while it is locked
      synchronized (resource1) {
        System.out.println("Thread 1: Acquired lock on resource 1");
        try {
          Thread.sleep(100);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
        synchronized (resource2) {
          System.out.println("Thread 1: Acquired lock on resource 2");
        }
      }
    });
    
    Thread thread2 = new Thread(() -> {
      synchronized (resource1) {
        System.out.println("Thread 2: Acquired lock on resource 1");
        try {
          Thread.sleep(100);
        } catch (InterruptedException e) {
          e.printStackTrace();  
        }
        synchronized (resource2) {
          System.out.println("Thread 2: Acquired lock on resource 2");
        }
      }
    });

    thread1.start(); 
    thread2.start();

  }
}