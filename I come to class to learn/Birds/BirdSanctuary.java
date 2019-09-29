public class BirdSanctuary
{
    /** The list of birds */
    private Bird[] birdList;

    public BirdSanctuary(Bird[]b)
    {
        birdList = b;
    }
    //1. implement a getter method for the instance variable
    public Bird[] getBirds(){
      return birdList;
    }


    //2.Complete the body of the print method as descibed below
    /** Precondition: Each Bird in birdList has a getFood
    * method implemented for it.
    * Postcondition: For each Bird in the birdList array, its name is printed
    * followed by the result of a call to its getFood
    * method, followed by its location (if appropiate), one line per Bird.
    * You migth have to use instanceof
    */
    public void print()
    {
      for(Bird b:birdList){
        if(b instanceof ElfOwl){
          System.out.println(b.getName()+" ate a "+b.getFood()+" at "+((ElfOwl)b).getLocation());
        }
        else if(b instanceof Owl){
          System.out.println(b.getName()+" ate a "+b.getFood());
        }
      }
    }
}
