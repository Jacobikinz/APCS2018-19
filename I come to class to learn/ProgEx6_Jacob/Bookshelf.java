/**
 * @author Jacob Urisman
 * @version 12/2/18
 * Comp Sci
 * Programming exercise
 */

//My common header in case I need any of these classes
import java.util.*;
import java.text.*;
import javax.swing.*;

public class Bookshelf{
  //Instance variables for bookshelf
  //These are arrays of books, because bookshelves contain multiple books
  private Book[] firstShelf;
  private Book[] secondShelf;

  //Constructor for bookshelf
  public Bookshelf(Book[] first,Book[] second){
    firstShelf=first;
    secondShelf=second;
  }

  //Since you can't set a bookshelf, there are no setters

  //Getters for Bookshelf
  public Book[] getBooks(int n){ //This getter returns all of the books on the shelf
    if(n==1)
      return firstShelf;
    else if(n==2)
      return secondShelf;
    else
      return null;
  }
  public Book getBook(int n, int i){ //This getter returns one book on the shelf
    if(n==1)
      return firstShelf[i-1];
    else if(n==2)
      return secondShelf[i-1];
    else
      return null;
  }
}
