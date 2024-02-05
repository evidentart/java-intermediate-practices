package umbc;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.After;

public class CalculatorTest {

  private Calculator calc;

  @Before
  public void setUp() {
    System.out.println("\tBefore Test");
    calc = new Calculator();
  }

  @After
  public void tearDown() {
    System.out.println("\tAfter Test");
    calc = null;
  }

  @Test
  public void testAdd_01() {
    System.out.println("Add Test 01");
    int result = calc.add(2, 3);
    int expected = 2 + 3;

    assertTrue(result == expected);
  }

  @Test
  public void testAdd_02(){
    System.out.println("Add Test 02");
    int result = calc.add(10, 5);
    int expected = 10 + 5;

    assertEquals(result, expected);
  }
  
}
