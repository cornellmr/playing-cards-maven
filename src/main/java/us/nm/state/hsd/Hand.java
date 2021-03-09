package us.nm.state.hsd;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Hand implements Sortable<Card> {
  private List<Card> cards = new ArrayList<>();

  @Override
  public void sort() {
    Collections.sort(cards);
  }

  @Override
  public void sort(Comparator<Card> comparator) {
    Collections.sort(cards, comparator);
  }

  public void add(Card card) {
    cards.add(card);
  }

  public Hand() {

  }

  @Override
  public String toString() {
    return (cards.toString());
  }

}
