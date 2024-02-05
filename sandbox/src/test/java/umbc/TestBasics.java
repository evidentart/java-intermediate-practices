package umbc;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.After;



public class TestBasics {
  
  @BeforeClass
  public static void setUpBeforeClass()  {
    System.out.println("\t\tBefore Class Method");
  }

  @AfterClass
  public static void tearDownAfterClass() {
    System.out.println("\t\tAfter Class Method");
  }

  @Before
  public void setUp() {
    System.out.println("\tBefore Test");
  }

  @After
  public void tearDown() {
    System.out.println("\tAfter Test");
  }

  @Test
  public void testMethod_01(){
    System.out.println("Test Method 01 - Pass");
    assertTrue(true);
  }

  @Test(expected = IndexOutOfBoundsException.class)
  public void problemMethod_02(){
    System.out.println("Problem Method 2");
    int[] nums = {};
    System.out.println(nums[5]);
  }

}
