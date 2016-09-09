import java.io.*;

public class App {
  public static void main(String[] args) {
  	Console console = System.console();
  	int userInput = Integer.parseInt(console.readLine("How many people are going to the party: "));
	Event event = new Event(userInput);	
  }
}
