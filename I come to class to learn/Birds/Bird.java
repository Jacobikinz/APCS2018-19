public abstract class Bird
{
    private String name;
    private String noise;
    
    /** Constructor for objects of class Bird */
    public Bird(String birdName, String birdNoise)
    {
        name = birdName;
        noise = birdNoise;
    }
    
    public String getName()
    { 
        return name; 
    }
    
    public String getNoise()
    { 
        return noise; 
    }
    
    //returns the type of food eaten by the Bird
    public abstract String getFood();
}
    
