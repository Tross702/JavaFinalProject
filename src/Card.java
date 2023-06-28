
public class Card {
  private int value;
  private String name;
  
//value (contains a value from 2-14 representing cards 2-Ace)
//name (e.g. Ace of Diamonds, or Two of Hearts)
  public Card(int value, String name) {
      this.value = value;
      this.name = name;
  }
  
//Get value method 
  public int getValue() {
      return value;
  }

//Set value method
  public void setValue(int value) {
      this.value = value;
  }
  
//Get name method
  public String getName() {
      return name;
  }
  
//Set name method
  public void setName(String name) {
      this.name = name;
  }
//describe (prints out information about a card)
  public void describe() {
      System.out.println(this.name);
  }
}
