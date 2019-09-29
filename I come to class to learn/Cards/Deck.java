import java.util.ArrayList;

/**
 * This class has an ArrayList (of Cards) as an instance variable.  It has
 * a one parameter constructor and a default constructor, accessor method
 * for the ArrayList and a toString method.
 *
 */

public class Deck
{
    //instance variable for the deck of Cards
    private ArrayList<Card> myDeck;

    /**Constructor with the deck being passed as a parameter**/
    public Deck(ArrayList<Card> deck)
    {
        myDeck = deck;
    }

    /**Default Constructor - if no deck is passed, theDeck becomes
     * a standard 52 Card deck.
     */
    public Deck()
    {
        String suit;
        int num;
        myDeck = new ArrayList<Card>();

        for(int i = 0; i<52; i++)
        {
            if(i/13==0) suit = "Spades";
            else if(i/13==1) suit = "Hearts";
            else if(i/13==2) suit = "Clubs";
            else suit = "Diamonds";

            num = i%13 + 1;

            myDeck.add(new Card(num, suit));
        }
      }

      /**accessor method for theDeck**/
      public ArrayList<Card> getDeck()
      {
          return myDeck;
      }

      /**toString method that returns the ArrayList theDeck's toString**/
      public String toString()
      {
          return myDeck.toString();
      }

      public ArrayList<Card> getSpades(){
        ArrayList<Card> result=new ArrayList<>();
        for(Card x:myDeck){
          if(x.suit().equals("Spades")){
            result.add(x);
          }
        }
        return result;
        /*
        for(int i=0;i<52;i++){
          if(myDeck[i].suit.equals("Spades"))
            result.add(myDeck[i]);
        }
        */
      }
      public void removeSpades(){
        for(int i=0;i<myDeck.size();i++){
          if(myDeck.get(i).suit().equals("Spades")){
            myDeck.remove(i);
            i--;
          }
        }
        /*
        for(int i=myDeck.size()-1;i>=0;i--){
          if(myDeck.get(i).suit().equals("Spades")){
            myDeck.remove(i);
          }
        }
        */
      }
}
