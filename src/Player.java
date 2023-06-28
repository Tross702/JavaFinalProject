import java.util.ArrayList;
import java.util.List;

public class Player {
  private List<Card> hand;
  private int score;
  private String name;

/* hand (List of Card)
  score (set to 0 in the constructor)
  name
   */
  public Player(String name) {
    hand = new ArrayList<>();
    score = 0;
    this.name = name;
}

  public int getScore() {
    return score;
}

//incrementScore (adds 1 to the Player’s score field)
  public void incrementScore() {
    score++;
}

//describe (prints out information about the player and calls the describe method for each card in the Hand List)
  public void describe() {
    System.out.println(name + ":");
    for (Card card : hand) {
        card.describe();
    }
    System.out.println("Score: " + score);
}

//flip (removes and returns the top card of the Hand)
  public Card flip() {
    return hand.remove(0);
}

/*draw (takes a Deck as an argument and calls the draw method on the deck,
adding the returned Card to the hand field)
  */
  public void draw(Deck deck) {
    hand.add(deck.draw());
  }
}
