package Model;

public class RepairBot extends Robot{

public RepairBot(){
  setTool("welding Torch");
  setPowerlevel(10);
}

public void recharge(){
  System.out.println("Clank, boom, kerchunk! Repair bot now plugged in");
  System.out.println("Power level " + getPowerlevel());
}
  public void doWork(){
    System.out.println("Repair bot uses it's" + getTool() + " and repairs the nuclear power plant.");
  }
  
}
