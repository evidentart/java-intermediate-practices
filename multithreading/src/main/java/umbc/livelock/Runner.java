package umbc.livelock;

public class Runner {

  private boolean isReady = false;

  public synchronized void waitForOtherRunner(Runner otherRunner){
    while(!otherRunner.isReady()){
      System.out.println("Waiting for other runner to be ready...");
      try {
        Thread.sleep(100);
      }catch (InterruptedException e){
        e.printStackTrace();
      }
  }
  this.setReady(true);
  System.out.println("Both runners are ready now.");
  
  }

  public synchronized boolean isReady(){
    return isReady;
  }

  public synchronized void setReady(boolean ready){
    isReady = ready;
  }

}