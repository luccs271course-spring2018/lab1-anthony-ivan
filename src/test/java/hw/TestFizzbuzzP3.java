//test structure by Konstantin Läufer
package hw;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestFizzbuzzP3 {

  private FizzbuzzP3 fixture;

  @Before
  public void setUp() throws Exception {
    fixture = new FizzbuzzP3();
  }

  @After
  public void tearDown() throws Exception {
    fixture = null;
  }

  final String[] results = { "1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz", "16", "17"};
  @Test
  public void getNumbers() {
    assertNotNull(fixture);
    assertEquals(null, fixture.fizzBuzzArray(-10));
    assertEquals(null, fixture.fizzBuzzArray(-1));
    assertEquals(null, fixture.fizzBuzzArray(0));
    assertEquals("1", fixture.fizzBuzzArray(1));
    assertEquals(Arrays.asList(Arrays.copyOfRange(abc, 0, 6)), fixture.fizzBuzzArray(7));
    assertEquals(Arrays.asList(Arrays.copyOfRange(abc, 0, 16)), fixture.fizzBuzzArray(17));
  }
}
