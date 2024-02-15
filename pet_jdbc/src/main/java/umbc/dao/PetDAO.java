package umbc.dao;
import umbc.model.Pet;

public interface PetDAO {

  // define CRUD operations

  //create
  public abstract Pet addPet(Pet pet);

  //read
  //get a pet by its id
  public abstract Pet getPetById(int id);

  //update
  public void update(int id, Pet pet);

  //delete
  public Pet delete(int id);
  
}
