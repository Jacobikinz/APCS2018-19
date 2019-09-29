public class OldMcDonald
{
    private FarmAnimal[] animals;
    
    public OldMcDonald(FarmAnimal[] f)
    {
        animals = f;
    }
    
    public void sing()
    {
        for(FarmAnimal a: animals)
        {
            System.out.println("Old McDonald had a farm, eieio"
             + "\nAnd on his farm he had a " + a.getName()+", eieio"
             + "\nWith a " + a.getNoise() +" "+ a.getNoise() + " here and a " +a.getNoise()+" "+ a.getNoise() + " there"
             + "\nHere a " + a.getNoise() +" there a "+a.getNoise()+ 
                " everywhere a " +a.getNoise()+ " "+ a.getNoise()
             + "\nOld mcdonald had a farm, eieio");
             System.out.println();
         }
        
        
    }
}




