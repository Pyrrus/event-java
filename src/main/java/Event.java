public class Event {
	private int people;
	private float cost;
	private int howMany;

	public Event(int numberOfpeople){
		people = numberOfpeople;
		cost = 0;
		howMany = 10;
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

	public void foodCost (int type) {
		if (type == 1) {
			// light shanks like chips
			cost += people * 3;
		} else if (type == 2) {
			// good foods like hamburger
			cost += people * 15;
		} else {
			// highend foods like t bone
			cost += people * 45;
		}
	}

	public void drinkCost (int type) {
		if (type == 1) {
			// water and pop
			cost += people * 1.5;
		} else if (type == 2) {
			// can beer and pop
			cost += people * 5;
		} else {
			// full bar
			cost += people * 16.50;
		}
	}
}