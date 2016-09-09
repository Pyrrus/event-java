public class Event {
  private int people;
  private double cost;
  private int howMany;

  // when on build it will set
  // the people by the user input and
  // howMany.
  public Event(int numberOfpeople) {
    people = numberOfpeople;
    cost = 0;
    howMany = numberOfpeople;
  }

  // test if the user not go over the
  // how many people.
  public boolean over(int userInput) {
    if (userInput > howMany) {
      return true;
    } else {
      howMany -= userInput;
      return false;
    }
  }

  // get people
  public int getPeople() {
    return people;
  }

  // get howMany
  public int getMany() {
    return howMany;
  }

  // set howMany to people
  public void setMany() {
    howMany = people;
  }

  // get cost
  public double getCost() {
    return cost;
  }

  // set the food cost by the what user input (for how many)
  // type of food type
  // Also, return the cost of it
  public int foodCost(int type, int userInput) {
    if (type == 1) {
      // light shanks like chips
      cost += userInput * 3;
      return userInput * 3;
    } else if (type == 2) {
      // good foods like hamburger
      cost += userInput * 15;
      return userInput * 15;
    } else {
      // highend foods like t bone
      cost += userInput * 45;
      return userInput * 45;
    }
  }

  // set the drink cost by the what user input (for how many)
  // type of drink type
  // Also, return the cost of it
  public double drinkCost(int type, int userInput) {
    if (type == 1) {
      // water and pop
      cost += userInput * 1.5;
      return userInput * 1.5;
    } else if (type == 2) {
      // can beer and pop
      cost += userInput * 5;
      return userInput * 5;
    } else {
      // full bar
      cost += userInput * 16.50;
      return userInput * 16.50;
    }
  }

  // type of enterainment and set the cost
  public void entertainmentCost(int type) {
    if (type == 1) {
      // outdoor games like 
      cost += 100;
    } else if (type == 2) {
      // DJ player
      cost += 500;
    } else {
      // live band
      cost += 1000;
    }
  }
}