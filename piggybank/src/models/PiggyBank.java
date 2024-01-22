package models;

public class PiggyBank {
  
  public double amount;
  public boolean isBroken;



  public PiggyBank() {

    this.amount = 0;
    this.isBroken = false;
    
  }

  public PiggyBank(double amount) {
    this.amount = amount;
    this.isBroken = false;
  }
}


