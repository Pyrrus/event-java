public class Event {
	private int people;
	private float cost;

	public Event(int numberOfpeople){
		people = numberOfpeople;
		cost = 0;
	}

	public int getPeople() {
		return people;
	}

	public float getCost() {
		return cost;
	}
}