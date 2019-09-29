/**
* Jacob Urisman
* Comp Sci
*/

import java.util.*;
import java.text.*;

public class DayOfTheWeek {
  public static void main(String[] args) {
    int month,day,year,week,y,c,year2;
    String monthWord,weekday;
    Scanner read=new Scanner(System.in);
    System.out.println("Give me a date and I will give you the day of week.");
    System.out.print("Month (as a number): ");
    month=read.nextInt();
    System.out.print("Day: ");
    day=read.nextInt();
    System.out.print("Year (all 4 digits): ");
    year=read.nextInt();
    year2=year;
    switch(month){
      case 1:
        monthWord="January";
        break;
      case 2:
        monthWord="February";
        break;
      case 3:
        monthWord="March";
        break;
      case 4:
        monthWord="April";
        break;
      case 5:
        monthWord="May";
        break;
      case 6:
        monthWord="June";
        break;
      case 7:
        monthWord="July";
        break;
      case 8:
        monthWord="August";
        break;
      case 9:
        monthWord="September";
        break;
      case 10:
        monthWord="October";
        break;
      case 11:
        monthWord="November";
        break;
      default:
        monthWord="December";
        break;
    }
    if(month<3){
      month=10+month;
      year=year-1;
    }
    else{
      month=month-2;
    }
    c=(int)(year/100);
    y=year%100;
    week=(day+(int)(2.6*month-0.2)+y+(y/4)+(c/4)-2*c)%7;
    switch(week){
      case 1:
        weekday="Monday";
        break;
      case 2:
        weekday="Tuesday";
        break;
      case 3:
        weekday="Wednesday";
        break;
      case 4:
        weekday="Thursday";
        break;
      case 5:
        weekday="Friday";
        break;
      case 6:
        weekday="Saturday";
        break;
      default:
        weekday="Sunday";
        break;
    }
    System.out.println(monthWord+" "+day+", "+year2+" is a "+weekday);
  }
}
