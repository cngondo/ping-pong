import java.util.Scanner;
import java.util.List;

public class App {
  public static void main(String[] args) {
    //Prompt user input
    System.out.println("Enter a number: ");
    //Capture user input
    Scanner input = new Scanner(System.in);
    int inputNumber = input.nextInt();
    //output the result in a list object
    PingPong pingPong = new PingPong();
    List<Object> pingpongResult = pingPong.runPingPong(inputNumber);   
    System.out.println(pingpongResult);
  }
}