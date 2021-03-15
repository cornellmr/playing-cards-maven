package us.nm.state.hsd;

import java.util.Comparator;
import java.util.Map;

public class BlackjackComparator implements Comparator<Hand> {
  private static final int GOAL = 21;
  private static final int SOFT_INCREMENT = 10;
  private static final Map<Rank, Integer> RANK_VALUES = Map.ofEntries(Map.entry(Rank.ACE, 1),
      Map.entry(Rank.TWO, 2), Map.entry(Rank.THREE, 3), Map.entry(Rank.FOUR, 4),
      Map.entry(Rank.FIVE, 5), Map.entry(Rank.SIX, 6), Map.entry(Rank.SEVEN, 7),
      Map.entry(Rank.EIGHT, 8), Map.entry(Rank.NINE, 9), Map.entry(Rank.TEN, 10),
      Map.entry(Rank.JACK, 10), Map.entry(Rank.QUEEN, 10), Map.entry(Rank.KING, 10));

  @Override
  public int compare(Hand hand1, Hand hand2) {
    return getvalue(hand1) - getvalue(hand2);
  }

  private int getvalue(Hand hand) {
    int value = 0;
    boolean soft = false;
    for (Card card : hand) {
      value += RANK_VALUES.get(card.getRank());
      if (card.getRank() == Rank.ACE) {
        if (!soft && value <= GOAL - SOFT_INCREMENT) {
          soft = true;
          value += SOFT_INCREMENT;
        }
      }
    }
    if (value > GOAL && soft) {
      soft = false;
      value -= SOFT_INCREMENT;
    }
    if (value > GOAL) {
      value = -1;
    } else if (value == GOAL && hand.size() == 2) {
      value++;
    }
    return value;

  }
}
