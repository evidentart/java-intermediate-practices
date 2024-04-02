package umbc.livelock;

public class LivelockDemo {

  public static void main(String[] args) {
    Runner runner1 = new Runner();
    Runner runner2 = new Runner();



    Thread thread1 = new Thread(() -> {
      runner1.waitForOtherRunner(runner2);
    });

    Thread thread2 = new Thread(() -> {
      runner2.waitForOtherRunner(runner1);
    });

    thread1.start();
    thread2.start();

    }
}
