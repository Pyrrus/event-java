import java.io.*;

public class App {

  public static void main(String[] args) {
    Console console = System.console();
    // for the user input for how many are coming
    int userInput = Integer.parseInt(console.readLine("How many people are going to the party: "));
    Event event = new Event(userInput); // make the event Object
    String shoppingCart = "\n\n\nEvent cost for your next party\n\n";
    shoppingCart += cost(event, 0); // set the order of the event like drinks
    event.setMany(); // reset the how many 
    shoppingCart += cost(event, 1); // set the next order of the event like drinks
    //make very input for user get the data.
    userInput = Integer.parseInt(console.readLine("What type of entertainment? \n1 for outdoor games for $100, \n2 for DJ player for $500, \n3 for Live Band for $1000: "));
    shoppingCart += "\nEnterainment info:\n";
    shoppingCart += entertainmentOutput(userInput);
    event.entertainmentCost(userInput);
    System.out.println(shoppingCart);
    System.out.println("Total cost: $" + event.getCost());
  }

  // make the food order list for how many having what.
  public static String foodOutput(int cost, int many, int userInput) {
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

  // make the order list for enterainment
  public static String entertainmentOutput(int userInput) {
    String output = "";
    if (userInput == 1) {
      output += "Outdoor games: $100\n";
    } else if (userInput == 2) {
      output += "DJ player: $500\n";
    } else {
      output += "Live Band: $1000\n";
    }
    return output;
  }

  // make the drink order list for how many having what.
  public static String drinkOutput(double cost, int many, int userInput) {
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

  // This take way to long to get it working
  // this will using the event information and at.
  // at for know which display to the user. for example
  // at is 0. it show all the dish informaiton.
  public static String cost(Event event, int at) {
    boolean manyPart1 = true;
    Console console = System.console();
    String[] type = {
      "dish",
      "drink",
      "entertainment"
    };
    String[] output = {
      "What type of dish? \n1 for light shanks for $3 per dish, \n2 for good food for $15 per dish, \n3 for highend for $45 per dish: ",
      "What type of Drink? \n1 for Water and pop for $1.5 per person, \n2 for beer and pop for $5 per person, \n3 for full bar for $16.5 per person: ",
      "What type of entertainment? \n1 for outdoor games for $100, \n2 for DJ player for $500, \n3 for Live Band for $1000: "
    };

    String input = console.readLine("Do you what all people have same " + type[at] + "? yes or no: ");
    String shoppingCart = "\n" + type[at] + " info:\n";
    int userInput = 0;
    if (input.equals("yes") || input.equals("y")) {
      userInput = Integer.parseInt(console.readLine(output[at]));
      int all = event.getPeople();
      if (at == 0) {
        int costItemFood = event.foodCost(userInput, all);
        shoppingCart += foodOutput(costItemFood, all, userInput);
      } else if (at == 1) {
        double costItemDrink = event.drinkCost(userInput, all);
        shoppingCart += drinkOutput(costItemDrink, all, userInput);
      }
    } else {
      int counter = 0;
      // this is the how many people have food or drinks.
      while (manyPart1) {
        if (counter != 0 && event.getMany() > 0) {
          input = console.readLine("Do you what to quit? q for quit: ");
        }
        if (input.equals("q") || event.getMany() <= 0) {
          manyPart1 = false;
        } else {
          int howMany = Integer.parseInt(console.readLine("How many do you what current (" + event.getMany() + ") for " + type[at] + "s: "));
          // using over from event it will test the user will not go over the how many
          while (event.over(howMany)) {
            howMany = Integer.parseInt(console.readLine("You are over the how many people: How many do you what current(" + event.getMany() + ") for " + type[at] + "s: "));
          }
          userInput = Integer.parseInt(console.readLine(output[at]));
          if (at == 0) {
            int costItemFood = event.foodCost(userInput, howMany);
            shoppingCart += foodOutput(costItemFood, howMany, userInput);
          } else if (at == 1) {
            double costItemDrink = event.drinkCost(userInput, howMany);
            shoppingCart += drinkOutput(costItemDrink, howMany, userInput);
          }
        }
        counter++;
      }
    }
    return shoppingCart;
  }
}