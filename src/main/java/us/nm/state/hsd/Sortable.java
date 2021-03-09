package us.nm.state.hsd;

import java.util.Comparator;


public interface Sortable<T> {

  void sort();

  void sort(Comparator<T> comparator);

}
