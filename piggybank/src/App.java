import java.util.Scanner;

import models.PiggyBank;
import services.PiggyBankService;

public class App {
    public static void main(String[] args) throws Exception {
       
        //model
        PiggyBank pb = new PiggyBank(1.50);
        //service
        PiggyBankService pbService = new PiggyBankService(pb);

        System.out.println("Welcome to your piggybank!");

        Scanner scanner = new Scanner(System.in);
     
    
        boolean loopSwitch = true;
        do {
          
            System.out.println("Type deposit to add money to your piggybank or break to get your money back.");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("deposit" ) ){
                pbService.depositQuarter();

            }else{

                loopSwitch = false;
            }

         } while (loopSwitch); 
            scanner.close();
            System.out.println("\nYou broke your piggybank and found " + pbService.breakPiggyBankAndReturnBalance() + " coins!");
    }
}
