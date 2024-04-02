package umbc.synchronization;

public class SynchronizationDemo {

  public static void main(String[] args) {
    Counter counter = new Counter();

    //Create multiple threads to increment and decrement the counter
    Thread incrementThread = new Thread(() -> {
      for (int i = 0; i < 500; i++) {
        counter.increment();
        System.out.println("Increment: " + counter.getCount());
      }
    });

    Thread decrementThread = new Thread(() -> {
      for (int i = 0; i < 500; i++) {
        counter.decrement();
        System.out.println("Decrement: " + counter.getCount());
      }
    });

    incrementThread.start();
    decrementThread.start();

    // main thread will wait for the these two threads to finish
    try {
      incrementThread.join();
      decrementThread.join();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    // print the final count
    System.out.println("Final count: " + counter.getCount());
  }
}
