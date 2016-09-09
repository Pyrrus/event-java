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

  @Test
  public void runEvent_returnOverTrue() {
    Event testEvent = new Event(5);
    int userInput = 15;
    assertEquals(true, testEvent.over(userInput));
  }

  @Test
  public void runEvent_returnOverFalse() {
    Event testEvent = new Event(5);
    int userInput = 8;
    assertEquals(false, testEvent.over(userInput));
  }

  @Test
  public void runEvent_returnCostofFood() {
    int numberOfpeople = 5;
    Event testEvent = new Event(numberOfpeople);
    testEvent.foodCost(2);
    float output = testEvent.getCost();
    assertEquals(75.0, output, 0.0f);
  }

  @Test
  public void runEvent_returnCostofDrink() {
    int numberOfpeople = 5;
    Event testEvent = new Event(numberOfpeople);
    testEvent.drinkCost(2);
    float output = testEvent.getCost();
    assertEquals(25.0, output, 0.0f);
  }

  @Test
  public void runEvent_returnCostforDrinkandFood() {
    int numberOfpeople = 5;
    Event testEvent = new Event(numberOfpeople);
    testEvent.drinkCost(2);
    testEvent.foodCost(2);
    float output = testEvent.getCost();
    assertEquals(100.0, output, 0.0f);
  }

  @Test
  public void runEvent_returnCostofEntertainment() {
    int numberOfpeople = 5;
    Event testEvent = new Event(numberOfpeople);
    testEvent.entertainmentCost(2);
    float output = testEvent.getCost();
    assertEquals(500.0, output, 0.0f);
  }

  @Test
  public void runEvent_returnCostofDrinkandEntertainment() {
    int numberOfpeople = 5;
    Event testEvent = new Event(numberOfpeople);
    testEvent.drinkCost(2);
    testEvent.entertainmentCost(2);
    float output = testEvent.getCost();
    assertEquals(525.0, output, 0.0f);
  }

  @Test
  public void runEvent_returnCostforDrinkandFoodandEntertainment() {
    int numberOfpeople = 5;
    Event testEvent = new Event(numberOfpeople);
    testEvent.drinkCost(2);
    testEvent.foodCost(2);
    testEvent.entertainmentCost(2);
    float output = testEvent.getCost();
    assertEquals(600.0, output, 0.0f);
  }

}
