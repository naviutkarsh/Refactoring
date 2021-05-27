import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TextStatementTest {

  @Test
  public void shouldPrintHeaderLine(){
    assertEquals("Rental Record for Bob\n", new TextStatement().header("Bob"));
  }
}
