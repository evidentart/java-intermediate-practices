public class Bear extends Animal{

  @Override
  public void drink() {
    
    super.drink();

    System.out.println("The bear guzzles some cold mountain spring water");
  }

  @Override
  public String eat() {
    
    String eat = super.eat();

    return eat + " and The bear munches on some berries";
  }

  
  
}
