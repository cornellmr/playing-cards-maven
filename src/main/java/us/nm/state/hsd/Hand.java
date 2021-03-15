package us.nm.state.hsd;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Hand implements Sortable<Card>, Iterable <Card> {
  private List<Card> cards = new ArrayList<>();
  public Hand(Card...cards) {
    for(Card card: cards){
      add(card);
      
    }
  }
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

  @Override
  public Iterator<Card> iterator() {
    return cards.iterator();
  }
  
  public int size(){
    return cards.size();
  }
  
}
