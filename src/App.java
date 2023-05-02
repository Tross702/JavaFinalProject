
public class App {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Deck deck = new Deck();
    deck.shuffle();
    Player player1 = new Player("Player1");
    Player player2 = new Player("Player2");
    
    for (int i =0; i < 52; i++) {
      if (i % 2 == 0) {
          player1.draw(deck);
      } else {
          player2.draw(deck);
      }
    }
    
    for (int i =0; i < 26; i++) {
      Card card1 = player1.flip();
      Card card2 = player2.flip();
      System.out.println("____________________________");
      System.out.println("\nPlayer 1 has " + card1.getName());
      System.out.println("Player 2 has " + card2.getName());
      
      if (card1.getValue() > card2.getValue()) {
        player1.incrementScore();
        System.out.println("Player 1 wins!");
      } else if (card1.getValue() < card2.getValue()) {
        player2.incrementScore();
        System.out.println("Player 2 wins!");
      } else {
        System.out.println("Draw!");
      }
      System.out.println("____________________________");
      System.out.println("\nCurrent scores:");
      System.out.println("Player 1: " + player1.getScore());
      System.out.println("Player 2: " + player2.getScore());
      }
      
      System.out.println("____________________________");
      System.out.println("\nFinal score:");
      System.out.println("Player 1: " + player1.getScore());
      System.out.println("Player 2: " + player2.getScore());

      if (player1.getScore() > player2.getScore()) {
      System.out.println("Player 1 wins the game!");
      } else if (player2.getScore() > player1.getScore()) {
      System.out.println("Player 2 wins the game!");
      } else {
      System.out.println("Draw!");
     }  
   }
 }
      



