public class Test
{
    public static void main(String[] a)
    {
        //1. Create a Bird object and instanciate it as a SnowyOwl. Then print the food the Bird has eaten.
        //Test.
        Bird b1=new SnowyOwl();
        System.out.println(b1.getFood());


        //2. Create two Bird objects and instanciate them as ElfOwls with different locations.
        Bird b2=new ElfOwl("US");
        Bird b3=new ElfOwl("Mexico");


        //3. Print the location of the first object in 2. You will have to cast it. (Why?)
        System.out.println(((ElfOwl)b2).getLocation());

        //4. Create an array of Bird objects using the three birds you created in 1. and 2. Call it birdArray
        Bird[] birdArray=new Bird[]{b1,b2,b3};

        //5. Create a BirdSantuary object called owls using the array of Birds from 4.
        BirdSanctuary owls=new BirdSanctuary(birdArray);

        //6.Test the print method on owls
        owls.print();

        //7. Write a line of code that prints the noise made by the first bird in the sanctuary. Test.
        System.out.println(owls.getBirds()[0].getNoise());

        //8. Write a line of code that prints the name of the last bird in the sanctuary.
        System.out.println(owls.getBirds()[owls.getBirds().length-1].getName());

        //9. Create a Bird and instantiate as a Bird. What is the error produce?
        //Bird b=new Bird("Finch","tweet"); bIrD iS aBsTrAcT, cAnNoT bE iNsTaNtIaTeD



    }
}
