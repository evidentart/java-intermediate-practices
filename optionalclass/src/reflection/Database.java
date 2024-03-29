package reflection;

import java.util.ArrayList;
import java.util.Collections;

public class Database {
  
  private ArrayList<FoodItem> data = new ArrayList<>();
  private int idGenerator = 0;
  public static int value = 1;

  {
    Collections.addAll(data, new FoodItem(++idGenerator, "Burger", 6.99),
                             new FoodItem(++idGenerator, "Fries", 3.99),
                             new FoodItem(++idGenerator, "Soda", 1.99),
                             new FoodItem(++idGenerator, "Soda", 1.99),
                             new FoodItem(++idGenerator, "Soda", 1.99));
  }

  public void addFoodItem(FoodItem itemToAdd){
    // add id to item
    itemToAdd.setId(++idGenerator);
    data.add(itemToAdd);
  }
}
