import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n***Welcome to the superhero generator***");
        System.out.println("\nWhat would you like to name your superhero?");

        String name = scanner.nextLine();
        Superhero hero = new Superhero(name);

      
        boolean willLoop = true;
        while (willLoop) {

            System.out.println("\nEnter a number to make your selection");
            System.out.println("1] Add power\n2] Display powers\n3] Exit");
            
            int choice = 0;

            try {

                choice = scanner.nextInt();
                
            } catch(InputMismatchException exception) {
                System.out.println("\nAre you a superVillain!?! Your choices are 1, 2, or 3");
                scanner.nextLine();
                continue;
            } catch (Exception ex) {
                ex.printStackTrace();
            }

            switch (choice) {

                case 1: {

                    System.out.println("\nWhat power would you like to add?");
                    String power = scanner.next();
                    hero.addPower(power);
                    System.out.println("\nYou have added the power of " + power);
                    break;
                }
                case 2: {

                    System.out.println(hero.getSuperPowers());
                    break;
                }

                case 3: {
                    willLoop = false;
                    System.out.println(hero);
                    break;
                }
                default : {
                    try{
                        //hero.exceptionManAttacks();
                    } catch(NullPointerException ex) {
                        System.out.println(ex.getMessage());
                    }

                    willLoop = false;
                }
            }

        }
      
        scanner.close();
    }  
}
