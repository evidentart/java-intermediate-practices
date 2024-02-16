package umbc;

import java.sql.*;
import umbc.dao.PetDAO;
import umbc.dao.PetDAOImpl;
import umbc.model.Pet;

public final class App {
    

   
    public static void main(String[] args) {


        //try to get a pet by id 1
        PetDAO petDAO = new PetDAOImpl();
        System.out.println(petDAO.getPetById(1));

        //try to add a pet
        Pet petToAdd = new Pet("Bobby", 5, "Dog", 1);
        System.out.println(petDAO.addPet(petToAdd));
        
    }
}
