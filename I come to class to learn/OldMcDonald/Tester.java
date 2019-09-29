public class Tester{
  public static void main(String[] args) {
    Pig jeffrey=new Pig();
    Sheep john=new Sheep();
    Cow mark=new Cow();
    FarmAnimal[] animals=new FarmAnimal[]{jeffrey,john,mark};
    OldMcDonald farm=new OldMcDonald(animals);
    farm.sing();
  }
}
