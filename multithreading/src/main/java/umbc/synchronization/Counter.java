package umbc.synchronization;

public class Counter {
  private int count = 0;

  public synchronized void increment() {
    count++;
  }

  public synchronized void decrement() {
    count--;
  }

  public synchronized int getCount() {
    return count;
  }
  
}
