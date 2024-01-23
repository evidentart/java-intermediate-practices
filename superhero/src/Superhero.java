import java.util.ArrayList;
import java.util.List;

public class Superhero {
  
  String name;
  List<String> superPowers = new ArrayList<>();

  public Superhero() {
  }


  public Superhero(String name) {
    this.name = name;
  }

  public Superhero(String name, List<String> superPowers) {
    this.name = name;
    this.superPowers = superPowers;
  }


  public void addPower(String power) {
    superPowers.add(power);
  }


  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public List<String> getSuperPowers() {
    return superPowers;
  }


  public void setSuperPowers(List<String> superPowers) {
    this.superPowers = superPowers;
  }


  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((name == null) ? 0 : name.hashCode());
    result = prime * result + ((superPowers == null) ? 0 : superPowers.hashCode());
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
    Superhero other = (Superhero) obj;
    if (name == null) {
      if (other.name != null)
        return false;
    } else if (!name.equals(other.name))
      return false;
    if (superPowers == null) {
      if (other.superPowers != null)
        return false;
    } else if (!superPowers.equals(other.superPowers))
      return false;
    return true;
  }


  @Override
  public String toString() {
    return "Superhero [name=" + name + ", superPowers=" + superPowers + "]";
  }


  
  







}


