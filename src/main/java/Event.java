public class Event {
	private int people;
	private double cost;
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

	public int getMany() {
		return howMany;
	}

	public void setMany() {
		howMany = people;
	}

	public double getCost() {
		return cost;
	}

	public int foodCostAll(int type) {
		if (type == 1) {
			// light shanks like chips
			cost += people * 3;
			return people * 3;
		} else if (type == 2) {
			// good foods like hamburger
			cost += people * 15;
			return people * 15;
		} else {
			// highend foods like t bone
			cost += people * 45;
			return people * 45;
		}
	}

	public double drinkCostAll(int type) {
		if (type == 1) {
			// water and pop
			cost += people * 1.5;
			return people * 1.5;
		} else if (type == 2) {
			// can beer and pop
			cost += people * 5;
			return people * 5;
		} else {
			// full bar
			cost += people * 16.50;
			return people * 16.50;
		}
	}

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