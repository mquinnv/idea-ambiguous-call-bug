import java.util.Collection;

public class Predicate<T> {


  <S extends T> boolean test(final Collection<S> src) {
    return true;
  }
  <S extends T> boolean test(final Iterable<S> iterable) {
    return false;
  }
}
