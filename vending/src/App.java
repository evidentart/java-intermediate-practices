import java.util.Scanner;



public class App {



    public static void main(String[] args) throws Exception {
       
        Scanner scan = new Scanner(System.in);

        System.out.println("");
        System.out.println("=====================================");
        System.out.println("Grab N' Go Snacks and Such");
        System.out.println("=====================================");

        String[] row1 = {"Skittles", "Froot Loops", "Chips"};

        String[] row2 = new String[3];
        row2[0] = "Mountain Dew";
        row2[1] = "Grandma's Cookie";
        row2[2] = "Granola Bar";

        String[] row3 = {"Yoggurt", "Goldfish", "M&M"};
        
        boolean isRunning = true;
        while (isRunning){
            System.out.println("Please choose a row to look at, or quit: ");
            System.out.println("1) Row 1");
            System.out.println("2) Row 2");
            System.out.println("3) Row 3");
            System.out.println("4) Quit");

            int rowSelection = scan.nextInt();
            int itemSelection;

            switch(rowSelection){
                case 1: {
                    System.out.println("Row 1 Items:");
                    displayItems(row1);
                    System.out.println("Enter an item number to select item: ");
                    itemSelection = scan.nextInt();
                    selectItem(row1, itemSelection);
                }
                break;
                case 2: {
                    System.out.println("Row 2 Items:");
                    displayItems(row2);
                    System.out.println("Enter an item number to select item: ");
                    itemSelection = scan.nextInt();
                    selectItem(row2, itemSelection);
                }
                break;
                case 3: {
                    System.out.println("Row 3 Items:"); 
                    displayItems(row3);
                    System.out.println("Enter an item number to select item: ");
                    itemSelection = scan.nextInt();
                    selectItem(row3, itemSelection);
                }
                break;
                case 4: {
                    isRunning = false;
                }
                break;
                default: {
                    System.out.println("Invalid Selection");
                }
                break;
            }
        }//end while
        System.out.println("Enjoy your snack!");
        scan.close();

    }//end main

    public static void displayItems(String[] row) {

        int i = 1;
        for (String snack: row){
            System.out.println(i + ") " + snack);
            i++;
        }
    }

    public static void selectItem(String[] row, int selection){

        System.out.println("You selected: " + row[selection - 1]);

    }
}//end class
