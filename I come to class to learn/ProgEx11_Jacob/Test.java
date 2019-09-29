/**
 * Tester
 *
 * @author Jacob Urisman
 * @version 3/31/19
 */
public class Test{
  public static void main(String[] args) {
    Athlete a1=new Footballer(17,181,"Forward",650000);
    Athlete a2=new Fencer(172,"Foil");
    Footballer f1=new Footballer(10,163,"Midfielder",258000000);
    Fencer f2=new Fencer(185,"Epee");

    a1.changeTeam("Barcelona");
    f1.changeTeam("Liverpool");
    a1.newStrategy();
    f1.newStrategy();
    f1.goodSeason();
    System.out.println(a1.toString());
    System.out.println(f1.toString());
    a1.equals(f1);
    a2.changeTeam("Halberstadt");
    f2.changeTeam("M Team");
    a2.newStrategy();
    f2.newStrategy();
    f2.trySomethingNew();
    System.out.println(a2.toString());
    System.out.println(f2.toString());
    a2.equals(f2);
    System.out.println(f1.difference(a2));
    System.out.println(f2.difference(a2));
  }
}
