import java.io.*;

public class App {
  public static void main(String[] args) {
  	Console console = System.console();
  	String shoppingCart = "\n\n\nEvent cost for your next party\n\n\n";
  	int costItemFood = 0;
	boolean manyPart1 = true;
	int userInput = 0;
	String input = "";

	userInput = Integer.parseInt(console.readLine("How many people are going to the party: "));
	Event event = new Event(userInput);

	input = console.readLine("Do you what all people have same dish? yes or no: ");
	shoppingCart += "Food info:\n";

	if (input.equals("yes") || input.equals("y")) {
	  userInput = Integer.parseInt(console.readLine("What type of dish? \n1 for light shanks for $3 per dish, \n2 for good food for $15 per dish, \n3 for highend for $45 per dish: "));
	  int all = event.getPeople();
	  costItemFood = event.foodCost(userInput, all);
	  shoppingCart += foodOutput(costItemFood, all, userInput);
	} else {
	  while (manyPart1) {
	  	input = console.readLine("Do you what to quit? q for quit: ");
	  	if (input.equals("q") || event.getMany() <= 0) {
	  		manyPart1 = false;
	  	} else {
	  	  int howMany = Integer.parseInt(console.readLine("How many do you what current (" + event.getMany() + ") for dishs: "));
	  	  while (event.over(howMany)) {
	  	  	howMany = Integer.parseInt(console.readLine("You are over the how many people: How many do you what current(" + event.getMany() + ") for dishs: "));
	  	  }
	  	  userInput = Integer.parseInt(console.readLine("What type of dish? \n1 for light shanks for $3 per dish, \n2 for good food for $15 per dish, \n3 for highend for $45 per dish: "));
	  	  costItemFood = event.foodCost(userInput, howMany);
		  shoppingCart += foodOutput(costItemFood, howMany, userInput);
	  	}
	  }
	}

	event.setMany();

	manyPart1 = true;

	input = console.readLine("Do you what all people have same drink? yes or no: ");
	shoppingCart += "Drink info:\n";
	if (input.equals("yes") || input.equals("y")) {
	  userInput = Integer.parseInt(console.readLine("What type of Drink? \n1 for Water and pop for $1.5 per person, \n2 for beer and pop for $5 per person, \n3 for full bar for $16.5 per person: "));
	  int all = event.getPeople();
	  double costItemDrink = event.drinkCost(userInput, all);
	  shoppingCart += drinkOutput(costItemDrink, all, userInput);
	} else {
	  while (manyPart1) {
	  	input = console.readLine("Do you what to quit? q for quit: ");
	  	if (input.equals("q") || event.getMany() <= 0) {
	  		manyPart1 = false;
	  	} else {
	  	  int howMany = Integer.parseInt(console.readLine("How many do you what current (" + event.getMany() + ") for drinks: "));
	  	  while (event.over(howMany)) {
	  	  	howMany = Integer.parseInt(console.readLine("You are over the how many people: How many do you what current(" + event.getMany() + ") for drinks: "));
	  	  }
	  	  userInput = Integer.parseInt(console.readLine("What type of Drink? \n1 for Water and pop for $1.5 per person, \n2 for beer and pop for $5 per person, \n3 for full bar for $16.5 per person: "));
	  	  double costItemDrink = event.drinkCost(userInput, howMany);
		  shoppingCart += drinkOutput(costItemDrink, howMany, userInput);
	  	}
	  }
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

  public static String foodOutput (int cost, int many, int userInput) {
  	String output = "";
	if (userInput == 1) {
	  output += many + " Light snacks per $3 per dish cost total: $" + cost + "\n";
	} else if (userInput == 2) {
	  output += many + " Good foods per $15 per dish cost total: $" + cost + "\n";
	} else {
	  output += many + " Highend foods per $45 per dish cost total: $" + cost + "\n";
	}
	return output;
  }

  public static String drinkOutput (double cost, int many, int userInput) {
  	String output = "";
  	if (userInput == 1) {
	  	output += many + " Water and pop $1.5 per person cost total: $" + cost + "\n";
	  } else if (userInput == 2) {
	  	output += many + " Beer and pop per $5 per person cost total: $" + cost + "\n";
	  } else {
	  	output += many + " Full bar per $16.50 per person cost total: $" + cost + "\n";
	  }

	return output;
  }
}
