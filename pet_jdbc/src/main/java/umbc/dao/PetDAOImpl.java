package umbc.dao;

import java.sql.*;
import umbc.model.Pet;
import umbc.util.ConnectionUtility;
// makes sql queries to the database
public class PetDAOImpl implements PetDAO {
  
  public Pet getPetById(int idtoFind){
    Pet pet = new Pet();

    //interact with database
    //1. get a connection
    //2. create a statement
    //3. execute the statement
    //4. process the result
    //5. close the connection

    //get and close the connection
    {

      // create a statement


      // execute query


      // process the result

    }catch (SQLException ex){
      ex.printStackTrace();
    }
  }

  public Pet addPet(Pet pet){
    
    //create a connection and close connection
    try(Connection connection = ConnectionUtility.getConnection()){
      //sql


      //crete a statement


      //execute statement


      //process the result

      // if there is a key to return

    } catch(SQLException ex){
      ex.printStackTrace();
    }
  }
}
