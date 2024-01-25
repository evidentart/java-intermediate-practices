import java.util.Scanner;


public class App {

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Zoo!");

        Bear bear1 = new Bear();
        Tiger tiger1 = new Tiger();
        Animal animal1 = new Animal();

        System.out.println(bear1.eat());

        feedAnimal(bear1);
        feedAnimal(tiger1);
        feedAnimal(animal1);
        
       
        
    }

    public static void feedAnimal(Animal animal) {
        
    }
}
