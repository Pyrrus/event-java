import java.io.*;

public class App {
  public static void main(String[] args) {
  	Console console = System.console();
  	String shoppingCart = "\n\n\nEvent cost for your next party\n\n\n";
  	int costItemFood = 0;
  	int userInput = Integer.parseInt(console.readLine("How many people are going to the party: "));
	Event event = new Event(userInput);	
	
	String input = console.readLine("Do you what all people have same dish? yes or no: ");
	shoppingCart += "Food info:\n";
	if (input.equals("yes") || input.equals("y")) {
	  userInput = Integer.parseInt(console.readLine("What type of dish? 1 for light shanks for $3 per dish, 2 for good food for $15 per dish, 3 for highend for $45 per dish: "));
	  costItemFood = event.foodCostAll(userInput);
	  if (userInput == 1) {
	  	shoppingCart += "Light snacks per $3 per dish cost total: $" + costItemFood + "\n";
	  } else if (userInput == 2) {
	  	shoppingCart += "Good foods per $15 per dish cost total: $" + costItemFood + "\n";
	  } else {
	  	shoppingCart += "Highend foods per $45 per dish cost total: $" + costItemFood + "\n";
	  }
	} else {
	  System.out.println("ININININ for no");
	}

	input = console.readLine("Do you what all people have same drink? yes or no: ");
	shoppingCart += "Drink info:\n";
	if (input.equals("yes") || input.equals("y")) {
	  userInput = Integer.parseInt(console.readLine("What type of Drink? \n1 for Water and pop for $1.5 per person, \n2 for beer and pop for $5 per person, \n3 for full bar for $16.5 per person: "));
	  double costItemDrink = event.drinkCostAll(userInput);
	  if (userInput == 1) {
	  	shoppingCart += "Water and pop $1.5 per person cost total: $" + costItemDrink + "\n";
	  } else if (userInput == 2) {
	  	shoppingCart += "Beer and pop per $5 per person cost total: $" + costItemDrink + "\n";
	  } else {
	  	shoppingCart += "Full bar per $16.50 per person cost total: $" + costItemDrink + "\n";
	  }
	} else {
	  System.out.println("ININININ for no");
	}

	userInput = Integer.parseInt(console.readLine("What type of entertainment? \n1 for outdoor games for $100, \n2 for DJ player for $500, \n3 for Live Band for $1000: "));
	event.entertainmentCost(userInput);
	if (userInput == 1) {
	 shoppingCart += "Outdoor games: $100\n";
	} else if (userInput == 2) {
	 shoppingCart += "DJ player: $500\n";
	} else {
	 shoppingCart += "Live Band: $1000\n";
	}

	System.out.println(shoppingCart);
	System.out.println("Total cost: $" + event.getCost());

  }
}
