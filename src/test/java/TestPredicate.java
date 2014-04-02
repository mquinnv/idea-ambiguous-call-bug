import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.Iterator;

public class TestPredicate
  extends TestCase {
  public void testPredicate() {
    final Predicate<Integer> predicate = new Predicate<>();
    assertTrue(predicate.test(new ArrayList<Integer>()));
    assertFalse(predicate.test(new Iterable<Integer>() {
      @Override
      public Iterator<Integer> iterator() {
        return new ArrayList<Integer>().iterator();
      }
    }));
  }
}
