/**
* @author Jacob Urisman
* @version 11/12/18
* Comp Sci
*/
public class CircleTester
{
    public static void main(String[] args) {
      Circle cir1=new Circle(10,"red");
      Circle cir2=new Circle(5,"blue");
      cir1=cir2;
      System.out.println(cir2.getColor());
      System.out.println(cir1.equals(cir2));
    }
}
