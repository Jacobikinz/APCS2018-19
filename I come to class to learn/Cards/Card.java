/**
 * The Card class represents a Card with a numerical value and suit.  
 * There is a two parameter constructor, accessor methods for these two
 * instance variables, as well as equals, and toString methods.
 */

public class Card
{
    //instance variables representing the Card's value and suit
    private int value;
    private String suit;
    
    /** Two parameter constructor**/
    public Card(int v, String s)
    {
        value = v;
        suit = s;
    }
    
    /**accessor method that returns the Card's value**/
    public int value()
    {   return value;}
    
    /**accessor method that returns the Card's suit**/
    public String suit()
    {   return suit;}

    /**toString method, return the Card's value and suit as a String**/
    public String toString()
    {
        return value + " " + suit;
    }
    
}