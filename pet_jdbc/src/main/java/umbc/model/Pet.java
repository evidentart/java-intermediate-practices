package umbc.model;

public class Pet {

  //state
  private int id;
  private String name;
  private int age;
  private String species;
  private int vetId;

  //constructors
  public Pet(){

  }
  

  public Pet(String name, int age, String species, int vetId){
    this.name = name;
    this.age = age;
    this.species = species;
    this.vetId = vetId;
  }

  public Pet(int id, String name, int age, String species, int vetId){
    this.id = id;
    this.name = name;
    this.age = age;
    this.species = species;
    this.vetId = vetId;
  }

  //getters and setters
  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getSpecies() {
    return species;
  }

  public void setSpecies(String species) {
    this.species = species;
  }

  public int getVetId() {
    return vetId;
  }

  public void setVetId(int vetId) {
    this.vetId = vetId;
  }


  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + id;
    result = prime * result + ((name == null) ? 0 : name.hashCode());
    result = prime * result + age;
    result = prime * result + ((species == null) ? 0 : species.hashCode());
    result = prime * result + vetId;
    return result;
  }


  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Pet other = (Pet) obj;
    if (id != other.id)
      return false;
    if (name == null) {
      if (other.name != null)
        return false;
    } else if (!name.equals(other.name))
      return false;
    if (age != other.age)
      return false;
    if (species == null) {
      if (other.species != null)
        return false;
    } else if (!species.equals(other.species))
      return false;
    if (vetId != other.vetId)
      return false;
    return true;
  }


  @Override
  public String toString() {
    return "Pet [id=" + id + ", name=" + name + ", age=" + age + ", species=" + species + ", vetId=" + vetId + "]";
  }
  
  
}
