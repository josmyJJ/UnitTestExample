import org.junit.Test;

import java.util.Scanner;

import static org.junit.Assert.*;

public class HelloJavaTest {

  Scanner input = new Scanner(System.in);

  @Test
  public void testSolution() {
    assertEquals("You should say hello to Java",
            "Hello, Java!", HelloJava.sayHello());
  }

  @Test
  public void testadd() {
    assertEquals("Solution should be 8",
            8 , Calculator.add());
  }

  @Test
  public void addUserInput() {
    assertEquals("Solution should be 12",
            12 , Calculator.addUserInput(9, 3));
  }

  @Test
  public void addUserInput2() {
    System.out.println("Test...") ;
    Calculator S = new Calculator(20,2) ;
    assertEquals("Solution should be 22",
            22 , Calculator.add());
  }


}