package umbc;

public class PlayOutsideThread implements Runnable {
  
  @Override
  public void run() {
    
    try {
      for (int j = 0; j < 20; j++) {
        System.out.println("Play outside"); 
        Thread.sleep(500);
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
    
  }
}
