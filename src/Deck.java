
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Deck {
  private List<Card> cards;

//cards (List of Card) 
  public Deck() {
    cards = new ArrayList<>();
    String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
    cards = new ArrayList<>();
    for (String suit : suits) {
        for (int value = 2; value <= 14; value++) {
            String name;
            switch (value) {
                case 11:
                    name = "Jack";
                    break;
                case 12:
                    name = "Queen";
                    break;
                case 13:
                    name = "King";
                    break;
                case 14:
                    name = "Ace";
                    break;
                default:
                    name = Integer.toString(value);
                    break;
            }
            name += " of " + suit;
            cards.add(new Card(value, name));
        }
    }
}

//shuffle (randomizes the order of the cards)
public void shuffle() {
    Random rand = new Random();
    for (int i = cards.size() - 1; i > 0; i--) {
        int j = rand.nextInt(i + 1);
        Card temp = cards.get(i);
        cards.set(i, cards.get(j));
        cards.set(j, temp);
    }
}

//draw (removes and returns the top card of the Cards field)
public Card draw() {
    return cards.remove(0);
  }
}
