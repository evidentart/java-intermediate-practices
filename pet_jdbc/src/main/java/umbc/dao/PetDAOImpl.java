package umbc.dao;

import java.sql.*;
import umbc.model.Pet;
import umbc.util.ConnectionUtility;
// makes sql queries to the database
public class PetDAOImpl implements PetDAO {
  
  Connection connection =ConnectionUtility.getConnection();


  //getPetById method exposed to sql injection, use the prepared statement as in addPet statement
  public Pet getPetById(int idtoFind){
    Pet pet = new Pet();

    //interact with database
    //1. get a connection
    //2. create a statement
    //3. execute the statement
    //4. process the result
    //5. close the connection

    //get and close the connection
    try{

      // create a statement
      String sql = "SELECT * FROM pet WHERE id = " + idtoFind;
      Statement statement = connection.createStatement();

      // execute query
      ResultSet rs = statement.executeQuery(sql);

      // process the result
      while(rs.next()){
        int petid = rs.getInt("id");
        String petName = rs.getString("pet_name");
        int petAge = rs.getInt("age");
        String petSpecies = rs.getString("species");
        int petVetId = rs.getInt("vet_id");
        
        //create a pet from pet constructor for corresponding values
        pet = new Pet(petid, petName, petAge, petSpecies, petVetId);
      }

    }catch (SQLException ex){
      ex.printStackTrace();
    }

    return pet;
  }

  

  public Pet addPet(Pet pet){
    
    //create a connection and close connection
    try{
      //sql
      String sql = "INSERT INTO pet VALUES (default,?, ?, ?, ?)";

      //crete a statement
      PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
      statement.setString(1, pet.getName());
      statement.setInt(2, pet.getAge());
      statement.setString(3, pet.getSpecies());
      statement.setInt(4, pet.getVetId());

      //execute statement
      statement.executeUpdate();

      //process the result
      ResultSet keys = statement.getGeneratedKeys();

      // if there is a key to return
      if(keys.next()){
        return new Pet(keys.getInt(1), pet.getName(), pet.getAge(), pet.getSpecies(), pet.getVetId());
      }

    } catch(SQLException ex){
      ex.printStackTrace();
    }

    return null;
  }

  public void update(int id, Pet pet){
    
  }

  public Pet delete(int id){
    return null;
  }
}
