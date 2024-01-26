public abstract class Animal {

  abstract String eat(String food);

  abstract void drink();









  //we will use abstract class for this since animal is an abstract concept 

  // private int id;
  // String name;

  // public String eat() {
  //   return "The animal is hungry so it gets a bite to eat";
  // }

  // public void drink() {
  //   System.out.println("The animal is thirsty so it gets a sip of water");
  // }
  

  // public int getId() {
  //   return this.id;
  // }

  // public void setId(int id) {
  //   if (id > 1000){
  //     this.id = id;
  //   }else {
  //     System.out.println("Please make sure that your use id is greater than 100");
  //   }
    
    
  // }

  // @Override
  // public int hashCode() {
  //   final int prime = 31;
  //   int result = 1;
  //   result = prime * result + id;
  //   result = prime * result + ((name == null) ? 0 : name.hashCode());
  //   return result;
  // }

  // @Override
  // public boolean equals(Object obj) {
  //   if (this == obj)
  //     return true;
  //   if (obj == null)
  //     return false;
  //   if (getClass() != obj.getClass())
  //     return false;
  //   Animal other = (Animal) obj;
  //   if (id != other.id)
  //     return false;
  //   if (name == null) {
  //     if (other.name != null)
  //       return false;
  //   } else if (!name.equals(other.name))
  //     return false;
  //   return true;
  // }

  // @Override
  // public String toString() {
  //   return "Animal [id=" + id + ", name=" + name + "]";
  // }

  

}
