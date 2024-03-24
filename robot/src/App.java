import java.util.Scanner;

import Model.Robot;


public class App {
    public static void main(String[] args) throws Exception {
       

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Robots R Us");
        
        boolean loopswitch = true;
        while(loopswitch){
            
            System.out.println("\nWhat kind of Robot would you like? Enter: \n1) For a Constuction Robot. \n2) For hazardous Robot. \n3) For a repair Robot, \n4) To quit.");
            int choice = scanner.nextInt();

            if(choice == 1){
                Robot r1 = new Robot("construction");
                System.out.println("Thanks! Here is your brand new Robot\n");
                r1.activateRobot();
            }else if (choice == 2){
                Robot r2 = new Robot("household");
                System.out.println("Thanks! Here is your brand new Robot\n");
                r2.activateRobot();
            } else if (choice == 3){
                Robot r3 = new Robot("maintenance");
                System.out.println("Thanks! Here is your brand new Robot\n");
                r3.activateRobot();
            } else {
                loopswitch = false;
            }
        }
        System.out.println("\nThanks for using Robots R Us!");
        scanner.close();

   // RobotFactory botFactory = new RobotFactory();
   // Robot bot = null;
   // Scanner userInput = new Scanner(System.in);
   // String typeofBot = userInput.nextLine();
   // bot = botFactory.buildRobot(typeOfBot);
   // doRobotStuff(bot);
   // public static void doRobotStuff (Robot bot){
   //     bot.doWork();
   //     bot.recharge();
   // }    
 
    }
} // end of class
