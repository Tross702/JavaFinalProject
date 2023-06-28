
public class App {

  public static void main(String[] args) {
    
//Instantiate a Deck and two Players, call the shuffle method on the deck.
    Deck deck = new Deck();
    deck.shuffle();
    Player player1 = new Player("Player1");
    Player player2 = new Player("Player2");
    
//Using a traditional for loop, iterate 52 times calling the Draw method on the other player each iteration using the Deck you instantiated.  
    for (int i =0; i < 52; i++) {
      if (i % 2 == 0) {
          player1.draw(deck);
      } else {
          player2.draw(deck);
      }
    }
    
//Using a traditional for loop, iterate 26 times and call the flip method for each player.
    for (int i =0; i < 26; i++) {
      Card card1 = player1.flip();
      Card card2 = player2.flip();
      System.out.println("____________________________");
      System.out.println("\nPlayer 1 has " + card1.getName());
      System.out.println("Player 2 has " + card2.getName());
 
//Compare the value of each card returned by the two player’s flip methods. Call the incrementScore method on the player whose card has the higher value.
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
      



