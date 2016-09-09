import org.junit.*;
import static org.junit.Assert.*;

public class EventTest {
  @Test
  public void runEvent_instantiatesCorrectly() {
    Event testEvent = new Event(5);
    assertEquals(true, testEvent instanceof Event);
  }

  @Test
  public void runEvent_returnPeople() {
  	Event testEvent = new Event(5);
  	int numberOfpeople = testEvent.getPeople();
  	assertEquals(5, numberOfpeople);
  }

  @Test
  public void runEvent_returnCost() {
  	Event testEvent = new Event(5);
  	float cost = testEvent.getCost();
    assertEquals(0.0, cost, 0.0f);
  }
}
