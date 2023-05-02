import java.util.ArrayList;
import java.util.List;

public class Player {
  private List<Card> hand;
  private int score;
  private String name;

  public Player(String name) {
    hand = new ArrayList<>();
    score = 0;
    this.name = name;
}

public int getScore() {
    return score;
}

public void incrementScore() {
    score++;
}

public void describe() {
    System.out.println(name + ":");
    for (Card card : hand) {
        card.describe();
    }
    System.out.println("Score: " + score);
}

public Card flip() {
    return hand.remove(0);
}

public void draw(Deck deck) {
    hand.add(deck.draw());
  }
}
