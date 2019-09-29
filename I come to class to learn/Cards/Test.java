/**This is a driver class that tests the Card and Deck class.
**/

public class Test
{
    /**A Deck will be made using the default constructor and the Spades
     * will be removed.  The deck will also be printed between each action.
     */
    public static void main(String[] args)
    {
        Deck myDeck=new Deck();
        System.out.println(myDeck);
        System.out.println(myDeck.getSpades());
        myDeck.removeSpades();
        System.out.println(myDeck);
    }
}
