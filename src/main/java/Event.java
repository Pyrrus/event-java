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
}