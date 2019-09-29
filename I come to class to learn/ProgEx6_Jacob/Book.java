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

public class Book {
  //Instance variables for Book
  private int pages;
  private String name;
  private Page firstPage;

  //Constructors for book
  public Book(int p,String n){ //A book with a worn out first page
    pages=p;
    name=n;
    firstPage=new Page("The page is too worn to read.");
  }
  public Book(int p, String n, Page f){ //A brand new book
    pages=p;
    name=n;
    firstPage=f;
  }
  public Book(int p,Page f){ //A book with a worn out title
    pages=p;
    name="The name is too worn to read.";
    firstPage=f;
  }
  public Book(){ //A very old book
    pages=(int)(1000*Math.random());
    name="The name is too worn to read.";
    firstPage=new Page("The page is too worn to read.");
  }

  //Setters for book
  public void setPages(int newPages){ //Set the number of pages
    pages=newPages;
    System.out.println("You change the number of pages.");
  }
  public void rewriteName(String newName){ //Rewrite the name of the book
    name=newName;
    System.out.println("You rewrite the book's name.");
  }

  //Getters for book
  public int pages(){ //Get the number of pages
    return pages;
  }
  public String name(){ //Get the book title
    return name;
  }
  public Page firstPage(){ //Get the first page
    return firstPage;
  }

  //Additional methods
  public void rip(int num){ //Rip out some pages
    pages-=num;
    System.out.println("You rip out some pages.");
  }
  public void scratchOut(){ //Scratch out the name of the book
    name="The name is scratched out.";
    System.out.println("You scratch out the book's name.");
  }

  //toString() method
  public String toString(){
    return "The book is called: "+this.name()+", it has "+this.pages()+" pages. The first page reads: "+this.firstPage().read();
  }

  //equals() method
  public String sameLength(Book other){
    if (this.pages()==other.pages())
      return ("The book and the one you compare it to are the same length.");
    else
      return ("The book and the one you compare it to are not the same length.");
  }
}
