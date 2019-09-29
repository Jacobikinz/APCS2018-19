public class TelephoneNumber
{
    private int areacode;
    private int number;
    
    /**
     * Constructor for objects of class TelephoneNumber
     */
    public TelephoneNumber(int a, int n)
    {
        areacode = a;
        number = n;
    }

    /**
     * returns area code
     */
    public int getAreaCode()
    {
        return areacode;
    }
    
    /**
     * returns number (without area code)
     */
    public int getNumber()
    {
        return number;
    }
    
   
    /**
     * returns String representation of telephone number
     */
    public String toString()
    {
        return "(" + areacode + ")" + number;  
    }
    
}
