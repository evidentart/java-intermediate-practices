package umbc;

import java.sql.*;
import io.javalin.Javalin;
import umbc.dao.PetDAO;
import umbc.dao.PetDAOImpl;
import umbc.model.Pet;

public final class App {
    

   
    public static void main(String[] args) {


       Javalin app = Javalin.create();
       app.start(9000);

    }

    
}
