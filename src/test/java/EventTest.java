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
  	double cost = testEvent.getCost();
    assertEquals(0.0, cost, 0.0f);
  }

  @Test
  public void runEvent_returnMany() {
    Event testEvent = new Event(5);
    int numberOfpeople = testEvent.getMany();
    assertEquals(5, numberOfpeople);
  }

  @Test
  public void runEvent_setMany() {
    Event testEvent = new Event(5);
    int userInput = 2;
    testEvent.over(userInput);
    testEvent.setMany();
    int many = testEvent.getMany();
    assertEquals(5, many);
  }

  @Test
  public void runEvent_returnOverTrue() {
    Event testEvent = new Event(5);
    int userInput = 15;
    assertEquals(true, testEvent.over(userInput));
  }

  @Test
  public void runEvent_returnOverFalse() {
    Event testEvent = new Event(5);
    int userInput = 2;
    assertEquals(false, testEvent.over(userInput));
  }

  @Test
  public void runEvent_returnCostofEntertainment() {
    int numberOfpeople = 5;
    Event testEvent = new Event(numberOfpeople);
    testEvent.entertainmentCost(2);
    double output = testEvent.getCost();
    assertEquals(500.0, output, 0.0f);
  }

  @Test
  public void runEvent_returnCostofDrink() {
    int numberOfpeople = 5;
    Event testEvent = new Event(numberOfpeople);
    testEvent.drinkCost(2, 2);
    double output = testEvent.getCost();
    assertEquals(10.0, output, 0.0f);
  }

  @Test
  public void runEvent_returnCostofFood() {
    int numberOfpeople = 5;
    Event testEvent = new Event(numberOfpeople);
    testEvent.foodCost(2, 2);
    double output = testEvent.getCost();
    assertEquals(30.0, output, 0.0f);
  }

}
