package us.nm.state.hsd;

import java.util.Comparator;

public class AceHighComparator implements Comparator<Card> {

  @Override
  public int compare(Card card1, Card card2) {
    int comparison = card1.getSuit().compareTo(card2.getSuit());
    if (comparison == 0) {
      comparison = card1.getRank().compareTo(card2.getRank());
      if(comparison!= 0 && 
        (card1.getRank()== Rank.ACE || card2.getRank()== Rank.ACE )) {
        
      }
    }
    return comparison;
  }

}
