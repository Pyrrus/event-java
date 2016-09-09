import java.io.*;

public class App {
  public static void main(String[] args) {
  	Console console = System.console();
  	String shoppingCart = "\n\n\nEvent cost for your next party\n\n\n";
  	int costItemFood = 0;
  	int userInput = Integer.parseInt(console.readLine("How many people are going to the party: "));
	Event event = new Event(userInput);
	boolean manyPart1 = true;
	boolean manypart2 = true;
	
	String input = console.readLine("Do you what all people have same dish? yes or no: ");
	shoppingCart += "Food info:\n";
	if (input.equals("yes") || input.equals("y")) {
	  userInput = Integer.parseInt(console.readLine("What type of dish? \n1 for light shanks for $3 per dish, \n2 for good food for $15 per dish, \n3 for highend for $45 per dish: "));
	  costItemFood = event.foodCostAll(userInput);
	  if (userInput == 1) {
	  	shoppingCart += event.getPeople() + " Light snacks per $3 per dish cost total: $" + costItemFood + "\n";
	  } else if (userInput == 2) {
	  	shoppingCart += event.getPeople() + " Good foods per $15 per dish cost total: $" + costItemFood + "\n";
	  } else {
	  	shoppingCart += event.getPeople() + " Highend foods per $45 per dish cost total: $" + costItemFood + "\n";
	  }
	} else {
	  while (manyPart1) {
	  	input = console.readLine("Do you what to quit? q for quit");
	  	if (input.equals("q") || event.getMany() <= 0) {
	  		manyPart1 = false;
	  	} else {
	  	  int howMany = Integer.parseInt(console.readLine("How many do you what current(" + event.getMany() + ") for dishs: "));
	  	  while (event.over(howMany)) {
	  	  	howMany = Integer.parseInt(console.readLine("You are over the how many people: How many do you what current(" + event.getMany() + ") for dishs: "));
	  	  }
	  	  userInput = Integer.parseInt(console.readLine("What type of dish? \n1 for light shanks for $3 per dish, \n2 for good food for $15 per dish, \n3 for highend for $45 per dish: "));
	  	 costItemFood = event.foodCost(userInput, howMany);
		  if (userInput == 1) {
		  	shoppingCart += howMany + " Light snacks per $3 per dish cost total: $" + costItemFood + "\n";
		  } else if (userInput == 2) {
		  	shoppingCart += howMany + " Good foods per $15 per dish cost total: $" + costItemFood + "\n";
		  } else {
		  	shoppingCart += howMany + " Highend foods per $45 per dish cost total: $" + costItemFood + "\n";
		  }
	  	}
	  }
	}

	event.setMany();

	manyPart1 = true;

	manypart2 = true;

	input = console.readLine("Do you what all people have same drink? yes or no: ");
	shoppingCart += "Drink info:\n";
	if (input.equals("yes") || input.equals("y")) {
	  userInput = Integer.parseInt(console.readLine("What type of Drink? \n1 for Water and pop for $1.5 per person, \n2 for beer and pop for $5 per person, \n3 for full bar for $16.5 per person: "));
	  double costItemDrink = event.drinkCostAll(userInput);
	  if (userInput == 1) {
	  	shoppingCart += event.getPeople() + " Water and pop $1.5 per person cost total: $" + costItemDrink + "\n";
	  } else if (userInput == 2) {
	  	shoppingCart += event.getPeople() + " Beer and pop per $5 per person cost total: $" + costItemDrink + "\n";
	  } else {
	  	shoppingCart += event.getPeople() + " Full bar per $16.50 per person cost total: $" + costItemDrink + "\n";
	  }
	} else {
	  while (manyPart1) {
	  	input = console.readLine("Do you what to quit? q for quit");
	  	if (input.equals("q") || event.getMany() <= 0) {
	  		manyPart1 = false;
	  	} else {
	  	  int howMany = Integer.parseInt(console.readLine("How many do you what current(" + event.getMany() + ") for drinks: "));
	  	  while (!event.over(howMany)) {
	  	  	howMany = Integer.parseInt(console.readLine("You are over the how many people: How many do you what current(" + event.getMany() + ") for drinks: "));
	  	  }
	  	  userInput = Integer.parseInt(console.readLine("What type of Drink? \n1 for Water and pop for $1.5 per person, \n2 for beer and pop for $5 per person, \n3 for full bar for $16.5 per person: "));
	  	  double costItemDrink = event.drinkCost(userInput, howMany);
		  if (userInput == 1) {
		  	shoppingCart += howMany + " Water and pop $1.5 per person cost total: $" + costItemDrink + "\n";
		  } else if (userInput == 2) {
		  	shoppingCart += howMany + " Beer and pop per $5 per person cost total: $" + costItemDrink + "\n";
		  } else {
		  	shoppingCart += howMany + " Full bar per $16.50 per person cost total: $" + costItemDrink + "\n";
		  }
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
}
