package services;

import models.PiggyBank;

public class PiggyBankService {
  
  PiggyBank bank;

  //piggy bank service for default state of the piggy bank
  public PiggyBankService(){
    bank = new PiggyBank();
  }

  //piggy bank service for a custom state of the piggy bank
  public PiggyBankService(PiggyBank bank){
    this.bank = bank;
  }

  public void depositQuarter() {
    
    bank.amount += 0.25;
    System.out.println("\nYou just added a quarter to your piggybank!");
  }

  public double breakPiggyBankAndReturnBalance() {

    bank.isBroken = true;
    return bank.amount;
  }


}
