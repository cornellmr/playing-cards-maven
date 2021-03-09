package us.nm.state.hsd;

/**
 * Enumerates and encapsulates the ranks of English-pattern, French-suited playing cards.
 */
public enum Rank {

  ACE("A"), TWO("2"), THREE("3"), FOUR("4"), FIVE("5"), SIX("6"), SEVEN("7"), EIGHT("8"), NINE(
      "9"), TEN("10"), JACK("J"), QUEEN("Q"), KING("K");

  private final String symbol;

  Rank(String symbol) {
    this.symbol = symbol;
  }

  /**
   * Returns the {@link String} {@code symbol} of this instance.
   */
  public String getSymbol() {
    return symbol;
  }

}
