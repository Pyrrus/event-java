public class Event {
	private int people;
	private float cost;
	private int howMany;
	private String shoppingCart;

	public Event(int numberOfpeople){
		people = numberOfpeople;
		cost = 0;
		howMany = numberOfpeople;
		shoppingCart = "";
	}

	public boolean over(int userInput) {
		if (userInput > howMany) {
			return true;
		} else {
			howMany -= userInput;
			return false;
		}
	}

	public int getPeople() {
		return people;
	}

	public float getCost() {
		return cost;
	}

	public void foodCostAll(int type) {
		shoppingCart += "Food info:\n";
		if (type == 1) {
			// light shanks like chips
			cost += people * 3;
			shoppingCart += "Light snacks cost: $" + people * 3 + "\n";
		} else if (type == 2) {
			// good foods like hamburger
			shoppingCart += "Good foods cost: $" + people * 15 + "\n";
			cost += people * 15;
		} else {
			// highend foods like t bone
			shoppingCart += "Highend food cost: $" + people * 45 + "\n";
			cost += people * 45;
		}
	}

	public void drinkCostAll(int type) {
		shoppingCart += "Drink info:\n";
		if (type == 1) {
			// water and pop
			shoppingCart += "Water and pop cost: $" + people * 1.5 + "\n";
			cost += people * 1.5;
		} else if (type == 2) {
			// can beer and pop
			shoppingCart += "Beer and pop cost: $" + people * 5 + "\n";
			cost += people * 5;
		} else {
			// full bar
			shoppingCart += "Full bar cost: $" + people * 1.5 + "\n";
			cost += people * 16.50;
		}
	}

	public void entertainmentCost(int type) {
		shoppingCart += "Entertainment info:\n";
		if (type == 1) {
			// outdoor games like 
			shoppingCart += "Outdoor games: $100\n";
			cost += 100;
		} else if (type == 2) {
			// DJ player
			shoppingCart += "DJ player: $500\n";
			cost += 500;
		} else {
			// live band
			shoppingCart += "Live Band: $1000\n";
			cost += 1000;
		}
	}
}