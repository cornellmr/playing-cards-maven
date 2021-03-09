package us.nm.state.hsd;

import java.util.List;
import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Deck implements Sortable<Card>, Shuffleable {
  private List<Card> cards;

  public Deck() {
    cards = new ArrayList<>();
    for (Rank rank : Rank.values()) {
      for (Suit suit : Suit.values()) {
        Card card = new Card(rank, suit);
        cards.add(card);

      }
    }
  }

  @Override
  public String toString() {
    return cards.toString();
  }

  @Override
  public void sort() {
    Collections.sort(cards);
  }

  @Override
  public void sort(Comparator<Card> comparator) {
    Collections.sort(cards, comparator);
  }

  public static void main(String[] args) {
    Deck deck = new Deck();
    System.out.println(deck);
    Collections.sort(deck.cards);
    System.out.println(deck);
    Collections.sort(deck.cards, new AceHighComparator());
    System.out.println(deck);
  }

  @Override
  public void shuffle() {
    Collections.shuffle(cards);
  }

  @Override
  public void shuffle(Random rng) {
    Collections.shuffle(cards, rng);
  }
  
}
