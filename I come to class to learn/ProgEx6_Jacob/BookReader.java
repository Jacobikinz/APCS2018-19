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

public class BookReader{
  public static void main(String[] args) {
    //Creating a scanner and a variable to hold the scanner's value
    Scanner read=new Scanner(System.in);
    int reader;

    //Making some pages
    Page page1=new Page("We the people, blah blah blah.");
    Page page2=new Page("Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.");

    //Making some books
    Book book1=new Book(546,"Don Quixote",page1);
    Book book2=new Book(29,page2);
    Book book3=new Book(56,"Romeo and Juliet");
    Book book4=new Book();

    //Making arrays of books to put on the shelves
    Book[] topShelf={book1,book2};
    Book[] bottomShelf={book3,book4};

    //The bookshelf
    Bookshelf myShelf=new Bookshelf(topShelf,bottomShelf);

    //The start of the dialogue
    System.out.println("Which bookshelf would you like to look at today, 1 or 2?");
    reader=read.nextInt();

    //If the user chooses to look at the top shelf
    if(reader==1){
      System.out.println("The top shelf contains "+myShelf.getBooks(1).length+" books. Which one would you like to read?");
      reader=read.nextInt();

      //If the user decides to look at the first book
      if(reader==1){
        System.out.println(myShelf.getBook(1,1).toString());
        book1.setPages(250);
        book1.rewriteName("The Gallant Knight");
        System.out.println("The book's title now reads: "+book1.name()+", and it has "+book1.pages()+" pages.");
      }

      //If the user decides to look at the second book
      else if(reader==2){
        System.out.println(myShelf.getBook(1,2).toString());
        book2.rip(15);
        System.out.println("The book now has "+myShelf.getBook(1,2).pages()+" pages.");
        System.out.println(myShelf.getBook(1,2).sameLength(myShelf.getBook(1,1)));
      }
    }

    //If the user chooses to look at the bottom shelf
    else if(reader==2){
      System.out.println(myShelf.getBook(2,1).toString());
      reader=read.nextInt();

      //If the user decides to look at the first book
      if(reader==1){
        System.out.println("The first book is called "+myShelf.getBook(2,1).name()+", it has "+myShelf.getBook(2,1).pages()+" pages. The first page reads: "+myShelf.getBook(2,1).firstPage().read());
        book3.firstPage().rewrite("Wherefore art thou, Ariel?");//Easter egg
        System.out.println("The first page now reads: "+myShelf.getBook(2,1).firstPage().read());
      }

      //If the user decides to look at the second book
      else if(reader==2){
        System.out.println(myShelf.getBook(2,2).toString());
        book4.scratchOut();
        System.out.println("The book's title now reads: "+myShelf.getBook(2,2).name());
        book4.rewriteName("We Like to Party");
        System.out.println("The book's title now reads: "+myShelf.getBook(2,2).name());
      }
    }
  }
}
