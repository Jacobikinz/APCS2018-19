public class Person
{
    //A person has a telephone number as well as a name
    private String name;
    private TelephoneNumber num;
    
    /**
     * Create a person with given name and telephone number
     */
    public Person(String n, TelephoneNumber t)
    {
        name = n;
        num = t;
    }
   
    /**
     * Set a new name for this person.
     */
    public void setName(String newName){
        name = newName;
    }    
   

    /**
     * Return the name of this person.
     */
    public String getName()
    {
        return name;
    }
    
    /**
     * Set a telephone number for this person.
     */
    public void setTelephoneNumber(TelephoneNumber t)
    {
        num = t;
    }
    
   
    /**
     * Return the telephone number of this person.
     */
    public TelephoneNumber getTelephoneNumber()
    {
        return num;
    }
    
    
    /**
     * Return a string representation of this object.
     */
    public String toString()
    {
        return name + "\n" + num + "\n";
    }
    
    public boolean checkAreaCode(Person other){
      return(this.getTelephoneNumber().getAreaCode()==(other.getTelephoneNumber().getAreaCode()));
    }
    //create a method named checkAreaCode that acceptas a Person as a parameter (called other) and 
    //returns true if this person's area code is equal to other's area code, false otherwise. The header is:
    //public boolean checkAreaCode(Person other)
   
    
}

        


