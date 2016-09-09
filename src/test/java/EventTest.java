import org.junit.*;
import static org.junit.Assert.*;

public class EventTest {
  @Test
  public void runGame_instantiatesCorrectly() {
    Event testEvent = new Event(5);
    assertEquals(true, testEvent instanceof Event);
  }
}
