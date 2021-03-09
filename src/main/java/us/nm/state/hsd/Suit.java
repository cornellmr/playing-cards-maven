package us.nm.state.hsd;

/**
 * Enumerates and encapsulates the 4 suits of English-pattern, French-suited playing cards.
 */
public enum Suit {

  CLUBS(Color.BLACK, '\u2663'), DIAMONDS(Color.RED, '\u2662'), HEARTS(Color.RED,
      '\u2661'), SPADES(Color.BLACK, '\u2660');

  private final char symbol;
  private final Color color;

  Suit(Color color, char symbol) {
    this.color = color;
    this.symbol = symbol;
  }

  /**
   * Returns the {@link Color} of this instance.
   */
  public Color getColor() {
    return color;
  }


  /**
   * Returns the Unicode {@code symbol} of this instance.
   */
  public char getSymbol() {
    return symbol;
  }

  /**
   * Enumerates the colors ({@link Color#BLACK BLACK} and {@link Color#RED RED}) of English-pattern,
   * French-suited playing cards.
   */
  public enum Color {
    BLACK, RED;
  }

}
