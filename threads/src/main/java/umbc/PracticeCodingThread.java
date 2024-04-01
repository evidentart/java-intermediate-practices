package umbc;

public class PracticeCodingThread extends Thread {

  @Override
  public void run() {
    System.out.println("Practice coding state: " + getState());
      try {
        for (int j = 0; j < 20; j++) {
          System.out.println("Practice coding"); 
          Thread.sleep(500);
        }
      } catch (Exception e) {
        e.printStackTrace();
      }
    
  }  
}
