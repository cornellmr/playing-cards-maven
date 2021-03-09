package us.nm.state.hsd;

/**
 * Encapsulates the immutable attributes of a standard playing card, following the English pattern
 * of French-suited playing cards.
 */
public class Card implements Comparable<Card> {

  private final Rank rank;
  private final Suit suit;

  /**
   * Initializes this instance with the specified {@link Rank} and {@link Suit}.
   * 
   * @param rank {@link Rank} of this instance.
   * @param suit {@link Suit} of this instance.
   */
  public Card(Rank rank, Suit suit) {
    this.rank = rank;
    this.suit = suit;
  }

  /**
   * Returns the {@link Rank rank} of this instance.
   */
  public Rank getRank() {
    return rank;
  }

  /**
   * Returns the {@link Suit suit} of this instance.
   */
  public Suit getSuit() {
    return suit;
  }

  /**
   * Constructs and returns the {@link String} symbol of this instance, consisting of the symbol of
   * its {@link Rank rank}, followed by the symbol of its {@link Suit suit}.
   */
  public String getSymbol() {
    return String.format("%s%s", rank.getSymbol(), suit.getSymbol());
  }

  /**
   * Constructs and returns a {@link String} representation of this instance. This method returns
   * the same value as that returned by {@link #getSymbol()}.
   */
  @Override
  public String toString() {
    return getSymbol();
  }

  @Override
  public int compareTo(Card other) {
    int comparison = suit.compareTo(other.suit);
    if (comparison == 0) {
      comparison = rank.compareTo(other.rank);
    }
    return comparison;
  }

}
