/**
 * @author Jacob Urisman
 * @version 11/5/18
 * Comp Sci
 * Palindrome and Pig Latin
 */

//My common header in case I need any of these classes
import java.util.*;
import java.text.*;
import javax.swing.*;

public class ProgEx5_Jacob {
  public static void main(String[] args) {
    String test=JOptionPane.showInputDialog(null,"Type 'Palindrome' to test for palindrome\nType 'to Latin' to convert to pig latin.\nType 'from Latin' to convert from pig latin.\nType 'Bye' to leave at anytime."),test2;
    while(!test.equalsIgnoreCase("bye")){
      if(test.equalsIgnoreCase("palindrome")){
        test2=JOptionPane.showInputDialog(null,"Enter Statement");
        if(isPalindrome(test2))
          JOptionPane.showMessageDialog(null,test2+" is a palindrome.");
      }
      else if(test.equalsIgnoreCase("to latin")){
        test2=JOptionPane.showInputDialog(null,"Enter Statement");
        JOptionPane.showMessageDialog(null,toPigLatin(test2));
      }
      else if(test.equalsIgnoreCase("from latin")){
        test2=JOptionPane.showInputDialog(null,"Enter Statement");
        JOptionPane.showMessageDialog(null,fromPigLatin(test2));
      }
      //Easter egg
      else if(isPalindrome(test))
        JOptionPane.showMessageDialog(null,"Don't get ahead of yourself.");
      test=JOptionPane.showInputDialog(null,"Type 'Palindrome' to test for palindrome\nType 'to Latin' to convert to pig latin.\nType 'from Latin' to convert from pig latin.\nType 'Bye' to leave at anytime.");
    }
  }
  /**
   * Checks if string is a palindrome
   * @param str
   * uses simplifyString and reverseString within method
   * @return boolean stating whether string is a palindrome
   */
  public static boolean isPalindrome(String str){
    String newStr=simplifyString(str);
    String newStr2=reverseString(str);
    if(newStr.equals(newStr2)){
      return true;
    }
    return false;
  }
  /**
   * Simplifies a string
   * @param str
   * @return string without spaces
   */
  public static String simplifyString(String str){
    String newStr="";
    for(int i=0;i<str.length();i++){
      if(!str.substring(i,i+1).equals(" ")){
        newStr+=str.substring(i,i+1).toLowerCase();
      }
    }
    return newStr;
  }
  /**
   * Simplifies and reverses a string
   * @param str
   * @return reversed string without spaces
   */
  public static String reverseString(String str){
    String newStr=simplifyString(str);
    String newStr2="";
    for(int i=newStr.length();i>0;i--){
      newStr2+=newStr.substring(i-1,i);
    }
    return newStr2;
  }
  /**
   * Turns a string into Pig Latin
   * @param str
   * @return Pig-Latin-ized string
   */
  public static String toPigLatin(String str){
    StringTokenizer st= new StringTokenizer(str);
    String result="",preresult;
    while(st.hasMoreTokens()){
      preresult=st.nextToken();
      result+=preresult.substring(1)+preresult.substring(0,1)+"ay ";
    }
    return result;
  }
  /**
   * Turns a string into English from Pig Latin
   * @param str
   * @return Un-Pig-Latin-ized string
   */
  public static String fromPigLatin(String str){
    StringTokenizer st= new StringTokenizer(str);
    String result="",preresult;
    while(st.hasMoreTokens()){
      preresult=st.nextToken();
      result+=preresult.substring(preresult.length()-3,preresult.length()-2)+preresult.substring(0,preresult.length()-3);
    }
    return result;
  }
}
