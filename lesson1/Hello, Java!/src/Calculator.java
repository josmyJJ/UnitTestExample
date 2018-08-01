import java.util.Scanner;

public class Calculator {

  private static int num1 = 4;
  private static int num2 = 4;

  public Calculator(int n1, int n2){
    num1 = n1;
    num2 = n2;
  }

  public static int add(){
    return num1 + num2;
  }

  public static int addUserInput(int input1, int input2 ){
    return input1 + input2;
  }

}
